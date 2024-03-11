<?php 
    include "Conexion.php";

    if(!empty($_POST["id_usuario"])  || !empty($_GET["id_usuario"])){
        $id_usuario = (!empty($_POST["id_usuario"])) ? $_POST["id_usuario"] : $_GET["id_usuario"] ;

        $consulta = $base_de_datos->prepare("SELECT id,id_usuario,cant_preguntas,cant_ok,cant_error,fecha_inicio FROM cuestionarios WHERE id_usuario = :idu");
        $consulta->bindParam(":idu", $id_usuario);
        // Ejecutar consulta
        $consulta->execute();

        // Traer los datos
        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

        // Sirve para que acepte los textos con tilde.
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");
   
        if($datos){
            $respuesta = [ 
                        "status" => true,
                        "message" => "QUESTIONARIE##FOUNT",
                        "cuestionarios" =>$datos

                    ];
            echo json_encode($respuesta);

        }else{
            $respuesta = [ 
                        "status" => false,
                        "message" => "QUESTIONARIE#NOT#FOUNT",

                    ];
            echo json_encode($respuesta);
        }

    }else{
        $respuesta = [
                        "status" => 403,
                        "message" => "ERROR#DATA"
                    ];
        echo json_encode($respuesta);
    }
?>


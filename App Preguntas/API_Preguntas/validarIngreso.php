<?php 
    include "Conexion.php";

    if((!empty($_POST["correo"]) && !empty($_POST["password"])) || (!empty($_GET["correo"]) && !empty($_GET["password"]))){
        $correo = (!empty($_POST["correo"])) ? $_POST["correo"] : $_GET["correo"] ;
        $password = (!empty($_POST["password"])) ? md5($_POST["password"])  : md5($_GET["password"]) ;


        $consulta = $base_de_datos->prepare("SELECT id_usuario,nombres FROM usuarios WHERE correo = :cor AND password = :pas");
        $consulta->bindParam(":cor", $correo);
        $consulta->bindParam(":pas", $password);
        // Ejecutar consulta
        $consulta->execute();

        // Traer los datos
        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

        // Sirve para que acepte los textos con tilde.
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");
        
        if($datos){
            $respuesta = [ 
                        "status" => true,
                        "message" => "USER##FOUNT",
                        "usuario" =>$datos[0]

                    ];
            echo json_encode($respuesta);

        }else{
            $respuesta = [ 
                        "status" => false,
                        "message" => "USER#NOT#FOUNT",

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
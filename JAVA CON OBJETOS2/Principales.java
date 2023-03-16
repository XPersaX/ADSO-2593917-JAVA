import java.util.Scanner;

public class Principales{
	public static void main(String[] args) {

		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		int opcion = 0;
		int pos_disponible = 0;
		Personas arreglo [] = new Personas [10];
		int Modificar=0;
		int selecciono=0;

		do{
			System.out.println("||---------------------------------------------||");
			System.out.println("||------------ PERSONAS -----------------------||");
			System.out.println("||---------------------------------------------||");
			System.out.println("||------- Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+" -           ||");
			System.out.println("||                                             ||");
			System.out.println("||   1. Registrar Persona.                     ||");
			System.out.println("||   2. Ver Clientes Registrados               ||");
			System.out.println("||   3. Modificar Imformacion del cliente.     ||");
			System.out.println("||   4. Ver Imformacion Del Cliente.           ||");
			System.out.println("||   5. Eliminar Cliente.                      ||");
			System.out.println("||   6. Salir                                  ||");
			System.out.println("||-------------------------------------------  ||");
			System.out.print("||=> Ingrese una opcion: ");
			opcion = entrada_numero.nextInt();

			if (opcion == 1) {
				System.out.print("||=> Ingrese el documento: ");
				int documento = entrada_numero.nextInt();

				System.out.print("||=> Ingrese los nombres: ");
				String nombres = entrada_texto.nextLine();

				System.out.print("||=> Ingrese los apellidos: ");
				String apellidos = entrada_texto.nextLine();

				System.out.print("||=> Ingrese la direccion: ");
				String direccion = entrada_texto.nextLine();

				System.out.print("||=> Ingrese el telefono: ");
				String telefono = entrada_texto.nextLine();

				Personas temporal = new Personas(documento, nombres, apellidos, direccion, telefono);
				
				boolean valido = true;
				for (int i=0; i<pos_disponible; i++) {
					if (temporal.getDocumento() == arreglo[i].getDocumento()) {
						valido = false;
						System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
						break;
					}
				}
				if (valido) {
					arreglo[pos_disponible] = temporal;
					pos_disponible++;
					System.out.println("||===> REGISTRADO CON EXITO \n\n");
				}

			}else if (opcion == 2) {
				System.out.println("Clientes registrados:");
				for(int i=0;i<pos_disponible;i++){
					arreglo[i].mostrarResumenDatos();
					
				}

			}else if (opcion == 3) {
			    for(int i=0;i<pos_disponible;i++){
					arreglo[i].mostrarResumenDatos();
				}
				System.out.println("Ingrese el numero de documento del cliente que dea moficar");
				Modificar=entrada_numero.nextInt();
				do{
					for (int i=0;i<pos_disponible;i++){
					   if(Modificar==arreglo[i].getDocumento()){
							System.out.println("||----------------------------||");
							System.out.println("||------Datos a Modificar-----||");
							System.out.println("||-----1.Moficiar Documento---||");
							System.out.println("||-----2.Modificar Nombre-----||");
							System.out.println("||-----3.Modificar Apellido---||");
							System.out.println("||----------4.Salir-----------||");
							System.out.print("Que dato desea moificar");
							selecciono=entrada_numero.nextInt();
							if(selecciono==1){
								System.out.println("Ingrese el nuevo numero del documento");
								int nuevo_documento=entrada_numero.nextInt();
								boolean valido=true;
								for(int c=0;c<pos_disponible;c++){
									if(nuevo_documento.getDocumento()==arreglo[c].getDocumento()){
										valido=false;
										System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
						                break;
									}
								}
								if(valido){
									arreglo[pos_disponible]==nuevo_documento.;
									pos_disponible++;
									System.out.println("EL NUMERO DEL DOCUMENTO FUE MODIFICADO.");
								}
								if(selecciono==2){
									System.out.print("Ingrese el ");
								}
								
							}
					    }  
					}

				}while(selecciono!=4);
					
			
			}else if(opcion==4){

			}else if(opcion==5){

			}else if (opcion == 6) {
				System.out.println("|| ============ SALIENDO ===========||");
			}else{
				System.out.println("||----------------------------------||");
				System.out.println("|| ========= OPCION INVALIDA =======||");
				System.out.println("||----------------------------------||");
			}

		}while(opcion!=4);

	}
}
/*AUTOR: Javier Ispierto Luis 
 * FECHA: 28/11/2018
 * MATERIA: Programación
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		rectangulo uno = null;
		int opc , opc1;
		do {
			
				try {
					System.out.println("Elija una opcion:");
					System.out.println("0.-Salir.");
					System.out.println("1.-Crear.");
					System.out.println("2-Modificar.");
					System.out.println("3.-Borrar.");
					opc = t.nextInt();
				} catch (Exception e) {
					t.next();
					opc = 5;
				}
			
			switch (opc) {
			
			case 0: 
				
				System.out.println("Adios");
				break;
				
			case 1: // CASO DE CREACIÓN DEL RECTANGULO
				System.out.println("Creación del rectángulo");
				int b, a;

				try {
					System.out.print("Alto: ");
					a = t.nextInt();
					System.out.print("Ancho: ");
					b = t.nextInt();

					uno = new rectangulo(a, b);
				}

				catch (Exception e) {
					System.out.println("Tipo de Error: " + e.getMessage());
					e.printStackTrace();
					t.next();
					uno = new rectangulo();
				}

				// MUESTRA LOS DATOS INTRODUCIDOS
				System.out.println("Valor de alto: " + uno.getAlto());
				System.out.println("Valor de ancho: " + uno.getAncho());
				break;

			case 2: // CASO DE MODIFICACIÓN DE LOS DATOS
				do {
					try {
						System.out.println("1.-Cambiar Alto.");
						System.out.println("2.-Cambiar Ancho.");
						System.out.print("Opcion:");
						opc1 = t.nextInt();

					} catch (Exception e) {
						t.next();
						opc1 = 5; // Se pone para que el while siga funcionando
					}
				} while ((opc1 != 1) && (opc1 != 2));

				if (opc1 == 1) {
					try {
						System.out.print("Nuevo alto: ");
						a = t.nextInt();
						uno.setAlto(a);
					} catch (Exception e) {
						t.next();

					}
				} else {
					try {
						System.out.print("Nuevo ancho: ");
						b = t.nextInt();
						uno.setAncho(b);
					} catch (Exception e) {
						t.next();

					}
				}
				// MUESTRA LOS DATOS MODIFICADOS
				System.out.println("Valor de alto: " + uno.getAlto());
				System.out.println("Valor de ancho: " + uno.getAncho());
				
				break;

			case 3: // CASO ELIMINAR
				uno.eliminar();
				break;
			default :
				System.out.println("Opcion incorrecta");
				break;
			}
			
			System.out.println();
			System.out.println("Numero de rectangulos: " + uno.contador() + " rectangulos.");
			System.out.println();
			
		} while (opc != 0);
	}
}


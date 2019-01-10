import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class EjercicioClase_Objeto {

	static rectangulo uno = null;
	static Circulo dos = null;
	static triangulo tres = null;

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int opc = 0, opc1 = 0, opc2 = 0;

		do {

			try {
				System.out.println("Elija una opcion:");
				System.out.println("0.-Salir.");
				System.out.println("1.-Crear/Modificar Rectangulo.");
				System.out.println("2-Crear/Modificar Triangulo.");
				System.out.println("3-Crear/Modificar Circulo.");
				System.out.println("4.-Calcular el area de las figuras.");
				System.out.println("5.-Calcular el perimetro de las figuras.");
				opc = t.nextInt();
			} catch (Exception e) {
				t.next();
				opc = 5;
			}

			switch (opc) {

			case 0:
				System.out.println("Adios");
				break;

			// CREAR/MODIFICAR RECTANGULO
			case 1:
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

			// -----------------------
			// CREACION DEL TRIANGULO
			// -----------------------
			case 2:
				System.out.println("Creación del triangulo");
				int bas, h, ang;
				int c;

				try {
					System.out.print("Base: ");
					bas = t.nextInt();
					System.out.print("Altura: ");
					h = t.nextInt();
					System.out.println("Angulo: ");
					ang = t.nextInt();
					tres = new triangulo(bas, h, ang);
				} catch (Exception e) {
					System.out.println("Tipo de Error: " + e.getMessage());
					e.printStackTrace();
					t.next();
					tres = new triangulo();
				}

				System.out.println("Valor de base: " + tres.getBase());
				System.out.println("Valor de altura: " + tres.getAltura());
				System.out.println("Valor de angulo: " + tres.getAngulo());

				do {
					try {
						System.out.println("1.-Cambiar Base.");
						System.out.println("2.-Cambiar Altura.");
						System.out.println("3.-Cambiar el Angulo.");
						System.out.print("Opcion:");
						opc2 = t.nextInt();

					} catch (Exception e) {
						t.next();
						opc2 = 5; // Se pone para que el while siga funcionando
					}
				} while ((opc2 != 1) && (opc2 != 2) && (opc2 != 3));

				switch (opc2) {

				case 1:
					try {
						System.out.print("Nueva Base: ");
						a = t.nextInt();
						tres.setBase(a);
					} catch (Exception e) {
						t.next();
					}
					break;

				case 2:
					try {
						System.out.print("Nueva Altura: ");
						b = t.nextInt();
						tres.setAltura(b);
					} catch (Exception e) {
						t.next();
					}
					break;

				case 3:
					try {
						System.out.print("Nuevo Angulo: ");
						c = t.nextInt();
						tres.setAngulo(c);
					} catch (Exception e) {
						t.next();
					}
					break;
				}
				// VALORES MODIFICADOS
				System.out.println("Valor de base: " + tres.getBase());
				System.out.println("Valor de altura: " + tres.getAltura());
				System.out.println("Valor de angulo: " + tres.getAngulo());

				break;

			// -----------------------
			// CREACION DEL CIRCULO
			// -----------------------
			case 3:

				System.out.println("Creación del Circulo");
				int dato;

				try {
					System.out.print("Radio: ");
					a = t.nextInt();

					dos = new Circulo(a);
				}

				catch (Exception e) {
					System.out.println("Tipo de Error: " + e.getMessage());
					e.printStackTrace();
					t.next();
					dos = new Circulo();
				}

				// MUESTRA LOS DATOS INTRODUCIDOS
				System.out.println("Valor del radio: " + dos.getRadio());

				try {
					System.out.println("Cambiar Radio: ");
					System.out.println();
					System.out.print("Nuevo radio: ");
					dato = t.nextInt();
					dos.setRadio(dato);
				} catch (Exception e) {
					t.next();
				}

				// MUESTRA LOS DATOS MODIFICADOS
				System.out.println("Valor de alto: " + dos.getRadio());

			case 4:
				int ar, at;
				double ac;
				int opc3=0;
				
				
				do {
					
					try {
						System.out.println("Elejir un opcion:");
						System.out.println("1.-Area del rectangulo");
						System.out.println("2.-Area del triangulo");
						System.out.println("3.-Area del circulo.");
						opc3= t.nextInt();
					
						
				} catch (Exception e) {
					System.out.println("Dato incorrecto");
					t.next();
				}
					switch (opc3) {
					
					case 1:
						ar = uno.getAlto() * uno.getAncho();
						System.out.println("El area del rectangulo es igual a:" + ar);
						break;
			
					case 2:
						at = (tres.getBase() * tres.getAltura()) / 2;
						System.out.println("El area del triangulo es igual a: " + at);
						break;
			
					case 3:
						ac = Math.PI * Math.pow(dos.getRadio(), 2);
						System.out.println("El area del circulo es igual a: " + ac);
						break;
				}
				}while (opc3!=0);
				
				break;

			case 5:
				int pr, pt;
				int beta;
				int ang1, c1, c2;
				int opc4 = 0;
				double pc;

				do {
					try {
						System.out.println("Elejir un opcion:");
						System.out.println("1.-Perimetro del rectangulo");
						System.out.println("2.-Perimetro del triangulo");
						System.out.println("3.-Perimetro del circulo.");
						opc4=t.nextInt();

						switch (opc4) {

						case 1:
							pr = (2 * uno.getAncho()) + (2 * uno.getAlto());
							System.out.println("El perimetro del rectangulo es: " + pr);
							System.out.println();
							break;
						case 2:
							pt = ang1 = tres.getAngulo() - 180 - 90;
							c1 = (int) ((int) tres.getAltura() / Math.sin(tres.getAngulo()));
							c2 = (int) (tres.getAltura() / Math.sin(ang1));
							pt = tres.getBase() + c1 + c2;
							System.out.println("El perimetro del triangulo es: " + pt);
							System.out.println();
							break;

						case 3:
							pc = 2 * Math.PI * dos.getRadio();
							System.out.println("El perimetro del circulo es: " + pc);
							System.out.println();
							break;
						}
					} catch (Exception e) {
						System.out.println("Dato incorrecto");
						t.next();

					}

				} while (opc4 != 0);
			}
		} while (opc != 0);

	}
}
	
	

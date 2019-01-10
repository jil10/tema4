import java.util.Scanner;

public class sopa_de_letras {

	public static char s[][] = new char[15][15];
	static Scanner t = new Scanner(System.in);

		

	
	
	
	/*
	 * METODO: public static void posicion().
	 * 
	 * 
	 * DESCRIPCIÓN: En este metodo lo que hace es que pide la palabra y te la coloca aleatoriamente dentro de la sopa de letras.
	 */
	public static void posicion() {

		int f, c, i, k, l,con = 0;
		String pal = null;
		
		do {
			boolean ok = true;

			try {
				do {
					System.out.println("Introduce las palabras que quieres que esten en la sopa de letra :");
					pal = t.next();
					pal = pal.toUpperCase();
				} while ((pal.length() < 3) || (pal.length() > 15));

			} catch (Exception e) {
				t.next();
			}
			con++;

			char pal1[] = pal.toCharArray();

			for (i = 0; i < pal.length(); i++) {
				System.out.println(pal1[i]);
			}

			do {
				
				try {
				f = (int) (Math.random() * 15);
				c = (int) (Math.random() * 15);

				s[f][c] = pal1[0];

				int opc = (int) (Math.random() * (8 - 1) + 1);

				switch (opc) {

				
				case 1: // Diagonal a la derecha hacia arriba 
					for (int j = 1; j < pal.length(); j++) {
						s[f + j][c + j] = pal1[j];

						if (((f + j) > 15) || ((c + j) > 15)) {
							ok = false;
						}
					}
					break;

				case 2:// Vertical hacia abajo.
					for (int j = 1; j < pal.length(); j++) {
						s[f + j][c] = pal1[j];
						
						if ((f+j)>15) {
							ok = false;
						}
					}
					break;

				case 3:// Horizontal de izquierda a derecha.
					for (int j = 1; j < pal.length(); j++) {
						s[f][c + j] = pal1[j];
						
						if((c+j)>15) {
							ok = false;
						}
					}
					break;

				case 4://Vertical hacia arriba .
					for (int j = 1; j < pal.length(); j++) {
						s[f - j][c] = pal1[j];
						
						if ((f+j)<0) {
							ok = false;
						}
					}
					break;

				case 5:// Horizontal hacia la izquierda.
					for (int j = 1; j < pal.length(); j++) {
						s[f][c - j] = pal1[j];
						
						if ((c+j)<0) {
							ok = false;
						}
					}
					break;
					
				case 6: // Diagonal hacia la derecha y hacia arriba.
					for (int j = 1; j < pal.length(); j++) {
						s[f - j][c + j] = pal1[j];
						
						if (((f+j)<0) || ((c+j)> 15 )) {
							ok = false;
						}
					}
					break;

				case 7: // Diagonal hacia la izquierda y hacia abajo 
					for (int j = 1; j < pal.length(); j++) {
						s[f + j][c - j] = pal1[j];
						
						if (((f+j)>15) || ((c+j)<0)) {
							ok = false;
						}
					}
					break;

				case 8: // Diagonal hacia la izquierda y hacia arriba. 
					for (int j = 1; j < pal.length(); j++) {
						s[f - j][c - j] = pal1[j];
						
						if (((f+j)<0) || ((c+j)<0)) {
							ok = true;
						}
					}
					break;
				}
				}
				catch (Exception e) {
				
					
					
				}
			} while (ok == false);
			
		} while (con < 10);

	}

	/*
	 * METODO: public static void sopa(). ENTRADAS: SALIDAS: DESCRIPCIÓN:
	 */

	public static void sopa () {
		int f, c;
		
		for(f =0; f<15 ; f++) {
			for (c=0;c<15;c++) {
				s [f][c] = (char) (Math.random()* 26 + 'A');
				
			}
			System.out.println();
		}
		System.out.println();
		
		
			posicion();
		
		
		for(f =0; f<15 ; f++) {
			for (c=0;c<15;c++) {
				
				System.out.print(" " + s[f][c]);
			}
			System.out.println();
		}
	
	}

	/*
	 * 
	 */
	public static void main(String[] args) {
		int f, c;
		System.out.println("Bienvenido a la sopa de letras");
		System.out.println("------------------------------");

		sopa();

	}

}

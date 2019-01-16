import java.util.Scanner;

public class sopa_de_letras {

	public static char s[][] = new char[15][15];
	static Scanner t = new Scanner(System.in);

	/*
	 * METODO: public static void posicion().
	 * ENTRADA:
	 * SALIDA:
	 * DESCRIPCIÓN: En este metodo lo que hace es que pide la palabra y te la coloca
	 * aleatoriamente dentro de la sopa de letras.
	 */
	public static void posicion() {

		int f, c, i, k, l, con = 0;
		String pal = null;

		System.out.println("Introduce las palabras que quieres que esten en la sopa de letra: ");
		do {
			boolean ok = true;
			boolean print = true;

			try {
				do {
					System.out.println((con + 1) + ": ");
					pal = t.next();
					pal = pal.toUpperCase();
				} while ((pal.length() < 3) || (pal.length() > 15) || (pal.matches(".*[^A-Z].*")));

			} catch (Exception e) {
				t.next();
			}
			con++;

			char pal1[] = pal.toCharArray();

			for (i = 0; i < pal.length(); i++) {

			}

			do {
				ok = true;
				print = true;
				try {
					f = (int) (Math.random() * 15);
					c = (int) (Math.random() * 15);

					s[f][c] = pal1[0];

					if (s[f][c] == pal1[0]) {

					} else {
						print = false;
					}

					int opc = (int) (Math.random() * (8 - 1) + 1);

					switch (opc) {

					case 1: // Diagonal a la derecha hacia abajo

						if (((f + (pal.length() - 1)) > 15) || ((c + (pal.length() - 1)) > 15)) {
							ok = false;
						} else {

							for (int j = 1; j < pal.length(); j++) {
								s[f + j][c + j] = pal1[j];

								if (s[f + j][c + j] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 2:// Vertical hacia abajo.

						if ((f + (pal.length() - 1)) > 14) {
							ok = false;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f + j][c] = pal1[j];

								if (s[f + j][c] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 3:// Horizontal de izquierda a derecha.

						if ((c + (pal.length() - 1)) > 14) {
							ok = false;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f][c + j] = pal1[j];

								if (s[f][c + j] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 4:// Vertical hacia arriba .

						if ((f - (pal.length() - 1)) < 0) {
							ok = false;
						} else {

							for (int j = 1; j < pal.length(); j++) {
								s[f - j][c] = pal1[j];

								if (s[f - j][c] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 5:// Horizontal hacia la izquierda.

						if ((c - (pal.length() - 1)) < 0) {
							ok = false;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f][c - j] = pal1[j];

								if (s[f][c - j] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 6: // Diagonal hacia la derecha y hacia arriba.

						if (((f - (pal.length() - 1)) < 0) || ((c + (pal.length() - 1)) > 15)) {
							ok = false;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f - j][c + j] = pal1[j];

								if (s[f - j][c + j] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 7: // Diagonal hacia la izquierda y hacia abajo

						if (((f + pal.length() - 1) > 14) || (c - (pal.length() - 1) < 0)) {
							ok = false;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f + j][c - j] = pal1[j];

								if (s[f - j][c] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;

					case 8: // Diagonal hacia la izquierda y hacia arriba.

						if (((f - pal.length() - 1) < 0) || ((c - pal.length() - 1) < 0)) {
							ok = true;
						} else {
							for (int j = 1; j < pal.length(); j++) {
								s[f - j][c - j] = pal1[j];

								if (s[f - j][c - j] == pal1[j]) {

								} else {
									print = false;
								}
							}
						}
						break;
					}
				} catch (Exception e) {

				}
			} while ((ok == false) || (print == false));

		} while (con < 10);

	}

	 /* METODO: public static void sopa().
	 * ENTRADAS:
	 * SALIDAS:
	 */

	public static void sopa() {
		int f, c;

		for (f = 0; f < 15; f++) {
			
			for (c = 0; c < 15; c++) {
				s[f][c] = (char) (Math.random() * 26 + 'a');

			}
			
		}
	

		posicion();

		for (f = 0; f < 15; f++) {
			for (c = 0; c < 15; c++) {

				System.out.print(" " + s[f][c]);
			}
			System.out.println();
		}

	}

	/* METODO: public static void main(String[] args).
	 * SALIDAS:
	 * ENTRADAS:
	 */
	public static void main(String[] args) {
		int f, c;
		System.out.println("Bienvenido a la sopa de letras");
		System.out.println("------------------------------");

		sopa();

	}

}

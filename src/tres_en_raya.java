/**
 * AUTOR: Javier Ispierto Luis 
 * FECHA: 08/01/2019
 * VERSION: 1.0
 * DESCRIPCIÓN: Juego de tres en raya. Cada jugador tiene que hacer un movimiento en cada turno dentro de las casillas.
 * Se colocan obligatoriamente tres cada uno y cuando uno de los dos gane se para el juego o cuando el turno se igual a 30.
 */
import java.util.Scanner;

public class tres_en_raya {

	public static char[][] r = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	/*
	 * METODO: public static void tablero();
	 * ENTRADA: void.
	 * SALIDA: Nada.
	 * DESRIPCIÓN: Es el metodo creado para pintar el tablero.
	 */
	public static void tablero() {

		System.out.println("  --- --- --- ");

		System.out.println(" | " + r[0][0] + " | " + r[0][1] + " | " + r[0][2] + " | ");
		System.out.println(" | " + r[1][0] + " | " + r[1][1] + " | " + r[1][2] + " | ");
		System.out.println(" | " + r[2][0] + " | " + r[2][1] + " | " + r[2][2] + " | ");
		System.out.println("  --- --- --- ");

	}

	static int c = 0, f = 0;
	static Scanner t = new Scanner(System.in);

	/*	METODO: public static void pos ().
	 * ENTRADA: void.
	 * SALIDA: No sale nada.
	 * DESCRIPCIÓN: Es el metodo que realiza los movimientos de cada jugador con sus posiciones.
	 */
	public static void pos() {
		int a = 0, b, d, i = 0, con = 0, tur;
		char jug = 0;

		boolean flag, win = false;

		// JUGADOR 1.
		do {
			do {

				do {
					System.out.println("Jugador 1.");

					// FILA
					try {
						System.out.println("Introduce la fila 0-2:");
						f = t.nextInt();
					} catch (Exception e) {
						t.next();
						f = -1;
					}
				} while ((f < 0) || (f > 2));

				// COLUMNA
				do {
					try {
						System.out.println("introduce la columna 0-2:");
						c = t.nextInt();
					} catch (Exception e) {
						t.next();
						c = -1;
					}

				} while ((c < 0) || (c > 2));

				if (r[f][c] == ' ') {
					r[f][c] = 'X';
					flag = true;
					jug = 'X';

				} else {
					System.out.println("No puedes sobrescribir.");
					flag = false;
				}

			} while (flag == false);
			tablero();
			comp(jug);

		} while (win == true);

		// JUGADOR 2.

		do {
			do {

				do {

					try {
						System.out.println("Jugador 2.");
						System.out.println("Introduce la fila 0-2:");
						f = t.nextInt();
					} catch (Exception e) {
						t.next();
						f = -1;
					}
				} while ((f < 0) || (f > 2));
				do {
					try {
						System.out.println("introduce la columna 0-2:");
						c = t.nextInt();
					} catch (Exception e) {
						t.next();
						c = -1;
					}

				} while ((c < 0) || (c > 2));

				if (r[f][c] == ' ') {
					r[f][c] = 'O';
					flag = true;
					jug = 'O';

				} else {
					System.out.println("No puedes sobrescribir.");
					flag = false;
				}

			} while (flag == false);
			System.out.println();
			tablero();
			comp(jug);
			con++;
			tur = (30 - con);
			System.out.println("Turno" + con);
			System.out.println("Quedan " + tur + " turnos.");
		} while (win == true);

	}

	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println("Juego de tres en raya");
		System.out.println("---------------------");

		Scanner t = new Scanner(System.in);
		int a = 0, b, d, i = 0, con = 0, tur;
		char jug = 0;

		boolean flag, win = false;

		// JUEGO
		do {
			pos();
		} while (con != 15);

		tablero();

	}

	/*
	 * METODO: public static boolean comp (char jug) ENTRADA: Entra un dato de tipo
	 * char. SALIDA: Sale un dato booleano. DESCRIPCIÓN: Es un metodo en el que se
	 * hace la comprobacíon y cuando uno gane sale un boolean win = true para que el
	 * juego finalice.
	 */
	public static boolean comp(char jug) {
		boolean win = false;

		if (jug == '0') {

		}
		if (jug == 'X') {

		}

		if (r[0][0] == jug) {
			if (r[0][1] == jug) {
				if (r[0][2] == jug) {
					win = true;
				}
			}
		}
		if (r[1][0] == jug) {
			if (r[1][1] == jug) {
				if (r[1][2] == jug) {
					win = true;

				}
			}
		}
		if (r[2][0] == jug) {
			if (r[2][1] == jug) {
				if (r[2][2] == jug) {
					win = true;
				}
			}
		}
		if (r[0][0] == jug) {
			if (r[1][0] == jug) {
				if (r[2][0] == jug) {
					win = true;
				}
			}
		}
		if (r[0][1] == jug) {
			if (r[1][1] == jug) {
				if (r[2][1] == jug) {
					win = true;
				}
			}
		}
		if (r[0][2] == jug) {
			if (r[1][2] == jug) {
				if (r[2][2] == jug) {
					win = true;
				}
			}
		}
		if (r[0][0] == jug) {
			if (r[1][1] == jug) {
				if (r[2][2] == jug) {
					win = true;
				}
			}
		}
		if (r[2][0] == jug) {
			if (r[1][1] == jug) {
				if (r[0][2] == jug) {
					win = true;
				}
			}

		}

		if (win == true) {
			if (jug == 'X') {
				System.out.println("Gana jugador 1");

			}
			if (jug == 'O') {
				System.out.println("Gana jugador 2");

			}
		}

		return win;

	}
}



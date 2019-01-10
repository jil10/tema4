
/**
 * AUTOR: Javier Ispierto Luis
 * FECHA: 02/01/2019
 * DESCRIPCION: Juego Arcade. El juego tiene un menu principal para elejir entre 1 o dos jugadores, opciones y salir.
 * Es el juego de piedra. El menu de opciones hay los controles de los dos jugadores y el nivel de dificultad para 1 jugador.
 * papel o tijera.
 * VERSIÓN: 1.0
 */
import java.util.Scanner;

public class Arcade {

	static Scanner t = new Scanner(System.in);
	public static char[] ran = {'p','h','t'};
	
	/*
	 * METODO: public static void menu () ENTRADA: () SALIDA: void DESCRIPCIÓN:Este
	 * es el metodo que vamos a utilizar para el menu.
	 */
	public static void menu() {
		int opc;
		char j1;
		do {
			do {
				System.out.println("-------JUEGO DE ARCADE-------");
				System.out.println("0.- SALIR ");
				System.out.println("1.- UN JUGADOR ");
				System.out.println("2.- DOS JUGADORES ");
				System.out.println("3.- OPCIONES ");

				System.out.println("-----------------------------");
				opc = t.nextInt();
			} while ((opc < 0) && (opc > 4));

			switch (opc) {

			case 0:
				System.out.println("Gracias por probar el arcade .");
				break;

			case 1:

				jug1();
				break;

			case 2:
				jug2();
				break;

			case 3:
				opciones();
				break;

			}

		} while (opc != 0);
	}

	/*
	 * METODO: public static void opciones () ENTRADA: () SALIDA: void
	 * DESCRIPCIÓN:Este metodo va a contener el menu de opciones.
	 */
	public static void opciones() {
		int opc;
		char d = 0;

		do {
			do {
				System.out.println("-------OPCIONES DE ARCADE-------");
				System.out.println("0.- VOLVER AL MENU ");
				System.out.println("1.- CONTROLES JUGADOR 1 ");
				System.out.println("2.- CONTROLES JUGADOR 2 ");
				System.out.println("3.- NIVEL DE DIFICULTAD PARA JUGADOR 1 ");
				System.out.println("-----------------------------");
				opc = t.nextInt();
			} while ((opc < 0) && (opc > 4));

			switch (opc) {

			case 0:
				menu();
				break;

			case 1:
				System.out.println("Controles jugador 1 ");

				break;

			case 2:
				System.out.println("Controles jugador 2 ");

				break;

			case 3:
				System.out.println("Nivel de dificultad");
				dif();
				break;

			}

		} while (opc != 0);
	}

	/*
	 * METODO: public static void jug1(); ENTRADA: SALIDA: DESCRIPCIÓN:
	 */
	public static void jug1() {
		char a, b ;
		System.out.println("Has elejido 1 jugador");
		System.out.println("Piedra = p / Papel = h / Tijera = t");
		System.out.println("Elije que quieres sacar: ");
		a = t.next().charAt(0);
		b = dif ();
		
		if (a == b) {

		}
		if (a == 't') {
			if (b == 'p') {
				System.out.println("Gana Jugador 2 ");
			}
			if (b == 'h') {
				System.out.println("Gana jugador 1 ");
			}

		}
		if (a == 'h') {
			if (b == 'p') {
				System.out.println("Gana Jugador 1 ");
			}
			if (b == 't') {
				System.out.println("Gana jugador 2 ");
			}

		}
		if (a == 'p') {
			if (b == 't') {
				System.out.println("Gana Jugador 1 ");
			}
			if (b == 'h') {
				System.out.println("Gana jugador 2 ");
			}

		}

		
		
		
	}

	/*
	 * METODO: public static void jug2() ENTRADA: SALIDA: DESCRIPCIÓN:
	 */
	public static void jug2() {
		int tur,cj1=0,cj2=0;
		char a, b;
		System.out.println("Has elejido 2 jugadores.");

		for (int j=0;j<5;j++) {
		
			System.out.println("Piedra = p / Papel = h / Tijera = t");
			System.out.println("Jugador 1: ");
			a = t.next().charAt(0);
			System.out.println("Jugador 2: ");
			b = t.next().charAt(0);

			if (a == b) {

			}
			if (a == 't') {
				if (b == 'p') {
					System.out.println("Gana Jugador 2 ");
					cj2++;
				}
				if (b == 'h') {
					System.out.println("Gana jugador 1 ");
					cj1++;
				}

			}
			if (a == 'h') {
				if (b == 'p') {
					System.out.println("Gana Jugador 1 ");
					cj1++;
				}
				if (b == 't') {
					System.out.println("Gana jugador 2 ");
					cj2++;
				}

			}
			if (a == 'p') {
				if (b == 't') {
					System.out.println("Gana Jugador 1 ");
					cj1++;
				}
				if (b == 'h') {
					System.out.println("Gana jugador 2 ");
					cj2++;
				}

			}

			System.out.println();
			
		}
		System.out.println("El jugador 1 ha ganado " + cj1 + " veces.");
		System.out.println("El jugador 2 ha ganado " + cj2 + " veces.");
		menu();

	}
	
	/* METODO:public static char dif().
	 * ENTRADA: No entra nada.
	 * SALIDA: Sale un dato de tipo char.
	 * DESCRIPCIÓN: Es el metodo utilizado para la realización de la opción de la dificultad.
	 */
	public static char dif() {
		int i,numRandom;
		char let=0;
		
		do {
			System.out.println("1.-Facil");
			System.out.println("2.-Medio");
			System.out.println("3.-Dificil");
			i = t.nextInt();
		} while ((i < 1) && (i > 3));
		
		switch (i) {
		
			case 1:
				numRandom = (int) Math.round(Math.random()*3);
				System.out.println(ran[numRandom]);
				let = ran[numRandom];
				break;

			case 2:
				
				for (int j =0; j<3;j++) {
					System.out.println("Pierdes");
					jug1();
				}
				numRandom = (int) Math.round(Math.random()*3);
				System.out.println(ran[numRandom]);
				let = ran[numRandom];
				break;

			case 3:
				for (int j =0 ; j<5 ; j++) {
					System.out.println("Pierdes");
					jug1();
				}
				numRandom = (int) Math.round(Math.random()*3);
				System.out.println(ran[numRandom]);
				let = ran[numRandom];
				break;

		}
		return let;
		

	}

	/*
	 * METODO PRINCIPAL
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("Bienvenido");
		menu();
	}
}

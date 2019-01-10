import java.util.Scanner;

public class Ejercicio_clase_vectores {

	final static int MAX = 20;

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int[] vector = new int[MAX];
		int a, b, i, num;

		do {
			try {

				System.out.println("Introduzca el primer valor: ");
				a = t.nextInt();
				System.out.println("Introduzca el segundo valor: ");
				b = t.nextInt();
			} catch (Exception e) {
				a = 0;
				b = 101;
			}
		} while (((a < 1) || (a > b)) && ((b < a) || (b > 100)));

		// CREO EL VECTOR
		for (i = 0; i < MAX; i++) {
			vector[i] = (int) (Math.random() * (100 - 1) + 1);

			System.out.print(vector[i] + " ");

		}
		System.out.println();
		// BUSCO LOS VALORES
		for (i = 0; i < MAX; i++) {
			if ((vector[i] > a) && (vector[i] < b)) {
				System.out.print("Valor: " + vector[i]);
				System.out.println(" / Posición: " + i);
			}
		}

		System.out.println();

		/*
		 * for (i=1;i<=100;i++) { for(j=0;j<MAX;j++) { if (vector[j] == i) {
		 * System.out.print(vector[j] + " "); } } } System.out.println();
		 */

		int aux = 0;
		int contador = 0;

		boolean flag = false;
		do {
			flag = false;
			for (i = 0; i < (MAX - 1); i++) {
				if (vector[i] > vector[i + 1]) {
					aux = vector[i + 1];
					vector[i + 1] = vector[i];
					vector[i] = aux;
					contador++;
					flag = true;
				}

			}
		} while (flag != false);
		for (i = 0; i < MAX; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		System.out.println("Veces comparado: " + contador);
		System.out.println();

		try {
			System.out.println("Introduce el numero que quieres buscar: ");
			num = t.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR");
			num = -1;
		}

		// BUSQUEDA SECUENCIAL DE UN NUMERO;

		a = 0;
		b = MAX;
		
		flag = false;

		do {
			i = (a + b) / 2;

			if (vector[i] == num) {
				System.out.println("EL valor " + num + " Esta en la posicion " + i);
				flag = true;
				
			}
			else {
				
				if (vector[i] > num) {
					b = i - 1;
				}
				else {
					a = i + 1;
				}
			}

		} while ((flag == false) && (a < b));

	}
}
		


	

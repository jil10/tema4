import java.util.Scanner;

public class EjercicioVectores {

	final static int MAX = 10;
	 static float[] notas = new float[MAX];
	 
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		// float[] notas = new float[MAX];

		System.out.println("---------------");
		System.out.println("Calculo de media");
		System.out.println("----------------");
		System.out.println();

		// RECOJO LAS NOTAS
		for (int i = 0; i < MAX; i++) {
			do {
				try {
					System.out.println("Introducir nota " + (i + 1) + ": ");
					notas[i] = t.nextFloat();
				} catch (Exception e) {
					System.out.println("Valor introducido no es correcto");
					t.next();
					notas[i] = -1;
				}
			} while ((notas[i] < 0.0) || (notas[i] > 10.0));
		}

			// MUESTRO LAS NOTAS
			for (int i = 0; i < MAX; i++) {
				System.out.println("Nota" + (i + 1) + ": " + notas[i]);

			}
			// CALCULO LA MEDIA
			float media = 0;
			for (int i = 0; i < MAX; i++) {
				media += notas[i];
			}
			System.out.println("La media es: " + media());
		}
	
		public static float media () {
			// CALCULO LA MEDIA
			float media = 0;
			for (int i = 0; i < MAX; i++) {
				media += notas[i];
			}
			return media/MAX;
		}
	}


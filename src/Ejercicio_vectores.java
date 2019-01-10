/**
 * PROGRAMA DE CALCULAR DESVIACIÓN TÍPICA Y MEDIA. AUTOR: Javier Ispierto Luis
 * FECHA: 30/11/2018 VERSION: 1.0 DESCRIPCIÓN: Programa que calcula la
 * desviacion tipica y la media dados el numero de veces que sale un numero
 * determinado al tirar dos dados.
 * 
 */
public class Ejercicio_vectores {
	
	//CREACÍON DE VECTORES
	static int[] sumas = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	static int[] veces = { 3, 8, 9, 11, 20, 19, 16, 13, 11, 6, 4 };
	final static int num = 11;

	public static void main(String[] args) {
		double a = 0, media = 0, dtipica = 0;
		double sumatorio = 0;
		System.out.println("---------------------------");
		System.out.println("calculo desviacion tipica");
		System.out.println("---------------------------");
		System.out.println("Calculo de la media");
		System.out.println("---------------------------");
		System.out.println();

		//FOR PARA SACAR LA MEDIA 
		for (int i = 0; i < 11; i++) {

			media = media + (veces[i] * sumas[i]);
		}
		media /= 120;
		System.out.println("La media es igual a: " + media);
		System.out.println("-------------------------------");

		//FOR PARA SACAR LA DESVIACIÓN TÍPICA
		for (int i = 0; i < 11; i++) {
			sumatorio += sumas[i] * sumas[i] * veces[i];
		}

		dtipica = Math.sqrt((sumatorio / 120) - (media * media));
		System.out.println("La desviación típica es igual a: " + dtipica);
		System.out.println("-------------------------------------");

		double b, c, d, e, porc = 0, porcentaje = 0;
		
		//AQUÍ SE SACA LOS VALORES DEL INTERVALO
		b = media - dtipica;
		c = media + dtipica;
		
		//FOR PARA SACAR EL PORCENTAJE
		for (int i=(int)b ; i <(int)c ; i++) {
			porc += veces[i];
		}
		porcentaje = (porc * 100) / 120;
		System.out.println("El porcentaje es igual a: " + porcentaje + "%");
	}

}

/** NOMBRE: Javier Ispierto Luis
 *  FECHA: 10/12/2018
 *  VERSION: 1.0
 *  DESCRIPCION:
 */

import java.util.Scanner;

public class Ejercicio5_1_puente {
	
	/* METODO:Public static int LongCiclo(int i)
	 * ENTRADAS: Entra la variable i que viene del for del main.
	 * SALIDAS: Devuelve el contador que es el numero de sucesiones.
	 * DESCRIPCIÓN:Este Método lo que hace es que entra un numero en la variable i y si es par se divide entre dos y si es impar 
	 * se multiplica por tres y se suma 1 y el contador guarda el numero de veces que el for se repite y ese numero es lo que le metodo
	 * va a devolver.
	 */
	public static int longCiclo (int i) {
		
		int contador = 1;
		long num = i;
		
		do {
			if (num%2==0) {
				num/=2;
				contador++;
			}
			else {
				num = (num*3)+1;
				contador++;
			}
		}while(num>1);
		
		return contador;
	}
	
	//METODO MAIN.
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		long num1 = 0, num2 = 0;
		int Max = 0;
		
		// INTRODUCIMOS EL PRIMER NUMERO

		do {
			try {
				System.out.println("Introduce un valor mayor que 0");
				num1 = t.nextLong();
			} catch (Exception e) {
				System.out.println("El valor tiene que ser un numero mayor que 0.");
				t.next();
				num1 = -1;
			}
		} while (num1 < 0);

		// INTRODUCIMOS EL SEGUNDO NUMERO.
		do {
			try {
				System.out.println("Introduce un valor mayor que 0");
				num2 = t.nextLong();
			} catch (Exception e) {
				System.out.println("El valor tiene que ser un numero mayor que 0.");
				t.next();
				num2 = -1;
			}
		} while (num2 < 0);
		
			
			
			for ( int i = (int) num1; i<=num2 ; i++) {
				
				if (longCiclo(i)>Max)  Max = longCiclo(i);
				
				else {
					Max = Max;
				}
			}
			System.out.println("La mayor sucesion tiene " + Max + " números");
			
		}
		
	}
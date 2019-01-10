import java.util.Scanner;
public class Ejercicio_5_puente {

	public static void main(String[] args) {
		par();
		
		}
	public static void par() {
		Scanner t= new Scanner (System.in);
		long num=0,n2=0 ,a =0, n=0, x=0;
		long LongCiclo=0;
		do {
			try {
				System.out.println("Introduce un numero mayor que 0:");
				 num = t.nextLong();
			}catch (Exception e) {
				t.next();
			}
		}while(num<=0);
		
		do {
			try {
				System.out.println("Introduzca un numero mayor a 0:");
				 n2 = t.nextLong();
			}catch (Exception e) {
				t.next();
			}
		}while(n2<=0);
		
		
		if (n>n2) {
			for (x = 0; n==n2; n--) {
				
				LongCiclo(n);
			}
				
			
		}else {
			for (x=0; n==n2;n2--) {
				
				LongCiclo(n2);
			}
		}
		}
	
	public static long LongCiclo(long n) {
		long orig=n, i=0;
		for(i=0;n!=1;i++) {
			if (i!=n) {
				if (n%2==0) {
					n/=2;
					System.out.println(n+ " ");
				} else {
					n *=3 + 1;
					System.out.println(n+ " ");
				}
			}else {
				System.out.println(n + "");
				
			}
		}
		System.out.println("Se repite" + i);
		return i;
			
		}
			
	}



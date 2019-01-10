
public class triangulo {

	static int numtriangulo = 0;

		private int base;
		private int altura;
		private int angulo;
		
		triangulo(){
			base=1;
			altura=1;
			angulo=90;
			numtriangulo++;
		}
		
		public triangulo(int bas, int h, int ang) {
			base = bas;
			altura = h;
			angulo = ang;
			numtriangulo++;
		}
		
		public int getBase() {
			return this.base;
		}
		
		public int getAltura() {
			return this.altura;
		}
		
		public int getAngulo() {
			return this.angulo;
		}
	
		public triangulo setBase(int bas) {
			this.base = bas;
			return this;
		}
		
		public void setAltura(int h	) {
			this.altura=h;

		}
		
		public void setAngulo(int ang	) {
			this.angulo=ang;

		}
		
	
			
			
		}
		



public class Circulo {


	static int numcirculo = 0;

	private int radio;

	
	Circulo(){
		radio=1;
		numcirculo++;
	}
	
	public Circulo(int r) {
		radio=r;
		numcirculo++;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	
	public Circulo setRadio(int r) {
		this.radio = r;
		return this;
	}

}

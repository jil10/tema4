/**CLASE RECTANGULO
 * AUTOR: Javier Ispierto Luis 
 * FECHA: 28/11/2018
 * VERSI�N: 1.0
 * Despripcion:Clase para objetos con propiedades
 * Atributos: alto y ancho
 * 
 */
public class rectangulo {
	
	//MIEMBRO EST�TICO	
	static int numrectangulo = 0;
	
	
	// ATRIBUTOS
	private int alto;
	private int ancho;
	
	//CONSTRUCTOR
	rectangulo(){
		alto=1;
		ancho=1;
		numrectangulo++;
	}
	
	/* nombre:		rectangulo(int al, int an)
	 * Entradas:	int al-> Describe la altura del rectangulo
	 * 				int an-> Describe la anchura del rectangulo
	 * Salidas:		Genera el objeto 
	 * Descripci�n: Constructor
	 */
	public rectangulo(int al, int an) {
		alto = al;
		ancho = an;
		numrectangulo++;
	}
	
	public int getAlto() {
		return this.alto;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	
	/* nombre:		rectangulo setAlto(int al)
	 * Entradas:	int al-> Describe la altura del rectangulo
	 * Salidas:		rectangulo-> Objeto con la altura modificada
	 * Descripci�n: Metodo que modifica el atributo "alto" del objeto
	 */
	public rectangulo setAlto(int al) {
		this.alto=al;
		return this;
	}
	
	public void setAncho(int an	) {
		this.ancho=an;

	}
	
	/* nombre:		int contador()
	 * Entradas:	void
	 * Salidas:		int ->devuelve el numero de rect�ngulos creados 
	 * Descripci�n: Metodo devuelve el atributo estatico "numrectangulo"
	 */
	public static int contador () {
		return numrectangulo;
	}
	
	/* nombre:		rectangulo setAncho(int an)
	 * Entradas:	int an-> Describe la ancho del rectangulo
	 * Salidas:		void
	 * Descripci�n: Metodo que modifica el atributo "ancho" del objeto
	 */
	public static void eliminar() {
		if(numrectangulo>0) 
		numrectangulo--;
	}
	
}
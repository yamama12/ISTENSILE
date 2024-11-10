package CuisineAnciens;

abstract public class Assiette extends Ustensile {

	public Assiette(int anne) {
		super(anne);
	}
	
	abstract public double CalculerSurface() ;
}

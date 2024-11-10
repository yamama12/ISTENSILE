package CuisineAnciens;


public class AssietteCarree extends Assiette {
	private double cote;

	public AssietteCarree(int anne, double cote) {
		super(anne);
		this.cote = cote;
		this.valeur = ValeurAssietteCarree();
	}
	
	@Override
	public String toString() {
		return "AssietteCarree [cote=" + cote + ", anne=" + anne + ", valeur=" + valeur + "]";
	}



	public double CalculerSurface() {
		return cote*cote;
	}
	
	public int  ValeurAssietteCarree() {
		return 2 * super.getValeur();

	}
	
	public boolean equals (Object o) {
		if(super.equals(o)) {
			return ((AssietteCarree) o).cote==this.cote;
		}
		else {
			return false;
		}
	}

}

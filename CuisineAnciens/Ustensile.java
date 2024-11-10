package CuisineAnciens;

public class Ustensile {
	protected int anne;
	protected int valeur ;

	public Ustensile(int anne) {
		this.anne = anne;
	}
	

	@Override
	public String toString() {
		return "Ustensile [anne=" + anne + "]";
	}


	public int getValeur() {
		return valeur;
	}
	
	@Override
	public boolean equals (Object o) {
		if (o!=null && o.getClass()==this.getClass()) {
			return false ;
		}
		if (((Ustensile) o).anne==this.anne) {
			return true;
		}
		else {
			return false;
		}
		
	}



	
}

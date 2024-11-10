package CuisineAnciens;

import java.time.LocalDate;

public class AssietteRonde extends Assiette {
	private double rayon ;

	public AssietteRonde(int anne, double rayon) {
		super(anne);
		this.rayon = rayon;
		this.valeur = ValeurAssietteRonde();
	}


	
	@Override
	public String toString() {
		return "AssietteRonde [rayon=" + rayon + ", anne=" + anne + ", valeur=" + valeur + "]";
	}



	public double CalculerSurface() {
		return 3.14*rayon*rayon;
	}
	
	public int ValeurAssietteRonde() {
		if (super.anne>50) {
			return (int) ((LocalDate.now().getYear())-50);
		}
		else {
			return 0;
		}
	}
	
	public boolean equals (Object o) {
		if(super.equals(o)) {
			return ((AssietteRonde) o).rayon==this.rayon;
		}
		else {
			return false;
		}
	}	

}

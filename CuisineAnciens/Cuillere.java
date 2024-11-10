package CuisineAnciens;

import java.time.LocalDate;

public class Cuillere extends Ustensile {
	private double longuer;

	public Cuillere(int anne, double longuer) {
		super(anne);
		this.longuer = longuer;
		this.valeur = ValeurCuillere();
	}

	
	@Override
	public String toString() {
		return "Cuillere [longuer=" + longuer + ", anne=" + anne + ", valeur=" + valeur + "]";
	}


	public int ValeurCuillere() {
		if (super.anne>30) {
			return (int) ((LocalDate.now().getYear())*0.5);
		}
		else {
			return 0;
		}
	}

	
	public boolean equals (Object o) {
		if(super.equals(o)) {
			return ((Cuillere) o).longuer==this.longuer;
		}
		else {
			return false;
		}
	}

}

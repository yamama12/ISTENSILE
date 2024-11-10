package CuisineAnciens;

public record Collection() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);
        AfficheCollection(us);
        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }

    static void AfficheCollection(Ustensile us[]) {
        for (int i = 0; i < us.length; i++) {
            System.out.println(us[i]);
        }
    }

    static void afficherCuilleres(Ustensile us[]) {
        int s = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuillere) {
                s++;
            }
        }
        System.out.println("Il y a " + s + " cuillere" + (s > 1 ? "s" : ""));
    }

    static void afficherSurfaceAssiettes(Ustensile us[]) {
        double surface = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Assiette) {
                surface += ((Assiette) us[i]).CalculerSurface();
            }
        }
        System.out.println("Surface totale des assiettes : " + surface);
    }

    static void afficherValeurTotale(Ustensile us[]) {
        double valeurTotale = 0;
        for (int i = 0; i < us.length; i++) {
            valeurTotale += us[i].getValeur();
        }
        System.out.println("Valeur totale des ustensiles : " + valeurTotale);
    }
}
		
		
		
		

		




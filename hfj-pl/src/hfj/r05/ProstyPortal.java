package hfj.r05;
class ProstyPortal{
	int[] polozeniePol;
	int iloscTrafien;

	String sprawdz(String poleString){
		// konwersja lancucha znakow na liczbe calkowita
		int pole = Integer.parseInt(poleString);
		// utworzenie zmiennej, ktora bedzie 
		// przechowywac wynik metody;
		// poczatkowo jest w niej zapisywany
		// lancuch "pudlo" (zakladamy, ze gracz spudlowal)
		String wynik="pudlo";

		for(int i=0; i<polozeniePol.length; i++){
			if(pole=polozeniePol[i]){
				wynik="trafiony";
				iloscTrafien++;
				break;
			}
		}
		if(iloscTrafien==polozeniePol.length){
			wynik="zatopiony";
		}
		System.out.println(wynik);
		return wynik;

		return wynik;
	}
	void setPolaPolozenia(int[] ppol){
		
	}
}

package r6;
class ProstyPortal{

	int[] polozeniePol;
	int iloscTrafien;

	void setPolaPolozenia(int[] ppol){
		polozeniePol=ppol;
	}

	String sprawdz(String poleString){
		int pole = Integer.parseInt(poleString);
		String wynik="pudlo";
		for(int i=0; i<polozeniePol.length; i++){
			if(pole==polozeniePol[i]){
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
	} // koniec metody
} // koniec klasy

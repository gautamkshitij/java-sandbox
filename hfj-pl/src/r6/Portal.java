package r6;

import java.util.ArrayList;

public class Portal {
	
	private ArrayList<Object> polaPolozenia;
	private String nazwa;
	
	public void setPolaPolozenia(ArrayList ppol){
		polaPolozenia=ppol;
	}
	
	public void setNazwa(String nzwPortalu){
		nazwa = nzwPortalu;
	}
	
	public String sprawdz(String ruch){
		String wynik = "pudlo";
		int indeks = polaPolozenia.indexOf(ruch);
		if(indeks>=0){
			polaPolozenia.remove(indeks);
			if(polaPolozenia.isEmpty()){
				wynik = "zatopiony";
				System.out.println("Auc! Zatopiles portal "+nazwa+" :(");
			} else {
				wynik = "trafiony";
			} // koniec if
		} // koniec if
		return wynik;
	} // koniec metody
} // koniec klasy

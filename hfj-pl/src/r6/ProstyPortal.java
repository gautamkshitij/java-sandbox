package r6;

import java.util.ArrayList;

class ProstyPortal{

	private ArrayList<Object> polozeniePol; // zmiana na ArrayList
	// int iloscTrafien; (juz niepotrzebne)

	void setPolaPolozenia(ArrayList<Object> ppol){ // zmiana na ArrayList
		polozeniePol=ppol;
	}

	String sprawdz(String ruch){
		int pole = Integer.parseInt(ruch);
		String wynik="pudlo";
		int indeks = polozeniePol.indexOf(pole);
		if(indeks>=0){ // jesli indeks ma wartosc wieksza/rowna 0 to pole jest obecje w tablicy
			polozeniePol.remove(indeks);
			if(polozeniePol.isEmpty()){ // jesli tabl. pol polozenia jest pusta to mamy ostatnie trafienie
				wynik="zatopiony";
			} else {
				wynik="trafiony";
			} // koniec if
		} // koniec if
		System.out.println(wynik);
		return wynik;
	} // koniec metody
} // koniec klasy

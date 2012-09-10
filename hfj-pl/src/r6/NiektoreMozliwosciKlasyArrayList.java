package r6;

import java.util.ArrayList;

public class NiektoreMozliwosciKlasyArrayList {
	public static void main(String[] args){
		// 1. tworzenie tablicy
		ArrayList<Object> mojaTab = new ArrayList<Object>();
		// 2. dodanie czegos do tablicy
		Jajko j = new Jajko();
		mojaTab.add(j);
		// 3. ponowne dodanie czegos do tablicy
		Jajko k = new Jajko();
		mojaTab.add(k);
		// 4. okreslenie ilosci elementow tablicy
		int ilosc = mojaTab.size();
		System.out.println("ilosc elementow w tablicy: " + ilosc);
		// 5. sprawdzenie czy tablica zawiera pewien obiekt
		boolean czyJest = mojaTab.contains(j);
		System.out.println("mojaTab zawiera obiekt j: " + czyJest);
		// 6. okreslenie polozenia obiektu (czyli jego indeksu)
		int indeks = mojaTab.indexOf(j);
		System.out.println("obekt j znajduje sie w tablicy pod indeksem: " + indeks);
		// 7. sprawdzenie czy tablica jest pusta
		boolean czyPusta = mojaTab.isEmpty();
		System.out.println("tablica jest pusta: " + czyPusta);
		// 8. usuniecie czegos z tablicy
		mojaTab.remove(j);
		System.out.println("tablica po usunieciu obiektu j:" + mojaTab.toString());
	}
}
class Jajko {
	// dummy class
}
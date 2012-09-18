package r6;

import java.util.ArrayList;

public class PortalGraMax {
	// 1. deklaracja i inicjalizacja niezbednych zmiennych
	private PomocnikGry pomocnik = new PomocnikGry();
	private ArrayList<Object> listaPortali = new ArrayList<Object>();
	private int iloscRuchow = 0;
	
	private void przygotujGre(){
		// najpierw tworzymy portale i okreslamy ich polozenie
		// 2. utworzenie trzech obiektow Portal, nadanie im nazw i zapisanie w tablicy ArrayList
		Portal pierwszy = new Portal();
		pierwszy.setNazwa("onet.pl");
		Portal drugi = new Portal();
		drugi.setNazwa("wp.pl");
		Portal trzeci = new Portal();
		trzeci.setNazwa("go2.com");
		listaPortali.add(pierwszy);
		listaPortali.add(drugi);
		listaPortali.add(trzeci);
		
		// 3. wyswietlenie krotkich informacji dla gracza
		System.out.println("Twoim celem jest zatopienie trzech portali");
		System.out.println("onet.pl, wp.pl, go2.com");
		System.out.println("Postaraj sie je zatopic w jak najmniejszej ilosci ruchow");
		
		for(int i=0; i<listaPortali.size(); i++){ // 4. powtarzanie dla kazdego portalu w tablicy
			ArrayList<Object> nowePolozenie = pomocnik.rozmiescPortal(3); // 5. poproszenie pomocnika gry o wygenerowanie portalu
			Portal rozmieszczanyPortal  = (Portal) listaPortali.get(i); // 6. pobranie z tablicy odwolania do obiektu Portal
			// 7. wywolanie metody zapisujacej tego obiektu w celu zapisania jego polozenia wygenerowanego przez pomocnika gry
			rozmieszczanyPortal.setPolaPolozenia(nowePolozenie); 
		} // koniec petli for
	} // koniec metody
	
	private void rozpocznijGre() {
		while(!listaPortali.isEmpty()){ // 8. dopoki tablica Portali NIE jest pusta
			String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: "); // 9. pobranie ruchu wykonanego przez gracza
			sprawdzRuchGracza(ruchGracza); // 10. wywolanie metody sprawdzRuchGracza()
		} // koniec while
		zakonczGre(); // 11. wywolanie naszej metody zakonczGre()
	} // koniec metode
	
	private void sprawdzRuchGracza(String ruch){
		iloscRuchow++; // 12. inkrementacja ilosci ruchow wykonanych przez gracza
		String wynik = "pudlo"; // 13. // poczatkowo zakladamy, ze gracz spudlowal (chyba, ze potem okaze sie inaczej)
		for(int i=0; i<listaPortali.size();i++){ // 14. powtarzanie dla kazdego Portalu w tablicy
			Portal dotComToTest = (Portal) listaPortali.get(i); // 15. pobranie obiektu Portal z tablicy wszystkich Portali
			wynik = dotComToTest.sprawdz(ruch); // 16. nakazanie portalowi by sprawdzi ruch i okreslil czy zostal trafiony lub zatopiony
			if("trafiony".equals(wynik)){
				break; // 17. przerwanie dzialania petli, dalsze sprawdzanie jest bezcelowe
			}
			if ("zatopiony".equals(wynik)){
				listaPortali.remove(i); // i juz po nim!
				break; // 18. ten gosc juz sie utopil, trzeba zatem usunac go z tablicy Portali i przerwac petle
			}
		} // koniec petli for
		System.out.println(wynik); // 19. wyswietlenie rezultatow ruchu
	}
	
	private void zakonczGre(){
		// 20. wyswietlenie komunikatu dla gracza o uzyskanych wynikach
		System.out.println("Wszystkie Portale zostaly zatopione! Teraz twoje informacje nie maja znaczenia.");
		if(iloscRuchow<=18){
			System.out.println("Wykonales jedynie " + iloscRuchow + " ruchow.");
			System.out.println("Wydostales sie zanim twoje informacje zatonely");
		} else {
			System.out.println("Ale sie grzebales! Wykonales az " + iloscRuchow + " ruchow");
			System.out.println("Teraz rybki plywaja pomiedzy twoimi informacjami");
		}
	} // koniec metody
	
	public static void main(String[] args){
		PortalGraMax gra = new PortalGraMax(); // 21. utworzenie obiektu gry
		gra.przygotujGre(); // 22. przygotowanie gry
		gra.rozpocznijGre(); // 23. informacja dla obiektu gry, aby rozpoczal glowna petle 
							// (w ktorej program poprosi gracza o podanie ruchow i sprawdza je)
	}
}

package r6;

import java.util.ArrayList;

public class PortalGraMax {
	// 1. ...
	private PomocnikGry pomocnik = new PomocnikGry();
	private ArrayList<Object> listaPortali = new ArrayList<Object>();
	private int iloscRuchow = 0;
	
	private void przygotujGre(){
		// najpierw tworzymy portale i okreslamy ich polozenie
		// 2. ...
		Portal pierwszy = new Portal();
		pierwszy.setNazwa("onet.pl");
		Portal drugi = new Portal();
		drugi.setName("wp.pl");
		Portal trzeci = new Portal();
		trzeci.setName("go2.com");
		listaPortali.add(pierwszy);
		listaPortali.add(drugi);
		listaPortali.add(trzeci);
		
		// 3. ...
		System.out.println("Twoim celem jest zatopienie trzech portali");
		System.out.println("onet.pl, wp.pl, go2.com");
		System.out.println("Postaraj sie je zatopic w jak najmniejszej ilosci ruchow");
		
		for(int i=0; i<listaPortali.size(); i++){ // 4. ...
			ArrayList<Object> nowePolozenie = pomocnik.rozmiescPortal(3); // 5. ...
			Portal rozmieszczanyPortal  = (Portal) listaPortali.get(i); // 6. ...
			rozmieszczanyPortal.setPolaPolozenia(nowePolozenie); // 7. ...
		} // koniec petli for
	} // koniec metody
	
	private void rozpocznijGre() {
		while(!listaPortali.isEmpty()){ // 8. ...
			String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: "); // 9. ...
			sprawdzRuchGracza(ruchGracza); // 10. ...
		} // koniec while
		zakonczGre(); // 11. ...
	} // koniec metode
	
	private void sprawdzRuchGracza(String ruch){
		iloscRuchow++; // 12 ..
		// poczatkowo zakladamy, ze gracz spudlowal
		String wynik = "pudlo"; // 13. ...
		for(int i=0; i<listaPortali.size();i++){ // 14. ...
			Portal dotComToTest = (Portal) listaPortali.get(i); // 15. ...
			wynik = dotComToTest.sprawdz(ruch); // 16. ...
			if("trafiony".equals(wynik)){
				break; // 17. ...
			}
			if ("zatopiony".equals(wynik)){
				listaPortali.remove(i); // i juz po nim!
				break; // 18. ...
			}
		} // koniec petli for
		System.out.println(wynik); // 19. ...
	}
	
	private void zakonczGre(){
		// 20. ...
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
		PortalGraMax gra = new PortalGraMax(); // 21. ...
		gra.przygotujGre(); // 22. ...
		gra.rozpocznijGre(); // 23. ...
	}
}

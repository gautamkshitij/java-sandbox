package r6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PomocnikGry {
	
	private static final String alfabet = "abcdefg";
	private int dlugoscPlanszy = 7;
	private int wielkoscPlanszy = 49;
	private int[] plansza = new int[wielkoscPlanszy];
	private int iloscPortali = 0;

	public String pobierzDaneWejsciowe(String komunikat) {
		String daneWejsciowe = null;
		System.out.print(komunikat + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			daneWejsciowe = is.readLine();
			if(daneWejsciowe.length()==0) return null;
		} catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		return daneWejsciowe.toLowerCase();
	}
	
	public ArrayList<Object> rozmiescPortal(int wielkoscPortalu){
		
		ArrayList<Object> zajetePola = new ArrayList<Object>();
		String[] wspolrzedneLnc = new String[wielkoscPortalu]; // zawiera wspolrzedne zapisane jako f6
		String pomoc = null; // pomocniczy lancuch znakow
		int[] wspolrzedne = new int[wielkoscPortalu]; // biezace proponowane wspolrzedne
		int prob = 0; // licznik ilosci prob
		boolean powodzenie = false; // flaga = czy znaleziono dobre miejsce
		int polozenie = 0; // biezace miejsce poczatkowe
		
		iloscPortali++; // n-ty portal do rozmieszczenia
		int  inkr = 1; // okreslenie przyrostu w poziomie
		if ((iloscPortali%2)==1){ // jesli nieparzysty portal (rozmieszczamy w pionie)
			inkr = dlugoscPlanszy; // okreslenie przyrostu w pionie
		}
		
		while(!powodzenie & prob++<200){ // glowna petla poszukiwania
			polozenie = (int) (Math.random() * wielkoscPlanszy); // wybor losowego punktu poczatkowe
			System.out.print(" sprawdz " + polozenie);
			int x = 0; // n-ty fragment rozmieszczanego portalu
			powodzenie = true; // zakladamy, ze sie udalo
			while(powodzenie && x < wielkoscPortalu ){ // szukamy sasiadujacych pustych pol planszy
				if(plansza[polozenie] == 0){ // jesli jeszcze nie zajete
					wspolrzedne[x++] = polozenie; // zapisujemy miejsce
					polozenie += inkr; // sprawdzamy 'nastepne' sasiadujace pole
					if(polozenie>=wielkoscPlanszy){ // poza zakresem - 'dol' planszy
						powodzenie = false; // niepowodzenie
					}
					if(x>0 & (polozenie % dlugoscPlanszy)==0){ // poza zakresem - prawa krawedz planszy
						powodzenie=false; // niepowodzenie
					}
				} else {
					System.out.println(" juz zajete "+polozenie);
					powodzenie = false;
				}
			}
		}
		
		int x = 0; // zamieniamy na wspolrzedne
		int wiersz = 0;
		int kolumna = 0;
		
		while(x<wielkoscPortalu){
			plansza[wspolrzedne[x]] = 1; // zaznaczamy pole planszy jako zajete
			wiersz  = (int) (wspolrzedne[x]/dlugoscPlanszy); // okreslenie wiersza
			kolumna = wspolrzedne[x] % dlugoscPlanszy; // pobranie liczby okreslajacej kolumne
			pomoc = String.valueOf(alfabet.charAt(kolumna));
			
			zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
			x++;
		}
		
		System.out.println("\n");
		
		return zajetePola;
	}

}

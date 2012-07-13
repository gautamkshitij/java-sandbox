package hfj.r05;
// co mozna jeszcze sprawdzic:
// - jak zachowa sie klasa w przypadku
//  podania nieprawidlowych danych, np. null
class ProstyPortalTest{
	public static void main(String[] args){
		ProstyPortal pp = new ProstyPortal();
		int[] polozenia={2,3,4};
		pp.setPolaPolozenia(polozenia);
		
		String wybranePole="2";
		String wynik=pp.sprawdz(wybranePole);
		String wynikTestu="niepowodzenie";
		if(wynik.equals("trafiony"){
			wynikTestu="zakonczony pomyslnie";
		}
		System.out.println(wynikTestu);
	}
}

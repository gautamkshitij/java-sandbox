package r5;
// ostateczny kod klasy 
class ProstyPortalTest{
	public static void main(String[] args){
		ProstyPortal pp = new ProstyPortal();
		int[] polozenia={2,3,4};
		pp.setPolaPolozenia(polozenia);
		String wybranePole="2";
		String wynik=pp.sprawdz(wybranePole);
		String wynikTestu="niepowodzenie";
		if(wynik.equals("trafiony")){
			wynikTestu="zakonczony pomyslnie";
		}
		System.out.println(wynikTestu);
	}
}

package r6;

public class PortalGraMaxTest {

	public static void main(String[] args) {
		/*
		PortalGraMaxTest test = new PortalGraMaxTest();
		test.przygotujGreTest();
		test.rozpocznijGreTest();
		test.sprawdzRuchGraczaTest();
		test.zakonczGreTest();
		*/
	}
	
	/*
	void przygotujGreTest(){
		PortalGraMax gra = new PortalGraMax();
		gra.przygotujGre();
		if(gra.listaPortali==null) pokaBlad();
		if(gra.listaPortali!=3) pokaBlad();
	}*/
	
	void rozpocznijGreTest(){
		// tej metody chyba nie da sie przetestowac
	}
	
	/*
	void sprawdzRuchGraczaTest(){
		PortalGraMax gra = new PortalGraMax();
		gra.przygotujGre();
		String[] abc = new String[] {"a","b","c","d","e","f","g"};
		for (int i = 0; i < abc.length; i++) {
			String litera = abc[i];
			for (int j = 0; j < 8; j++) {
				String liczba = String.valueOf(j);
				String wpisanePole = litera + liczba;
				gra.sprawdzRuchGracza(wpisanePole);
			}
		}
		if(!gra.listaPortali.isEmpty()) pokaBlad();
		if(gra.iloscRuchow!=64) pokaBlad();
	}*/
	
	void zakonczGreTest(){
		// tej metody chyba teý nie da sie przetestowac
	}

	private void pokaBlad() {
		System.out.println("blad");
	}
}

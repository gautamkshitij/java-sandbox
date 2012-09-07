package r5;

class ProstyPortalGra{
	public static void main(String[] args){

		int iloscRuchow = 0;

		ProstyPortal portal = new ProstyPortal();

		int liczbaLosowa = (int) (Math.random()*5);

		int[] polaPolozenia = { liczbaLosowa, liczbaLosowa+1, liczbaLosowa+2};  
		
		portal.setPolaPolozenia(polaPolozenia); 
		
		boolean czyIstnieje = true; 

		while(czyIstnieje) {
		
			String podanePole = PomocnikGry.pobierzDaneWejsciowe("Podaj liczbe");

			String wynik = portal.sprawdz(podanePole);

			iloscRuchow++; 

			if("zatopiony".equals(wynik)){// JESLI liczba udanych trafien portalu jest 
	
				czyIstnieje = false;

				System.out.println("Ilosc Ruchow: " + iloscRuchow);
			} // if
		} // while 
	} // main
}

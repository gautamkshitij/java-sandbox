package r6;

public class ZaostrzOlowekZwyczajnaTablica {
	public static void main(String[] args) {
		String[] mojaTab = new String[2];
//		int ilosc = 0;
		String a = new String("hoohoo");
		mojaTab[0] = a;
//		ilosc++;
		String b = new String("Zaba");
		mojaTab[1] = b;
//		ilosc++;
		int ilosc = mojaTab.length;
		Object o = mojaTab[1];
		mojaTab[1] = null;
		boolean czyJest = false;
		for(int i=0; i<ilosc; i++){
			String el  = mojaTab[i];
			if(b.equals(el)){
				czyJest=true;
			}
		}
		System.out.println("czyJest: " + czyJest);
	}
}
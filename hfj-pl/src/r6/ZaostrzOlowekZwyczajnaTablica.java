package r6;

public class ZaostrzOlowekZwyczajnaTablica {
	public static void main(String[] args) {
		String[] mojaTab = new String[2];
		String a = new String("hoohoo");
		mojaTab[0] = a;
		String b = new String("Zaba");
		mojaTab[1] = b;
		int ilosc = mojaTab.length;
		String o = mojaTab[1];
		mojaTab[1] = null;
		boolean czyJest = false;
		for(int i=0; i<ilosc; i++){ // tej linijki nie bylo w ksiazce (blad w druku)
			if(b.equals(mojaTab[i])){
				czyJest=true;
				break;
			}
		}
		System.out.println("czyJest: " + czyJest);
	}
}
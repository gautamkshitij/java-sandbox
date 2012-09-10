package r6;

import java.util.ArrayList;

public class ZaostrzOlowekArrayList {
	public static void main(String[] args) {
		ArrayList<Object> mojaTab = new ArrayList<Object>();
		String a = new String("hoohoo");
		mojaTab.add(a);
		String b = new String("Zaba");
		mojaTab.add(b);
//		System.out.println("zawartosc tablicy: " + mojaTab);
		int ilosc = mojaTab.size();
//		System.out.println("ilosc elementow w tablicy: " + ilosc);
		Object o = mojaTab.get(1);
		mojaTab.remove(1);
		boolean czyJest = mojaTab.contains(b);
//		System.out.println("czy moja tablica wciaz zawiera obiekt b: " + czyJest);
//		System.out.println("zawartosc tablicy: " + mojaTab);
	}
}

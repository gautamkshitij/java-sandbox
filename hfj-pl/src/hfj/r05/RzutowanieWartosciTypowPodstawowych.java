package hfj.r05;

public class RzutowanieWartosciTypowPodstawowych {

	public static void main(String[] args) {
	long y = 40002; // ta liczba przekracza zakres 16-bitowych wartosci
                        // typu short}
        short x = (short) y; // x ma wartosc -25534
        System.out.println(x);
}

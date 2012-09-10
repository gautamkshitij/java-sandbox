package r6;

public class TabliceTestNiewlasciwegoIndeksu {
	public static void main(String[] args) {
		String[] tab = new String[2];
		tab[0] = "zero";
		tab[1] = "jeden";
		tab[2] = "dwa"; // tu polaci wyjatek/blad java.lang.ArrayIndexOutOfBoundsException
	}
}

package hfj.r05;

public class JakDzialaOperatorPreInkrementacji {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("1. "+ x);
		++x; // odpowiada: x = x+1;
		System.out.println("2. "+ x);
		System.out.println("3. "+ ++x);
		System.out.println("4. "+ x);
	}
}

package r7;

public class Psowate extends Zwierze{

	public void wedruj() {
		
		// ta instrukcja wywoluje odziedziczona wersje metody wedruj().
		// a potem wracamy, aby wykonac wlasny kod
		super.wedruj();
		
		System.out.println("wedruj() z klasy Psowate");
	}
}

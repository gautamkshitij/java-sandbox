package r7;

public class PolimorfizmKlasyZwierzeDemo {

	public static void main(String[] args) {
		
		Zwierze[] zwierzeta = new Zwierze[5];
		zwierzeta[0] = new Pies();
		zwierzeta[1] = new Kot();
		zwierzeta[2] = new Wilk();
		zwierzeta[3] = new Hipopotam();
		zwierzeta[4] = new Lew();
		
		for (int i = 0; i < zwierzeta.length; i++) {
			zwierzeta[i].jedz();
			zwierzeta[i].wedruj();
			System.out.println("---");
		}
	}
}

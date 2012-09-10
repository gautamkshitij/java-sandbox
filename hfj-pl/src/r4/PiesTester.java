package r4;
class PiesTester{
	public static void main(String[] args){
			Pies pierwszy = new Pies();
			pierwszy.setWielkosc(40);
			Pies drugi = new Pies();
			drugi.setWielkosc(2);
			Pies trzeci = new Pies();
			trzeci.setWielkosc(8);

			pierwszy.szczekaj();
			drugi.szczekaj();
			trzeci.szczekaj();

			Pies p = new Pies();
			p.szczekaj(3);

			System.out.println("------- tablice ");

			Pies[] zwierzaki= new Pies[7];
			zwierzaki[0]=new Pies();
			zwierzaki[1]=new Pies();

			zwierzaki[0].setWielkosc(30);
			int x=zwierzaki[0].getWielkosc();
			zwierzaki[1].setWielkosc(8);

			System.out.println("zwierzaki[0]: "+x);
			System.out.println("zwierzaki[1]: "+
				zwierzaki[1].getWielkosc());
	}
}

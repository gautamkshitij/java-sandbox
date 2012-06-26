package hfj.r04;
class DobryPiesekTester{
	public static void main(String[] args){
		DobryPiesek pierwszy=new DobryPiesek();
		pierwszy.setWielkosc(70);
		DobryPiesek drugi=new DobryPiesek();
		drugi.setWielkosc(8);
		System.out.println("pierwszy pies : "+
			pierwszy.getWielkosc());
		System.out.println("drugi pies : "+
			drugi.getWielkosc());
		pierwszy.szczekaj();
		drugi.szczekaj();
		// zamiast 
		int x=3+24;
		// mozna napisac:
		x=3+pierwszy.getWielkosc();
		System.out.println("x="+x);
	}
}

package hfj.r04;
class PrzekazywaniePrzezWartoscObiekty{
	public static void main(String[] args){
		System.out.println("-- main start");

		String x = "7";
		PrzekazywaniePrzezWartoscObiekty tmp=new PrzekazywaniePrzezWartoscObiekty();

		System.out.println("x in main:"+x);

		tmp.idz(x);

		System.out.println("x in main again:"+x);
		System.out.println("-- main end");
	}
	void idz(String z){
		System.out.println("-- idz start");
		z="0";
		System.out.println("z in idz:"+z);
		System.out.println("-- idz end");
	}
}

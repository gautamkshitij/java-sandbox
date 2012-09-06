package hfj.r04;
class PrzekazywaniePrzezWartosc{
	public static void main(String[] args){
		System.out.println("-- main start");

		int x=7;
		PrzekazywaniePrzezWartosc tmp=new PrzekazywaniePrzezWartosc();

		System.out.println("x in main:"+x);

		tmp.idz(x);

		System.out.println("x in main again:"+x);
		System.out.println("-- main end");
	}
	void idz(int z){
		System.out.println("-- idz start");
		z=0;
		System.out.println("z in idz:"+z);
		System.out.println("-- idz end");
	}
}

package hfj.r04;
class Tester{
	public static void main(String[] args){
		new Tester().idz();
	}
	void idz(){
		Tester t = new Tester();
		int arg1=7;
		int arg2=3;
		t.dwaParametry(arg1,arg2);
	}
	void dwaParametry(int x, int y){
		int z = x+y;
		System.out.println("Suma wynosi: "+z);
	}
}

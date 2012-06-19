package hfj.r04;
class Tester{
	public static void main(String[] args){
		new Tester().idz();
	}
	void idz(){
		Tester t = new Tester();
		t.dwaParametry(12,34);
	}
	void dwaParametry(int x, int y){
		int z = x+y;
		System.out.println("Suma wynosi: "+z);
	}
}

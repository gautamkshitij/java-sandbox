package hfj.r04;
class ZegarTester{
	public static void main(String[] args){
		Zegar z = new Zegar();
		z.setCzas("12345");
		String dta = z.getCzas(); // tutaj sie pewnie wywali
		System.out.println("Czas : "+dta);
	}
}

package r4;
class PorownywanieZmiennych{
	public static void main(String[] args){
		int x=3;
		byte y=3;
		if(x==y)
			System.out.println("x==y >> true");
		else
			System.out.println("x==y >> false");

		Test a = new Test();
		Test b = new Test();
		Test c = a;
		if(a==b)
			System.out.println("a==b >> true");
		else
			System.out.println("a==b >> false");

		if(a==c)
			System.out.println("a==c >> true");
		else
			System.out.println("a==c >> false");

		if(b==c)
			System.out.println("b==c >> true");
		else
			System.out.println("b==c >> false");
	}
}

package r4;
class CoJestPoprawne{
	public static void main(String[] args){
		CoJestPoprawne o = new CoJestPoprawne();
		int a=o.obliczPole(7,12); // ok
		short c = 7;
		o.obliczPole(c,15); // ok
		// int d = o.obliczPole(57); // err
		o.obliczPole(2,3); // ok
		long t=42;
		// int f=o.obliczPole(t,17); // err
		// int g=o.obliczPole(); // err
		// o.obliczPole(); // err
		// byte h=o.obliczPole(4,20);//err
		// int j=o.obliczPole(2,3,5); // err
	}
	int obliczPole(int wysokosc, int szerokosc){
		return wysokosc*szerokosc;
	}
}

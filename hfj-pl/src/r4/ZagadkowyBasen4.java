package r4;
/**
 * powinien wyswietlic:
 * 'wynik: 543345'
 */
class ZagadkowyBasen4{
	public static void main(String[] args){
		ZagadkowyBasen4b[] obty = new ZagadkowyBasen4b[6];
		int y=1;
		int x=0;
		int wynik=0;
		while(x<6){
			obty[x]=new ZagadkowyBasen4b();
			obty[x].izm=y;
			y=y*10;
			x=x+1;
		} // while
		x=6;
		while(x>0){
			x=x-1;
			wynik=wynik+obty[x].zrobCos(x);
		} // while
		System.out.println("wynik "+wynik);
	} // main 
} // class
class ZagadkowyBasen4b {
	int izm;
	public int zrobCos(int czynnik){
		if(izm>100){
			return izm*czynnik;
		} else {
			return izm*(5-czynnik);
		}
	} // zrobCos 
}

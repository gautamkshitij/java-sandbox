package r3;

class KwizGoraProblemow{
	int id=0;
	public static void main(String[] args){
		int x=0;
		KwizGoraProblemow[] kwz = new KwizGoraProblemow[5];
		while(x<3){
			kwz[x]=new KwizGoraProblemow();
			kwz[x].id=x;
			x=x+1;
		}
		kwz[3]=kwz[1];
		kwz[4]=kwz[1];
		kwz[3]=null;
		kwz[4]=kwz[0];
		kwz[0]=kwz[3];
		kwz[3]=kwz[2];
		kwz[2]=kwz[0];
		// dalsze operacje
		
		// odwolania w tablicy wskazuja 
		// na koncu na:
		// kwz[0] - null
		// kwz[1] - id.1
		// kwz[2] - null
		// kwz[3] - id.2
		// kwz[4] - id.0
	}
}

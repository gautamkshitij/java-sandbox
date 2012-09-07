package r5;

public class Wyniki {
	public static void main(String[] args) {
		Wyniki w = new Wyniki();
		w.doDziela();
	}

	/*
	 * przebie programu:
	 * x=1; y=8;
	 * x=2; y=9;
	 * x=3; y=10;
	 * x=4; y=11;
	 * x=5; y=12; y=13 (print "13 ")
	 * x=6; y=14; y=15 (print "15 ")
	 * czyli wynik to: "13 15  x = 6
	 */
	private void doDziela() {
		int y = 7;
		for(int x=1;x<8;x++){
			y++;
			if(x>4){
				System.out.print(++y + " ");
			}
			if(y>14){
				System.out.println(" x = " + x);
				break;	
			}
		}
		
	}
}

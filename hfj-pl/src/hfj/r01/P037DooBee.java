package hfj.r01;

// expected result: DooBeeDooBeeDo
public class P037DooBee {

	public static void main(String args[]){
		int x=1;
		while(x<3){
			System.out.print("Doo");
			System.out.print("Bee");
			x=x+1;
		} 
		if(x==3){
			System.out.print("Do");
		}
	}
}

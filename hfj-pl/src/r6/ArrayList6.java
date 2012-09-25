package r6;

import java.util.*;

public class ArrayList6 {

	public static void main(String[] args){

		ArrayList<Object> a = new ArrayList<Object>();
		if(a.contains("dwa")){
			a.add("2.2");
		}
		a.add(0,"zero");
		a.add(1,"jeden");
		a.add(2,"dwa");
		a.add(3,"trzy");
		wyswietlWszystko(a);
		if(a.contains("trzy")){
			a.add("cztery");
		}
		a.remove(2);
		wyswietlWszystko(a);
		if(a.indexOf("cztery")!=4){
			a.add(4, "4.2");
		}
		wyswietlWszystko(a);
		wyswietlWszystko(a);
	}
	
	public static void wyswietlWszystko(ArrayList al){
		for(int z=0; z<al.size();z++){
			System.out.print(z + "= " + al.get(z));
			System.out.print(", ");

		}
		System.out.println(" ");
	}
}

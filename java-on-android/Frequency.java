import java.util.*;
public class Frequency {
	public static void main(String[] args){
		Map<String,Integer> m = new TreeMap<String,Integer>();
		for(String word:args){
			Integer f = m.get(word);
			m.put(word,f==null?1:f+1);
		}
		System.out.println(m);
	}
}

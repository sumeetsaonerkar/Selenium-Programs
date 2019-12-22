package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exp {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		hs.add("sumeet");
		hs.add("parnika");
		hs.add("zakir");
		hs.add("anna");
		hs.add("sumeet");
		
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<String>(hs);
		System.out.println("o/p with ascending order :- "+ts);
		

	}

}

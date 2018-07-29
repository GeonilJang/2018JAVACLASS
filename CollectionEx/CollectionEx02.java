package CollectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEx02 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("Second");
		al.add("third");
		al.add("third");
		al.add("Fourth");
		System.out.println("ArrayList========="); // 순서유지 중복허용.
		Iterator ai = al.iterator();
		
		System.out.println(al);
		while(ai.hasNext()) {
			System.out.println(ai.next());
		}
		
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("Second");
		hs.add("third");
		hs.add("third");
		
		Iterator hi = hs.iterator();
		System.out.println("HashSet========="); //순서 유지x 중복허용 x
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		
		
		
		
		
		
		
		
		
	}
}

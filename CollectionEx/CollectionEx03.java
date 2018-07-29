package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionEx03 {
	public static void main(String[] args) {
		HashSet<String> A = new HashSet<String>();
		A.add("a");
		A.add("b");
		A.add("c");
		
		HashSet<String> B = new HashSet<String>();
		B.add("c");
		B.add("d");
		B.add("e");
		
		HashSet<String> C = new HashSet<String>();
		C.add("a");
		C.add("b");
		
		
		// A가  B값을 모두 가지고 있는가.
		System.out.println(A.containsAll(B)); //부분집합인 경우에는 true
		System.out.println(A.containsAll(C));
		
		
		// 합집합을 나타냄. addAll()
		System.out.println(A.addAll(B)); //-> 합집합을 만든다.
		Iterator hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}

		// 교집합을 만든다.A.retainAll(B)
		//차집합을 만든다. A.removeAll(B) 
		
		
		
		
	}
}

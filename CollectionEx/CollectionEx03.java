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
		
		
		// A��  B���� ��� ������ �ִ°�.
		System.out.println(A.containsAll(B)); //�κ������� ��쿡�� true
		System.out.println(A.containsAll(C));
		
		
		// �������� ��Ÿ��. addAll()
		System.out.println(A.addAll(B)); //-> �������� �����.
		Iterator hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}

		// �������� �����.A.retainAll(B)
		//�������� �����. A.removeAll(B) 
		
		
		
		
	}
}

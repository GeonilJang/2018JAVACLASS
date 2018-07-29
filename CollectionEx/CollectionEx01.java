package CollectionEx;

import java.util.ArrayList;

public class CollectionEx01 {
	public static void main(String[] args) {
		System.out.println("====Basic Array ====");
		String [] arr = new String[2];
		arr[0] = "사과";
		arr[1] = "포도";
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==== 아래는 ArrayList ====");
		
		ArrayList<String> al = new <String>ArrayList();		// add를 이용하여 값을 넣어 줄 수 있습니다. -> 제너릭을 이용하여 타입을 정해서 사용합니다.
		//타입의 안전성을 보장한다.
		al.add("사과");
		al.add("포토");
		al.add("수박");
		for(int i = 0 ; i < al.size() ; i++) {
			String str = al.get(i); // ArrayList 로 값을 저장할 때는 object 타입으로 값을 저장하게 됩니다.
			System.out.println(str);
//			System.out.println(al.get(i));
		}
		
		
		
		
		
	}
}

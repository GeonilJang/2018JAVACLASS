package CollectionEx;

import java.util.ArrayList;

public class CollectionEx01 {
	public static void main(String[] args) {
		System.out.println("====Basic Array ====");
		String [] arr = new String[2];
		arr[0] = "���";
		arr[1] = "����";
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==== �Ʒ��� ArrayList ====");
		
		ArrayList<String> al = new <String>ArrayList();		// add�� �̿��Ͽ� ���� �־� �� �� �ֽ��ϴ�. -> ���ʸ��� �̿��Ͽ� Ÿ���� ���ؼ� ����մϴ�.
		//Ÿ���� �������� �����Ѵ�.
		al.add("���");
		al.add("����");
		al.add("����");
		for(int i = 0 ; i < al.size() ; i++) {
			String str = al.get(i); // ArrayList �� ���� ������ ���� object Ÿ������ ���� �����ϰ� �˴ϴ�.
			System.out.println(str);
//			System.out.println(al.get(i));
		}
		
		
		
		
		
	}
}

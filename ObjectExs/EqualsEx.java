package ObjectExs;

public class EqualsEx {
	public static void main(String []args) {
		int aa = 100;
		int bb = 100;
		
		Value a = new Value(23);
		System.out.println(a.a);
		
		String str1 = new String("하이 자바");
		String str2 = "하이 자바";
		
		System.out.println(str1.hashCode()); // 주소의 값을 반환해 주는 메서드 입니다.
		System.out.println(str2.hashCode());
		
		
		if(aa==bb) {
			System.out.println("aa is the same with bb");
		}else {
			System.out.println("aa is not the same with bb");
		}
		
		
		 
//		str1 = str2;
		if(str1 == str2) {
			System.out.println("str1 is the same with str2");
		}else {
			System.out.println("str1 is not the same with str2");
		}

		
		if(str1.equals(str2)) {
			System.out.println("str1 is the same with str2");
		}else {
			System.out.println("str1 is not the same with str2");
		}
		
		
		// == 비교연산자는 기본자료형을 비교하는 경우에는 값을 비교한다.
		// 참조형(Reference Type)의 비교는 주소값을 비교한다.
		// 참조형의 값비교를 위해서는 .equals(value) 를 사용하여비교를 해야한다.
		
		
		
		Value va1 = new Value(10);
		Value va2 = new Value(10);
		
		System.out.println(va1.hashCode()); // 주소의 값을 반환해 주는 메서드 입니다.
		System.out.println(va2.hashCode());
		
//		va1 = va2;
		if(va1.equals(va2)) {
			System.out.println("the same");
		}else {
			System.out.println("not the same");
		}
	}
}

class Value{
	int a;
	
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Value) {
			return a == ((Value)obj).a;
		}else {
			return false;
		}
	}
	
	public Value(int a) {
		this.a = a;
	}
}
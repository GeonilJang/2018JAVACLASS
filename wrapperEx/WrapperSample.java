package wrapperEx;

public class WrapperSample {
	public static void main(String [] args) {
		int a = 100;
		
		Integer aa = new Integer(100);
		Integer aa1 = new Integer(100);
		
		System.out.println("aa.equals(aa1): "+aa.equals(aa1));

		//Wrapper 클래스는 equals 메소드를 오버라이딩 했다.
		//Wrapper 클래스는 toString 메소드도 오버라이딩되어 있다.
		System.out.println("aa.toString() = "+aa);
		
		
		String str = "100";
		int ii = Integer.parseInt(str);
		int ii2 = ii + 100;
		System.out.println(ii2);
	
		String str2 = Integer.toBinaryString(200);
		System.out.println(str2);
		int ii3 = Integer.parseInt(str2, 2);
		
		int ii4 = Integer.parseInt("100",8);
		System.out.println(ii4);
		
		
		
		//JDK autoBoxing new키워드를 사용하지 않아도 객체생성을 할 수 있는 것을 말합니다.
		
	}
}

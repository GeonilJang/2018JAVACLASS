
public class MemberDemo 
{
	static int aa;
	String str; // 인스턴스 변수
	
	
	public MemberDemo() 
	{
		System.out.println("아무것도 없는 생성자 입니다.");
	}
	
	
	//반환값이 정수형으로 존재한다.
	public static String yyy()
	{
		System.out.println("반환갑이 있는 클래스메소드.");
		return "반환값 입니다.";
	}
	
	
	public int xxx() 
	{
		System.out.println("반환값이 있는 인스턴스 메소드");	
		return 10;
	}
	
	
	
	// 생성자 : static 이 붙지 않습니다.
	public MemberDemo(String str)
	{
		System.out.println("Call Construnctor "+str);
	}// end of constructor
	
	public static void yy()
	{
		System.out.println("Class Method");
	}//end of yy
	
	
	public void xx()
	{
		System.out.println("Instance Method 1");
	}//end of xx
	
	public void zz(String str1)
	{
		System.out.println("매개변수가 있는 메소드 : "+str1);
	}//end of zz
	
	
	
	
	//클래스의 구성요소 : 속성(필드) + 메서드 (생성자) 	
	public static void main(String []args)
	{
		//생성자를 호출하자.이 의미는 객체를 생선한다는 의미가 된다.
		MemberDemo md = new MemberDemo("띠로리");
		MemberDemo.yy(); // 같은 곳에 있기 때문에 yy() 만으로도 사용이 가능합니다.
		md.xx();
		System.out.println(md.xxx());
		md.zz("\"당신은 누구시오?\"");
		
		System.out.println(MemberDemo.yyy());
		
		
		
	}//end of main
}












package abstractEx;

class Super
{
	public void method()
	{
		System.out.println("수퍼클래스");
	}
	
	final public void method1()
	{
		System.out.println("final test");
	}
}

final class Sub extends Super
{
	//오버라이딩 되었다.
	public void method()
	{
		System.out.println("서브클래스");
	}
	
	
	//파이날 메소드는 오버라이딩을 할 수 없는 예제를 보여줍니다.
//	public void method1()
//	{
//		System.out.println("final test1");
//	}
//	
	
}

//상속을 받을 수 는 있어도 상속을 할 수 없는 것을 보여주는 예제입니다.
//class Subsub extends Sub
//{
//	
//}

public class FinalEx1 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.method();
	}
}





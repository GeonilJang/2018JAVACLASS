package abstractEx;

class Super
{
	public void method()
	{
		System.out.println("����Ŭ����");
	}
	
	final public void method1()
	{
		System.out.println("final test");
	}
}

final class Sub extends Super
{
	//�������̵� �Ǿ���.
	public void method()
	{
		System.out.println("����Ŭ����");
	}
	
	
	//���̳� �޼ҵ�� �������̵��� �� �� ���� ������ �����ݴϴ�.
//	public void method1()
//	{
//		System.out.println("final test1");
//	}
//	
	
}

//����� ���� �� �� �־ ����� �� �� ���� ���� �����ִ� �����Դϴ�.
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





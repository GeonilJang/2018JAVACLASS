
public class MemberDemo 
{
	static int aa;
	String str; // �ν��Ͻ� ����
	
	
	public MemberDemo() 
	{
		System.out.println("�ƹ��͵� ���� ������ �Դϴ�.");
	}
	
	
	//��ȯ���� ���������� �����Ѵ�.
	public static String yyy()
	{
		System.out.println("��ȯ���� �ִ� Ŭ�����޼ҵ�.");
		return "��ȯ�� �Դϴ�.";
	}
	
	
	public int xxx() 
	{
		System.out.println("��ȯ���� �ִ� �ν��Ͻ� �޼ҵ�");	
		return 10;
	}
	
	
	
	// ������ : static �� ���� �ʽ��ϴ�.
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
		System.out.println("�Ű������� �ִ� �޼ҵ� : "+str1);
	}//end of zz
	
	
	
	
	//Ŭ������ ������� : �Ӽ�(�ʵ�) + �޼��� (������) 	
	public static void main(String []args)
	{
		//�����ڸ� ȣ������.�� �ǹ̴� ��ü�� �����Ѵٴ� �ǹ̰� �ȴ�.
		MemberDemo md = new MemberDemo("��θ�");
		MemberDemo.yy(); // ���� ���� �ֱ� ������ yy() �����ε� ����� �����մϴ�.
		md.xx();
		System.out.println(md.xxx());
		md.zz("\"����� �����ÿ�?\"");
		
		System.out.println(MemberDemo.yyy());
		
		
		
	}//end of main
}












package aPack;

public class AccessChild extends AccessParent
{
	public void printMethod()
	{
		System.out.println("publicA = "+ publicA);
		System.out.println("protectedA = "+protectedA);
		System.out.println("defaultA = "+defaultA);
		//System.out.println("privateA = "+privateA); //����� �޾����鼭�� ����� �Ұ����ϴ�.
	}
	
	
	
	public static void main(String[] args) 
	{
		AccessChild ac = new AccessChild();
		ac.printMethod();
	}
}

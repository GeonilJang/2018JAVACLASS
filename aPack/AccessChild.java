package aPack;

public class AccessChild extends AccessParent
{
	public void printMethod()
	{
		System.out.println("publicA = "+ publicA);
		System.out.println("protectedA = "+protectedA);
		System.out.println("defaultA = "+defaultA);
		//System.out.println("privateA = "+privateA); //상속을 받았으면서도 사용이 불가능하다.
	}
	
	
	
	public static void main(String[] args) 
	{
		AccessChild ac = new AccessChild();
		ac.printMethod();
	}
}

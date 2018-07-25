package bPack;

import aPack.*;

public class AccessChild extends AccessParent{
	
	public void printMethod()
	{
		System.out.println("publicA = "+ AccessParent.publicA);
		System.out.println("protectedA = "+protectedA);//상속을 받지 않았기 때문에 문제가 발생합니다.
		//System.out.println("defaultA = "+defaultA); //다른 패키지에 있기때문에 사용불가능합니다.
		//System.out.println("privateA = "+privateA); //상속을 받았으면서도 사용이 불가능하다.
	}
	
	
	
	public static void main(String[] args) 
	{
		AccessChild ac = new AccessChild();
		ac.printMethod();
	}
}

package bPack;

import aPack.*;

public class AccessChild extends AccessParent{
	
	public void printMethod()
	{
		System.out.println("publicA = "+ AccessParent.publicA);
		System.out.println("protectedA = "+protectedA);//����� ���� �ʾұ� ������ ������ �߻��մϴ�.
		//System.out.println("defaultA = "+defaultA); //�ٸ� ��Ű���� �ֱ⶧���� ���Ұ����մϴ�.
		//System.out.println("privateA = "+privateA); //����� �޾����鼭�� ����� �Ұ����ϴ�.
	}
	
	
	
	public static void main(String[] args) 
	{
		AccessChild ac = new AccessChild();
		ac.printMethod();
	}
}

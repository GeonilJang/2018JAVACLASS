package polyEx;

//Calculator1 ca = new Sum1();
//Calculator1 ca1 = new Substract1();
//
//Calculator1 caNew[] = new Caclulator1[2];
//caNew[0] = new Sum1();
//caNew[1] = new Substract1();

public class Poly1Ex {
	
	static int i = 0;
	static Calculator1 calArray[] = new Calculator1[3];
	//�ϳ��� �迭�� ������ �����ڽ��� ��Ƽ� ��� �� �� �ִ�.
	
	/*
	 * �� ���� ���� ������ �Ѽ��� ���� ��Ű�� ������ �θ� Ŭ������ �ϳ� ����� �װ��� ��ӹ޴� ���� �� ����� ������� 
	 * �迭�� ������ ��� ���� ��Ű�� ����� ���Ͽ� ����ϸ� ���� ����� ����� �� �� �ִ�.
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void exe(Calculator1 cal)
	{
		calArray[i++] = cal;
		cal.setNum(100,200);
		cal.calResult();
	}
	
	public static void main(String[] args) {
		Sum1 sum = new Sum1();
		Substract1 sub = new Substract1();
		
		exe(sum);
		exe(sub);
		exe(sum);
		exeSquence();
	}
	
	public static void exeSquence()
	{
		System.out.println("-----���� ����-----");
		for(int i = 0 ; i < calArray.length; i++)
		{
			String str = calArray[i].operand();
			System.out.println(str);
		}
	}
	
}


abstract class Calculator1{
	int n1, n2;
	
	public void setNum(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public abstract void calResult();
	public abstract String operand();
}

class Sum1 extends Calculator1{
	public void calResult() {
		System.out.println(" + ��� : "+(n1+n2));
	}
	
	public String operand()
	{
		return "����";
	}
		
}

class Substract1 extends Calculator1{
	public void calResult() {
		System.out.println(" - ��� : "+(n1-n2));
	}
	
	public String operand() {
		return "����";
	}
}
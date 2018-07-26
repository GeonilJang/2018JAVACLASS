package polyEx;



public class PolyEx {
	
	public static void exe(Calculator cal)
	{
		cal.setNum(100,200);
		cal.calResult();
	}

	
	public static void main(String[] args) {
	
		//���δٸ� �ν��Ͻ��� ���� �� �ֽ��ϴ�. -> ���������� ��ü�� �迭�� �����Ͽ� ����ϴ� ���.
		Calculator c1 = new Sum();
		Calculator c2 = new Substract();
		
		exe(c1);
		exe(c2);
		
		
//		Sum s = new Sum();
//		s.setNum(10, 20);
//		s.calResult();
//		
//		Substract sub = new Substract();
//		sub.setNum(20,10);
//		sub.calResult();
		
		
	}
}


abstract class Calculator{
	int n1, n2;
	
	public void setNum(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public abstract void calResult();
}

class Sum extends Calculator{
	public void calResult() {
		System.out.println(" + ��� : "+(n1+n2));
	}
}

class Substract extends Calculator{
	public void calResult() {
		System.out.println(" - ��� : "+(n1-n2));
	}
}
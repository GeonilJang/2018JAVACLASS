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
	//하나의 배열을 가지고 여러자식을 담아서 사용 할 수 있다.
	
	/*
	 * 한 번에 여러 가지의 한수를 실행 시키고 싶을때 부모 클래스를 하나 만들고 그것을 상속받는 것을 쫙 만들어 논다음에 
	 * 배열에 차분히 담아 실행 시키는 방법을 통하여 사용하면 좋은 결과를 만들어 낼 수 있다.
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
		System.out.println("-----연산 순서-----");
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
		System.out.println(" + 결과 : "+(n1+n2));
	}
	
	public String operand()
	{
		return "덧셈";
	}
		
}

class Substract1 extends Calculator1{
	public void calResult() {
		System.out.println(" - 결과 : "+(n1-n2));
	}
	
	public String operand() {
		return "빼기";
	}
}
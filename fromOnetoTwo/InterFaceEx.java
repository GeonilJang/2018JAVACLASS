package fromOnetoTwo;


interface interface01
{
	void gugudan();
}

interface interface02 extends interface01
{
	void sum();
}

public class InterFaceEx implements interface02{
	
	public static String str = "Hello, this is InterFaceEx class' static variable.";
	int dan;
	
	public InterFaceEx() {}
	
	public InterFaceEx(int dan)
	{
		this.dan = dan;
	}
	
	public void gugudan()
	{	
		for(int j = 1 ; j < 10 ; j++)
		{
			System.out.println(dan+" x "+j+" = "+dan*j);
		}
	}
	
	public void sum()
	{
		int sum=0;
		for(int i = dan ; i > 0 ; i--)
			sum += i;
		System.out.println(sum);
	}
	
	public String giveSting(String str)
	{
		return str;
	}

}

package fromOnetoTwo;

class NewInt extends InterFaceEx
{
	public NewInt(int dan)
	{
		super(dan);
	}
	
	public void sum()
	{
		System.out.println("new Sum in Child.`");
	}
}



public class MainClass
{
	
	public static void main(String[] args) 
	{
		InterFaceEx inf = new InterFaceEx(8);
		System.out.println(inf.str);
		inf.gugudan();
		inf.sum();
		
		NewInt ni = new NewInt(3);
		ni.gugudan();
		ni.sum();
		
		
	
	}

}

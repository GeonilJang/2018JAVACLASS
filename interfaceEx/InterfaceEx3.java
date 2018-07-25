package interfaceEx;

interface Interface4
{
	void a();
}
interface Interface5
{
	String b();
}

abstract class AbsClass
{
	abstract void c();
}


interface InterfaceF extends Interface4, Interface5
{
		void d();
}

public class InterfaceEx3 extends AbsClass implements InterfaceF
{
	public void c()
	{
		System.out.println("ccc");
	}
	public void a()
	{
		System.out.println("aaa");
	}
	public String b()
	{
		System.out.println("bbb");
		return "bbb";
	}
	public void d()
	{
		System.out.println("ddd");
	}
	
	public static void main(String[] args) 
	{
		InterfaceEx3 in3 = new InterfaceEx3();
		in3.c();
		in3.a();
		System.out.println(in3.b());
		in3.d();
		
		AbsClass ac = new InterfaceEx3();
		ac.c(); // 이거만 부모가 가지고 있는 메서드라서 사용가능 
		//ac.a();
		//ac.d();
		
		InterfaceF inF = new InterfaceEx3();
		//inF.c();
		inF.a();
		inF.d();
	}
}

package interfaceEx;

public class InterfaceEx1 {
	public static void main(String[] args) {
		
	}
}


interface Inter1
{
	void aa();//abstract public void aa();
}

interface Inter2
{
	void bb();
}
class MyClass implements Inter1, Inter2{
	public void aa() {}
	public void bb() {}
	
}

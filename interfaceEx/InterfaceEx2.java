package interfaceEx;

interface Inter01
{
	void aa();
}

interface Inter02 extends Inter1
{
	void bb();
}


interface Inter3 extends Inter01, Inter02
{
	void cc();
}

class Super{
	
}


class B extends Super implements Inter2, Inter3
{
	public void aa() {}
	public void bb() {}
	public void cc() {}
}













public class InterfaceEx2 {

}

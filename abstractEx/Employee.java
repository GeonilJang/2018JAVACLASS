package abstractEx;

//추상 클래스는 인스턴스를 만들 수 없다 즉! 오버라이딩 해줘야 한다.
abstract public class Employee 
{
	String name;
	
	public Employee(String name)
	{
		this.name = name;
	}
	
	abstract public int income();
	
	
	public void getInfo()
	{
		System.out.println("이름 :"+name+"수입 : "+income());
	}
	
}

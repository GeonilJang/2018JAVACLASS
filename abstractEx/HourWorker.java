package abstractEx;

public class HourWorker extends Employee
{
	int payHour = 5000;
	int workHour = 8;
	
	public HourWorker(String name)
	{
		super(name);
	}
	
	// 이름과 모든것이 같고 안에 실행 내용이 다른 것을 "오버라이디" --- 오버로딩은 동일이름으로 받는 인자 다른 것을 말한다.
	public int income()
	{
		return payHour * workHour;
	}
	
}

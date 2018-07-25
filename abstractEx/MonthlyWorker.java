package abstractEx;

public class MonthlyWorker extends Employee
{
	int payHour = 5000;
	int workHour = 8;
	int workMonth = 1;
	
	public MonthlyWorker(String name)
	{
		super(name);
	}
	
	public int income()
	{
		return (payHour * workHour) * (workMonth * 25);
	}
}

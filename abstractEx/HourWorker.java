package abstractEx;

public class HourWorker extends Employee
{
	int payHour = 5000;
	int workHour = 8;
	
	public HourWorker(String name)
	{
		super(name);
	}
	
	// �̸��� ������ ���� �ȿ� ���� ������ �ٸ� ���� "�������̵�" --- �����ε��� �����̸����� �޴� ���� �ٸ� ���� ���Ѵ�.
	public int income()
	{
		return payHour * workHour;
	}
	
}

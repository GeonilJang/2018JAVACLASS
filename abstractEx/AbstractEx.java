package abstractEx;

public class AbstractEx {
	public static void main(String[] args) {
		
		HourWorker hw = new HourWorker("ȫ�浿");
		hw.getInfo();
		
		WeeklyWorker ww = new WeeklyWorker("��ȣ��");
		ww.getInfo();
		
		MonthlyWorker mw = new MonthlyWorker("����");
		mw.getInfo();
		
	}
}

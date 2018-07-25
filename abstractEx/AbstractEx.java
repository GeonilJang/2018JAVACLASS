package abstractEx;

public class AbstractEx {
	public static void main(String[] args) {
		
		HourWorker hw = new HourWorker("홍길동");
		hw.getInfo();
		
		WeeklyWorker ww = new WeeklyWorker("강호동");
		ww.getInfo();
		
		MonthlyWorker mw = new MonthlyWorker("미자");
		mw.getInfo();
		
	}
}

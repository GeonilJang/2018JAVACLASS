package abstractEx;

class FinalEx
{
	public static final int AA = 10;
						int aa = 100;
}

public class FinalEx2 {
	public static void main(String[] args) {
		FinalEx fe = new FinalEx();
		System.out.println(fe.aa);
		System.out.println(FinalEx.AA);
		
		fe.aa = -100;
		//Final.AA = 200; // final이 붙은 변수는 값을 항당 할 수 없다!!
		
		System.out.println(fe.aa);
		System.out.println(FinalEx.AA);
		
	}
}

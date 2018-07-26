package EnumEx;

//interface LEVEL{
//	public static final int PLATINUM_MEMBER = 1,ROYAL_MEMBER = 2,COLD_MEMBER = 3,SIVER_MEMBER = 4;
//}
//
//interface B{
//	public static final int PLATINUM_MEMBER = 1,ROYAL_MEMBER = 2,COLD_MEMBER = 3,SIVER_MEMBER = 4;
//}



class B{
	public static final B PLATINUM_MEMBER = new B();
	public static final B ROYAL_MEMBER = new B();
	public static final B COLD_MEMBER = new B();
	public static final B SIVER_MEMBER = new B();
}

public class EnumEx1 {


//class A{
//	public static final A PLATINUM_MEMBER = new A();
//	public static final A ROYAL_MEMBER = new A();
//	public static final A COLD_MEMBER = new A();
//	public static final A SIVER_MEMBER = new A();
//	
//	private A() {}
//} 자체적으로 위와같은 형식을 만들어 주는 클래스입니다.
	enum LEVEL{
		
		PLATINUM_MEMBER(30),ROYAL_MEMBER(20),COLD_MEMBER(10),SIVER_MEMBER(5);
		
		int discount;
		
		LEVEL(int discounst){
			this.discount = discounst;
			System.out.println("call Level() : "+this+" -> "+discount+"%할인.");
		}
		
		public String getDiscount() {
			return discount + "% 할인";
		}
	}
	
	
	
	public static void main(String []args) {
		
//		if(A.PLATINUM_MEMBER == B.PLATINUM_MEMBER) {
//			System.out.println("같아요.");
//		}
		
		
		LEVEL grade = LEVEL.COLD_MEMBER;
		System.out.println(grade.getDiscount());
		System.out.println("===============================");
		
		for(LEVEL level : LEVEL.values()) {
			System.out.println(level+" : "+level.getDiscount());
		}
		
		
		
		
//		switch(grade) {
//		case PLATINUM_MEMBER:
//		  System.out.println(30+"% 할인.");
//		  break;
//		case ROYAL_MEMBER:
//		  System.out.println(20+"% 할인.");
//		  break;
//		case COLD_MEMBER:
//		  System.out.println(10+"% 할인.");
//		  break;
//		case SIVER_MEMBER:
//		  System.out.println(50+"% 할인.");
//		  break;
//		}
	}
}

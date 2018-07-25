
class CarDemo{
	
	static String kind; // static 이 들어간 변수는 클래스 변수 입니다.  (클래스 변수)

	//멤버변수는 초기화를 하지 않을 경우에 default 값이 들어간다.
	// 지역변수는 꼭 초기화를 해야한다.
	// int = 0 / String = null 값이 기본 값으로 들어 간다.
	
	int speed=50; //(인스턴스 변수입니다.)
	int number; 
	String color = "red";
	
	
	
	public CarDemo() {
		kind = "소형차";
		int aa = 20;
	}
	
	
	public static void kind() { //클래스 메소드
		System.out.println("소형차 입니다.");
	}
	
	public void speedUp() {
		kind = "대형차";
		speed += 10;
	}
	
	 public void speedDown() {
		 speed -= 5;
	 }
}



public class OopEx {
	
	static String kind1;
	
	
	public static void main(String [] args)
	{
		
		System.out.println(kind1); // 같은 클래스내에 있는 클래스변수를 호출하는 경우에는 클래스명을 생략할 수 있다.
		
		
		System.out.println("CarDemo.kind : "+CarDemo.kind);
		CarDemo myCar = new CarDemo();
		
		myCar.color ="흰색 입니다.";
		
		System.out.println("클래스 변수  kind = "+CarDemo.kind);
		System.out.println("인스턴스 변수 color = "+ myCar.color);
		
		CarDemo yourCar = new CarDemo();
		System.out.println("클래스 변수 kind = "+CarDemo.kind);
		System.out.println("youCar color is "+yourCar.color);
		
		
		
		
		
		
		
		
		
		int c = 10;
		System.out.println("지역변수 : "+c); // 지역변수는 항상 초기화를 해줘야합니다. 
		
		//System.out.println("지연변수 : "+myCar.aa); 생성자 안에서만 사용하느 것이기 때문에 외부에서는 사용할 수없다.
		
		//멤버 메소드의 호출
		System.out.println("myCar.speend:"+myCar.speed);
		myCar.speedUp();
		System.out.println("myCar.speend:"+myCar.speed);
		
		
		System.out.println("yourCar.speend:"+yourCar.speed);
		yourCar.speedUp();
		System.out.println("yourCar.speend:"+yourCar.speed);
		
		//클래스 메소드 호출 : 객체를 생성할 필요가 = 인스턴스를 생성할 필요가 없다
		CarDemo.kind();
		System.out.println(CarDemo.kind);
		
		//why you use static method를 사용하는가-> 스텟틱 변수만을 하용할 수 있다 이유는! 인스턴스 변수는 인스턴스가 있어야지만 사용이 가능하기 때문이다
		
		System.out.println("This is what you want to do with Java right?");
		String str = "You are writing something special to make something good\n i don't think this is working.";
		System.out.println(str);

		
		
		
	}
}

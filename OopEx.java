
class CarDemo{
	
	static String kind; // static �� �� ������ Ŭ���� ���� �Դϴ�.  (Ŭ���� ����)

	//��������� �ʱ�ȭ�� ���� ���� ��쿡 default ���� ����.
	// ���������� �� �ʱ�ȭ�� �ؾ��Ѵ�.
	// int = 0 / String = null ���� �⺻ ������ ��� ����.
	
	int speed=50; //(�ν��Ͻ� �����Դϴ�.)
	int number; 
	String color = "red";
	
	
	
	public CarDemo() {
		kind = "������";
		int aa = 20;
	}
	
	
	public static void kind() { //Ŭ���� �޼ҵ�
		System.out.println("������ �Դϴ�.");
	}
	
	public void speedUp() {
		kind = "������";
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
		
		System.out.println(kind1); // ���� Ŭ�������� �ִ� Ŭ���������� ȣ���ϴ� ��쿡�� Ŭ�������� ������ �� �ִ�.
		
		
		System.out.println("CarDemo.kind : "+CarDemo.kind);
		CarDemo myCar = new CarDemo();
		
		myCar.color ="��� �Դϴ�.";
		
		System.out.println("Ŭ���� ����  kind = "+CarDemo.kind);
		System.out.println("�ν��Ͻ� ���� color = "+ myCar.color);
		
		CarDemo yourCar = new CarDemo();
		System.out.println("Ŭ���� ���� kind = "+CarDemo.kind);
		System.out.println("youCar color is "+yourCar.color);
		
		
		
		
		
		
		
		
		
		int c = 10;
		System.out.println("�������� : "+c); // ���������� �׻� �ʱ�ȭ�� ������մϴ�. 
		
		//System.out.println("�������� : "+myCar.aa); ������ �ȿ����� ����ϴ� ���̱� ������ �ܺο����� ����� ������.
		
		//��� �޼ҵ��� ȣ��
		System.out.println("myCar.speend:"+myCar.speed);
		myCar.speedUp();
		System.out.println("myCar.speend:"+myCar.speed);
		
		
		System.out.println("yourCar.speend:"+yourCar.speed);
		yourCar.speedUp();
		System.out.println("yourCar.speend:"+yourCar.speed);
		
		//Ŭ���� �޼ҵ� ȣ�� : ��ü�� ������ �ʿ䰡 = �ν��Ͻ��� ������ �ʿ䰡 ����
		CarDemo.kind();
		System.out.println(CarDemo.kind);
		
		//why you use static method�� ����ϴ°�-> ����ƽ �������� �Ͽ��� �� �ִ� ������! �ν��Ͻ� ������ �ν��Ͻ��� �־������ ����� �����ϱ� �����̴�
		
		System.out.println("This is what you want to do with Java right?");
		String str = "You are writing something special to make something good\n i don't think this is working.";
		System.out.println(str);

		
		
		
	}
}

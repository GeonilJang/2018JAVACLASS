package GenericEx;


interface Data1{
	int getData();
}

class Data{
	public String getData() {
		return "����� ������";
	}
}

class StudentData1 implements Data1{
	public String name;
	
	public int getData() {
		return 20180202;
	}
	
	StudentData1(String name){
		this.name = name;
	}
	
	public String toString() {
		return "¯���� �����";
	}
	
	public String say() {
		System.out.println("SayHello");
		return "SayHello";
	}
}






class Person1<T extends Data1>{
	public T p2;
//	public E id;
	
	Person1(T data){
//		this.data = data;
//		this.id = id;
	}
	
	public <T> void getInfo(T data) {
		System.out.println(data);
	}
}


public class GenericDomo3 {
	public static void main(String[] args) {
//		Person1 p1 = new Person1(new StudentData("ȫ�浿"),new Integer(321));
//		System.out.println("p1.data : "+p1.data+"\np1.id : "+p1.id);

//		StudentData1 sd = new StudentData1("������");
//		System.out.println(sd);
//		p1.getInfo(sd);

		
//		Person1 p2 = new Person1("�����ڹ�");
		StudentData1 sd2 = new StudentData1("geonil");
		Person1 p2 = new Person1(sd2);
		
		
	}
	
}

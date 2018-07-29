package GenericEx;

class StudentData{
	public String name;
	
	StudentData(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public String say() {
		System.out.println("SayHello");
		return "SayHello";
	}
}

class Person<T,E>{
	public T data;
	public E id;
	
	Person(T data, E id){
		this.data = data;
		this.id = id;
	}
}


public class GenericDemo2 {
	public static void main(String[] args) {
		Person<StudentData, Integer> p1 = new Person<StudentData, Integer>(new StudentData("ȫ�浿"),new Integer(321));
		System.out.println("p1.data : "+p1.data.say()+"\np1.id : "+p1.id);
		
		
	}
}

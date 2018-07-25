package com.geonil.javalec;
//부모클래서 Super class 상위 클래스.



class Human
{
	String name;
	int age;
	
	 public Human()
	 {
		
	 }
	 public Human(String name, int age)
	 {
		 this.name = name;
		 this.age = age;
	 }
	
	public void getInfo() 
	{
		System.out.println("이름 : "+name+"\n나이 : "+age);
	}
	
}// end of Human class



//super() 생성자안에서만 호출 할 수 있다. 항상 생서자의 첫줄에 와야한다.
//static 메소드 안에서는 사용할 수 없다.
// 유저가 생성자를 작성하지 않은 경우에는 하위클래스의 생성자에서 자동으로 호출한다.


//하위 클래스
//super(변수): 부모클래스의 객체를 의미 "super.변수 "--> 부모클래스의 변수를 접근
//this : 자신의 객체를 의미 
//super() 메소드 : 부모클래스(super class)의 생성자를 호출하기위한 메서드
//this() 메소드 : 자신의 생성자를 호출하기 위한 메서드
class Employee extends Human
{
	
	int salary;
	
	public Employee(String name, int age, int salary)
	{
		super(name, age); //자동으로생성하게 되있습니다.  자동으로 생성자를만들고 자동으로 기본생적자는 만들어 져있습니다.
		this.salary = salary;
	}
	
	//메소드 오버라이딩(overriding) : 재정의
	//호출하고자 하는 메소드는 부모클래스에 존재 해야 하며
	//메소드명은 동일해야 한다.
	//매개변수와 타입이 같고
	//반환 타입도 같다.
	//접근제어자는 부모클래스보다 넓거나 같다.
	//수행할 내용은 달라야 한다.
	public void getInfo()
	{
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n월급 : "+ salary);
	}
}// end of Employee class


//하위 클래스
class Students extends Human
{
	int grade;
	
	public Students(String name, int age, int grade)
	{
		super(name, age);
		this.grade = grade;
	}
	
	public void getInfo()
	{
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n학년 : "+ grade);
	}
}// end of Students class





public class InheritanceEx
{
	public static void main(String[] args)
	{
		
		Employee em = new Employee("강호동",40,500);
		em.getInfo();
		
		Students st = new Students("홍길동",30,13);
		st.getInfo();
	}
}

package com.geonil.javalec;

public class Student 
{
	//<1>추상화를 하는 것이다. 속성과 기능의 일부를 부각하여 만들어 내는 것을

	
	//private을 선원 해두면 현재  클래스 안에서만 사용이가능하며, 다른 곳에서 사용하기 위해서는  setter getter 메소드 선언하여 사용한다.
	//<2>캡슐화 하기.
	private String name;
	private int id;
	private int age;
	
	//<2>캡슐화 하기.
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void showInfo()
	{
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+id);
		System.out.println("학번 : "+age);
	}
	
	
	
	
	public static void main(String args[])
	{
		Student stu = new Student();
		stu.name = "강동원";
		System.out.println(stu.name);
	}
	
	

}

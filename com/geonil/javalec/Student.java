package com.geonil.javalec;

public class Student 
{
	//<1>�߻�ȭ�� �ϴ� ���̴�. �Ӽ��� ����� �Ϻθ� �ΰ��Ͽ� ����� ���� ����

	
	//private�� ���� �صθ� ����  Ŭ���� �ȿ����� ����̰����ϸ�, �ٸ� ������ ����ϱ� ���ؼ���  setter getter �޼ҵ� �����Ͽ� ����Ѵ�.
	//<2>ĸ��ȭ �ϱ�.
	private String name;
	private int id;
	private int age;
	
	//<2>ĸ��ȭ �ϱ�.
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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+id);
		System.out.println("�й� : "+age);
	}
	
	
	
	
	public static void main(String args[])
	{
		Student stu = new Student();
		stu.name = "������";
		System.out.println(stu.name);
	}
	
	

}

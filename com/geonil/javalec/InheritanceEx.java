package com.geonil.javalec;
//�θ�Ŭ���� Super class ���� Ŭ����.



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
		System.out.println("�̸� : "+name+"\n���� : "+age);
	}
	
}// end of Human class



//super() �����ھȿ����� ȣ�� �� �� �ִ�. �׻� �������� ù�ٿ� �;��Ѵ�.
//static �޼ҵ� �ȿ����� ����� �� ����.
// ������ �����ڸ� �ۼ����� ���� ��쿡�� ����Ŭ������ �����ڿ��� �ڵ����� ȣ���Ѵ�.


//���� Ŭ����
//super(����): �θ�Ŭ������ ��ü�� �ǹ� "super.���� "--> �θ�Ŭ������ ������ ����
//this : �ڽ��� ��ü�� �ǹ� 
//super() �޼ҵ� : �θ�Ŭ����(super class)�� �����ڸ� ȣ���ϱ����� �޼���
//this() �޼ҵ� : �ڽ��� �����ڸ� ȣ���ϱ� ���� �޼���
class Employee extends Human
{
	
	int salary;
	
	public Employee(String name, int age, int salary)
	{
		super(name, age); //�ڵ����λ����ϰ� ���ֽ��ϴ�.  �ڵ����� �����ڸ������ �ڵ����� �⺻�����ڴ� ����� ���ֽ��ϴ�.
		this.salary = salary;
	}
	
	//�޼ҵ� �������̵�(overriding) : ������
	//ȣ���ϰ��� �ϴ� �޼ҵ�� �θ�Ŭ������ ���� �ؾ� �ϸ�
	//�޼ҵ���� �����ؾ� �Ѵ�.
	//�Ű������� Ÿ���� ����
	//��ȯ Ÿ�Ե� ����.
	//���������ڴ� �θ�Ŭ�������� �аų� ����.
	//������ ������ �޶�� �Ѵ�.
	public void getInfo()
	{
		System.out.println("�̸� : "+name+"\n���� : "+age+"\n���� : "+ salary);
	}
}// end of Employee class


//���� Ŭ����
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
		System.out.println("�̸� : "+name+"\n���� : "+age+"\n�г� : "+ grade);
	}
}// end of Students class





public class InheritanceEx
{
	public static void main(String[] args)
	{
		
		Employee em = new Employee("��ȣ��",40,500);
		em.getInfo();
		
		Students st = new Students("ȫ�浿",30,13);
		st.getInfo();
	}
}

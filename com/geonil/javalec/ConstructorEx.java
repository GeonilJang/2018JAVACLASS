package com.geonil.javalec;

class TextBook
{
	String title;
	String author;
	int grade;
	
	public TextBook()
	{//�⺻������, �����ڴ� ��ü�� ȣ���Ҷ� �ڵ����� �����Ǹ� ���� �ȴ�.
		//this: �ڱ� Ŭ������ �ν��Ͻ� ������ ������ �� ���
		title="����";
		author="�����";
		grade =14;
	}

	public TextBook(String title)
	{
		this(title,"���浿");
		this.title = title;
	}
	public TextBook(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	public TextBook(String title, String author, int grade)
	{
		this.title = title;
		this.author = author;
		this.grade = grade;
	}	
	
	public void getBook()
	{
		System.out.println("���� : "+title);
		System.out.println("���� : "+author);
		System.out.println("�г� : "+grade);
	}
	
	
	
	
	
}// end of TextBook class


public class ConstructorEx 
{

	public static void main(String[] args) 
	{
		TextBook tb = new TextBook("����","������",19);
		System.out.println(tb.title);
		System.out.println(tb.author);
		System.out.println(tb.grade);

	}

}

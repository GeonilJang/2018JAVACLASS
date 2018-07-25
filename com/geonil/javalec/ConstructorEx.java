package com.geonil.javalec;

class TextBook
{
	String title;
	String author;
	int grade;
	
	public TextBook()
	{//기본생성자, 생성자는 객체를 호출할때 자동으로 생성되며 실행 된다.
		//this: 자기 클래스의 인스턴스 변수를 접근할 때 사용
		title="국어";
		author="장건일";
		grade =14;
	}

	public TextBook(String title)
	{
		this(title,"남길동");
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
		System.out.println("과목 : "+title);
		System.out.println("저자 : "+author);
		System.out.println("학년 : "+grade);
	}
	
	
	
	
	
}// end of TextBook class


public class ConstructorEx 
{

	public static void main(String[] args) 
	{
		TextBook tb = new TextBook("국어","건일이",19);
		System.out.println(tb.title);
		System.out.println(tb.author);
		System.out.println(tb.grade);

	}

}

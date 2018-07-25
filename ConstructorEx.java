//생성자 오버로딩

//생성자 : 인스턴스(객체)를 생성할 때 호출 할때 메소드의 일종 .생성할 때 "최초 실행 되는 메서드"

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
	
	public TextBook(String title, String author, int grade)
	{
		this.title = title;
		this.author = author;
		this.grade = grade;
	}	
}// end of TextBook class


public class ConstructorEx 
{

	public static void main(String[] args) 
	{
		TextBook tb = new TextBook();
		System.out.println(tb.title);
		System.out.println(tb.author);
		System.out.println(tb.grade);

	}

}

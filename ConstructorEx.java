//������ �����ε�

//������ : �ν��Ͻ�(��ü)�� ������ �� ȣ�� �Ҷ� �޼ҵ��� ���� .������ �� "���� ���� �Ǵ� �޼���"

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

package ObjectExs;

public class ObjectEx1 {
	
	public static void main(String []args) {
		//System.out.println("Hello Jave.");
		ObjectEx1 obj = new ObjectEx1(); 
		obj.toStringFnc(); //Ĵü�� �Ű������� �޾Ƽ� ���.
	}
	
	
	
	public String toString() {
		return "ObjectEx1 Ŭ�����Դϴ�.";
	
	}
	
	public void toStringFnc() {
		System.out.println(this);
		System.out.println(toString()); //Object Class �ȿ�����ִ� �޼ҵ��Դϴ�. 
		System.out.println("���� : "+this);
	}
}

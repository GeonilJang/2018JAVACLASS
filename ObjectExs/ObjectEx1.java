package ObjectExs;

public class ObjectEx1 {
	
	public static void main(String []args) {
		//System.out.println("Hello Jave.");
		ObjectEx1 obj = new ObjectEx1(); 
		obj.toStringFnc(); //캑체를 매개변수로 받아서 사용.
	}
	
	
	
	public String toString() {
		return "ObjectEx1 클래스입니다.";
	
	}
	
	public void toStringFnc() {
		System.out.println(this);
		System.out.println(toString()); //Object Class 안에들어있는 메소드입니다. 
		System.out.println("하이 : "+this);
	}
}

package GenericEx;

class Demo{
	
	public Integer data;
	
	public void setData(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
}

class GenericDemo <T>{
	
	public T data;
		
		public void setData(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
}

public class GenericDemo1 {
	public static void main(String []args) {
		System.out.println("일반 클래스 호출 --------------\n");
		Demo d1 = new Demo();
		Integer ing = 100;
		d1.setData(ing);
		System.out.println("data = "+d1.getData());
		
		System.out.println("제너릭 클래스 호출 --------------\n");
		GenericDemo <Integer> gd = new GenericDemo<Integer>();
		gd.setData(new Integer(200));
		System.out.println(gd.getData());
		
		System.out.println("제너릭 클래스 호출 --------------");
		GenericDemo <String> sgd = new GenericDemo<String>();
		sgd.setData("하이 자바");
		System.out.println(sgd.getData());
	}
}

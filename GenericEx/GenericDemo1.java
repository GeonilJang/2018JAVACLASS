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
		System.out.println("�Ϲ� Ŭ���� ȣ�� --------------\n");
		Demo d1 = new Demo();
		Integer ing = 100;
		d1.setData(ing);
		System.out.println("data = "+d1.getData());
		
		System.out.println("���ʸ� Ŭ���� ȣ�� --------------\n");
		GenericDemo <Integer> gd = new GenericDemo<Integer>();
		gd.setData(new Integer(200));
		System.out.println(gd.getData());
		
		System.out.println("���ʸ� Ŭ���� ȣ�� --------------");
		GenericDemo <String> sgd = new GenericDemo<String>();
		sgd.setData("���� �ڹ�");
		System.out.println(sgd.getData());
	}
}

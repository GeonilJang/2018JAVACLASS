package exeptionEx;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		try {
		
			System.out.println(intArray[0]);
			System.out.println(intArray[5]);
		}catch(Exception e)
		{
			System.out.println("���ܹ߻� : ���̴� "+intArray.length+"�Դϴ�.");
			System.out.println(e);
			for(int i : intArray)
				System.out.println(i);
		}
	}
}

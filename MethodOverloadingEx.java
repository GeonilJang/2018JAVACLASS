
/*Overloading : 다중정의
 * 
 * 메서드의 이름이 같아야 한다.
 * 매개변수의 개수 또틑 데이터타입 또는 순서가 달라야 한다.
 * 매개변수틑 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.(리턴타입은 다르거나, 같거나 상관없음.)
 * 
 * */


public class MethodOverloadingEx 
{
	
	public void getAdd() 
	{
		System.out.println("오버로딩");
	}
	
	
	public int getAdd(int i, int j)
	{
		return i+j;
	}
	
	public int getAdd(int i, int j, int k )
	{
		return i+j+k;
	}
	
	public int getAdd(float i, int j, int k )
	{
		return (int)(i+j+k);
	}
	
	
	
	//오버로딩이 성립이 안된다. 위에 (같은타입의 매개변수가 같기 때문에...)
//	public int getAdd(int ii, int jj, int kk )
//	{
//		return ii+jj+kk;
//	}
	
	public double getAdd(double i, int j, int k)
	{
		return (int)(i+j+k);
	}
	
	
	public int getAdd(int i, float k, int j)
	{
		return i+j+(int)k;
	}
	
	

	public static void main(String[] args) 
	{
		MethodOverloadingEx mOver = new MethodOverloadingEx();
		mOver.getAdd();
		
		int a = mOver.getAdd(10, 20);
		System.out.println(a);
		
		int b = mOver.getAdd(10,20,30);
		System.out.println(b);
		
		
		
		
	}// end of main
}


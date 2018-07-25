
/*Overloading : ��������
 * 
 * �޼����� �̸��� ���ƾ� �Ѵ�.
 * �Ű������� ���� �Ǻz ������Ÿ�� �Ǵ� ������ �޶�� �Ѵ�.
 * �Ű������z ���� ����Ÿ���� �ٸ� ���� �����ε��� �������� �ʴ´�.(����Ÿ���� �ٸ��ų�, ���ų� �������.)
 * 
 * */


public class MethodOverloadingEx 
{
	
	public void getAdd() 
	{
		System.out.println("�����ε�");
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
	
	
	
	//�����ε��� ������ �ȵȴ�. ���� (����Ÿ���� �Ű������� ���� ������...)
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


package com.geonil.javalec;

public class School 
{
	public static void main(String []args)
	{
		//private ���ϱ⶧���� ������ �Ұ����ϴ�.
		Student st = new Student();
		st.setName("geonil");
		st.setId(20180105);
		st.setAge(27);
		
//		System.out.println("�̸� : "+st.getName());
//		System.out.println("���� : "+st.getAge());
//		System.out.println("�й� : "+st.getId());
		
		st.showInfo();
		
	}//end of main
	
	
}//end of class

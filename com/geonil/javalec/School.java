package com.geonil.javalec;

public class School 
{
	public static void main(String []args)
	{
		//private 을하기때문에 접근이 불가능하다.
		Student st = new Student();
		st.setName("geonil");
		st.setId(20180105);
		st.setAge(27);
		
//		System.out.println("이름 : "+st.getName());
//		System.out.println("나이 : "+st.getAge());
//		System.out.println("학번 : "+st.getId());
		
		st.showInfo();
		
	}//end of main
	
	
}//end of class

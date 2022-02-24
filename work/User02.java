class User02 
{

	/*
		FileName: User02.java

		
	::Constructor 의미 이해
	1. 인스턴스와 생성시 new A90의 의미의 이해
	2. new 와 같이 사용되는 특수한 행위를 하는 method 이해
	3.Constructor 주 작업, 용도는?
	======================================
	==> 생성자는 인스턴스 생성시 호출된다.
	==> 주 작업은 Field 와 같이 사용되는 특수한 행위를 하는 method 를 이해
	==> 생성시 상태를 갖는 인스턴스 생성

	*/

	//Field
	String name;
	int javaLevel;


	//Constructer
	public User02(){
		System.out.println("Constructer Method");
		name = "홍길동";
		javaLevel = 0;
	}

	//Method
	// getter Method definition
	public String getName(){
		return name;
	}
	
	public int getJavaLevel(){
		return javaLevel;
	}
	

	// Main


	public static void main(String[] args) 
	{
		System.out.println("==============");
		User02 user = new User02();
		System.out.println("==============");

		System.out.println("name: "+user.getName());
		System.out.println("javaLevel: "+user.getJavaLevel());
	}// main
}// class

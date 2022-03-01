class User02 
{

	/*
		FileName: User02.java

		
	::Constructor �ǹ� ����
	1. �ν��Ͻ��� ������ new A90�� �ǹ��� ����
	2. new �� ���� ���Ǵ� Ư���� ������ �ϴ� method ����
	3.Constructor �� �۾�, �뵵��?
	======================================
	==> �����ڴ� �ν��Ͻ� ������ ȣ��ȴ�.
	==> �� �۾��� Field �� ���� ���Ǵ� Ư���� ������ �ϴ� method �� ����
	==> ������ ���¸� ���� �ν��Ͻ� ����

	*/

	//Field
	String name;
	int javaLevel;


	//Constructer
	public User02(){
		System.out.println("Constructer Method");
		name = "ȫ�浿";
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
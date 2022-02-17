class User03 
{

	/*
		FileName: User03.java

			::Constructor �ǹ� ����
	1. �ν��Ͻ��� ������ new A90�� �ǹ��� ����
	2. new �� ���� ���Ǵ� Ư���� ������ �ϴ� method ����
	3.Constructor �� �۾�, �뵵��?
	======================================
	==> �����ڴ� �ν��Ͻ� ������ ȣ��ȴ�.
	==> �� �۾��� Field �� ���� ���Ǵ� Ư���� ������ �ϴ� method �� ����
	==> ������ ���¸� ���� �ν��Ͻ� ����
	======================================
	==> Method OverLoading : Method �پ��� Ȱ��
	==> Constructor Method OverLoading : Constructor Method �پ��� Ȱ��
	==> ������ �پ��� ���¸� ���� ��ü�� �����Ѵ�.

	*/

	//Field
	String name;
	int javaLevel;

	//Constructor
	public User03(){
		System.out.println("���� ������");
		name = "ȫ�浿";
		javaLevel = 0;
	}
	// �ν��Ͻ� ������ name ���°��� �����ϴ�(�ʱ�ȭ) ������

	public User03(String str){
		System.out.println("���� String�� ���ڷ� �޾� name�� �ʱ�ȭ�ϴ� ������");
		name = str;
	}
	
	// �ν��Ͻ� ������ javaLevel ���°��� �����ϴ�(�ʱ�ȭ) ������
	public User03(int i){
		System.out.println("���� int�� ���ڷ� �޾� javaLevel�� �ʱ�ȭ�ϴ� ������");
		javaLevel = i;
	}

	//�ν��Ͻ� ������ name, javaLevel ���°��� �����ϴ�(�ʱ�ȭ)������

	public User03(String str, int i){
		System.out.println("���� String,int ���ڸ� �޾� name, javaLevel�� �ʱ�ȭ�ϴ� ������");
		name = str;
		javaLevel = i;
	}
	
	//Method
	//getter Method definition
	public String getName(){
		return name;
	}

	public int getJavaLevel(){
		return javaLevel;
	}

	//main
	public static void main(String[] args) 
	{

		//==> ������ �����ε��� ������ ȣ��� ���°��� ����غ���...
		System.out.println("==========================");
		
		User03 user01 = new User03();
		System.out.println("name: "+user01.getName());
		System.out.println("javaLevel: "+user01.getJavaLevel());

		System.out.println("==========================");
		User03 user02 = new User03("ȫ���");
		//==> ���°��� �������� ����(�ʱ�ȭ��������) javaLevel�� ��°���?
		System.out.println("name: "+user02.getName());
		System.out.println("javaLevel: "+user02.getJavaLevel());

		System.out.println("==========================");
		//==> ���°��� �������� ����(�ʱ�ȭ��������)name�� ��°���?
		User03 user03 = new User03(100);
		System.out.println("name: "+user03.getName());
		System.out.println("javaLevel: "+user03.getJavaLevel());

		System.out.println("==========================");
		User03 user04 = new User03("�̼���", 200);
		System.out.println("name: "+user04.getName());
		System.out.println("javaLevel: "+user04.getJavaLevel());

	}//main
}//class

class Son extends Iam
{
	/*
		FileName : Son.java
		o Iam.class �� �Ϲ�ȭ����
		o Iam.class �� ��Ӱ� ������ �����ϸ�, �߰���, ��ü���� �Ӽ�, ������ ���´�.
	*/
	//Field
	String school;

	//Constructor
	public Son(){
		System.out.println("Son class default constructor");
	}
	//Method(setter method)
	public void setSchool(String str){
		school = str;
	}

	//getter method
	public String getSchool(){
		return school;
	}

	public static void main(String[] args) 
	{
		//1.�Ʒ��� �ν��Ͻ� ������ ��°���� ����, ����
		//2.OOP�� �Ϲ�ȭ������ ����(�Ӽ�,����)�� OOPL���� ��� �����ϴ����� ����
		//3.�Ʒ��� �ּ��� Ǯ�� �Ӽ�, ������ ������ Ȯ���Ѵ�.

		Son son = new Son();

		
		son.setName("ȫ�浿�Ƶ�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("����Ƽ��������");
	
		System.out.println("�̸� : "+son.getName());
		System.out.println("���� : "+son.getAge());
		System.out.println("���� : "+son.getJob());
		System.out.println("���� : "+son.getSchool());
		
	}//main
}//class

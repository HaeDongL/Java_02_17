class Employee

/*
	FileName: Employee.java
	1.���(�Ϲ�ȭ����)�� �������� ����
	2. �����ڸ� ���������� ȣ���ϴ� this(). super() method ����
	==> �Ʒ��� ���� ���ظ� ���� super(), this() / super, this�� ���� �� �ǹ̸� ����
*/
{
	
	//Field
	String part; 
	String name;
	int age;
	int baseSalary;

	//Constructor
	public Employee(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee(String name){
		this.name = name;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Emp�� name, part�� �޴� Constructor");
	}
	public Employee(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Emp�� name, part, age�� �޴� Constructor");
	}
	//Method

	public int salary(){
		System.out.println("Emp�� salay() method");
		baseSalary = 100;
		return baseSalary;
	}

}//class
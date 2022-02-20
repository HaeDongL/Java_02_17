class Human
{
	///Field
	String name;
	int age;
	//Constructor
	public Human(){

	}

	public Human(String name){
		this.name = name;
	}
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age);
	}
}


class Student extends Human
{
	///Field
	int id;

	///Constructor
	public Student(){
	}

	public Student(String name){
		super(name);
	}
	
	public Student(String name, int age){
		super(name,age);
	}
	
	public Student(String name, int age, int id){
		super(name,age);
		this.id = id;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t학    번 : "+this.id);
	}

}

class Teacher extends Human
{	
	///Field
	String subject;

	///Constructor
	public Teacher(){
	}

	public Teacher(String name){
		super(name);
	}

	public Teacher(String name, int age){
		super(name,age);
	}

	public Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t담당과목 : "+this.subject); 
	}
}

class Employee extends Human
{
	///Field
	String dept;

	///Constructor
	public Employee(){
	}

	public Employee(String name){
		super(name);
	}

	public Employee(String name, int age){
		super(name,age);
	}

	public Employee(String name, int age, String dept){
		super(name,age);
		this.dept = dept;
	}

	///Method
	public void print(){
		System.out.println("이름 : "+this.name+"\t나이 : "+this.age+"\t부    서 : "+this.dept);
	}
}


public class Prob13
{


	public static void main(String[] args) 
	{
		Student s = new Student("홍길동",20,200201);
		Teacher t = new Teacher("이순신",30,"JAVA");
		Employee e = new Employee("유관순",40,"교무과");

		s.print();
		t.print();
		e.print();
	}
}


class Son extends Iam
{
	/*
		FileName : Son.java
		o Iam.class 와 일반화관계
		o Iam.class 와 상속과 행위를 공유하며, 추가적, 구체적인 속성, 행위를 갖는다.
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
		//1.아래의 인스턴스 생성시 출력결과를 학인, 이해
		//2.OOP의 일반화관계인 공유(속성,행위)을 OOPL에서 어떻게 지원하는지를 이해
		//3.아래의 주석을 풀고 속성, 행위의 공유를 확인한다.

		Son son = new Son();

		
		son.setName("홍길동아들");
		son.setAge(50);
		son.setJob("개발자준비중");
		son.setSchool("아이티교육센터");
	
		System.out.println("이름 : "+son.getName());
		System.out.println("나이 : "+son.getAge());
		System.out.println("직업 : "+son.getJob());
		System.out.println("직업 : "+son.getSchool());
		
	}//main
}//class

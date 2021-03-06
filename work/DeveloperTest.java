//package jb03.part03;
/*
FildName: DevaloperTest.java
::Devaloper.class Instance 생성, 사용하는 class 정의 : Application class
*/
class DeveloperTest
{
	//Field
	//Method
	//main method
	public static void main(String[] args) 
	{
		
		//Developer.class 를 instance 화 함(keyword new 사용함)
		Developer developer = new Developer();

		// developer 식별성을 갖는 Instance . 연산자
		System.out.println("이름: "+developer.name);
		System.out.println("직업: "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);

		System.out.println("=======================================");

		//project에 참여
		developer.participateProject();
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("project 참여 경력은 : "+developer.projectCareer);

		System.out.println("=======================================");

		//1개 과목을 강의
		developer.instruct();
		System.out.println("평균수입은 : "+developer.avgIncome);


	}//main
}//class

//package jb03.part06;

/*
	FileName: Developer2.java

	::강의활동과, 개발을 병행하는 홍길동을 Object Modeling
	1. 홍길동의 명사화 가능한 것 : attribute ==> Field
	2. 행위에 해당하는 사항은    : behavior ==> Method
	3. 참여한 project의 name을 표기 할 수 있는 행위 추가
	4. 강의 수에 따른 income 의 정도를 명시 할 수 있는 행위 추가
	=======================================================================

	추가적인 사항
		1.Field 정보를 return 하는 행위를 현한 getter method정의
		(객체의 attribute는 information hiding(Encapsulation)되어 있으며,
		행위를 통해서 information hiding 되있는 정보에 접근할 수 있다.)
		
		OPP의 information hiding 중 정보은닉의 개념에서 getter method 의 의미를 확인
		==> 추후 information hiding 지원하는 access Modifier 다시 정리합니다.
*/

class Developer2 
{
	//Field ==> 특성 , 속성(attribute)표현
	//private String name = "홍길동";
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer; // <== Field선언만 한 경우(변수를 선언만 한경우) 초기화 유무는?

	//Method ==> 행위, 기능(behavior) 표현

	/*
	project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
	1. income을 1 증가
	2. projcetCareer 1 증가
	행위
	*/

	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;

	}
	/* =================== 추가된 method(OverLoading Method) =======================
		project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		1. income 1 증가
		2. projectCareer 1증가
		행위 및 참여 project의 name을 디스플레이하는 행위
	*/
	public void participateProject(String project){
		System.out.println(project+"==> project 참여로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}

	/*
		강의를 통해 수입의 증가
		1.income을 1 증가
		행위
	*/
	public void instruct(){
		System.out.println("강의를통한 수입증가");
		avgIncome++;
	}

	/*============== 추가된 method(OverLoading Method)====================
	강의를 통해수입의 증가
	1. 강의수에 따라 income을 증자
	행위

	*/

	public void instruct(int IectureCount){
		System.out.println(IectureCount+" 개 강의를통한 수입증가");
		avgIncome += IectureCount;
	}

	////////////////// 추가된 부분 ////////////////////////

	/*
		상태값을 return 하는 행위 (getter method)를 정의

		==> 객체는 모든 정보는 Encapsulation 되어 있으며,
		==> 행위를 통해 Encapsulation되어있는 상태값에 접근할 수 있다.
	*/

	public String getName(){
		System.out.println("getName() method");
		return name;
	}
	public String getJob(){
		System.out.println("getJob() method");
		return job;
	}
	public int getAvgIncome(){
		System.out.println("getAvgIncome() method");
		return avgIncome;
	}
	public int getProjectCareer(){
		System.out.println("getProjectCareer() method");
		return projectCareer;
	}

//main
	public static void main(String[] args) 
	{
		//Developer2 class 를 Instance 생성
		Developer2 developer = new Developer2();
		
		// developer 식별성을 갖는 Instance . 연산자를 통해 사용
		System.out.println("이름은 : "+developer.name);
		System.out.println("직업은 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT 경력은 : "+developer.projectCareer);
	
		System.out.println("================================================");

		//method를 호출하여 행위를 통해 상태값 받아 출력하면...
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름은 : "+name);
		System.out.println("직업은 : "+job);
		System.out.println("평균수입은 : "+avgIncome);
		//아래의 내용을 이해하자
		System.out.println("평균수입은 : "+developer.getProjectCareer());

	}//main

}// class

//package jb03.part06;

/*
	FileName: Developer2.java

	::����Ȱ����, ������ �����ϴ� ȫ�浿�� Object Modeling
	1. ȫ�浿�� ���ȭ ������ �� : attribute ==> Field
	2. ������ �ش��ϴ� ������    : behavior ==> Method
	3. ������ project�� name�� ǥ�� �� �� �ִ� ���� �߰�
	4. ���� ���� ���� income �� ������ ��� �� �� �ִ� ���� �߰�
	=======================================================================

	�߰����� ����
		1.Field ������ return �ϴ� ������ ���� getter method����
		(��ü�� attribute�� information hiding(Encapsulation)�Ǿ� ������,
		������ ���ؼ� information hiding ���ִ� ������ ������ �� �ִ�.)
		
		OPP�� information hiding �� ���������� ���信�� getter method �� �ǹ̸� Ȯ��
		==> ���� information hiding �����ϴ� access Modifier �ٽ� �����մϴ�.
*/

class Developer2 
{
	//Field ==> Ư�� , �Ӽ�(attribute)ǥ��
	//private String name = "ȫ�浿";
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer; // <== Field���� �� ���(������ ���� �Ѱ��) �ʱ�ȭ ������?

	//Method ==> ����, ���(behavior) ǥ��

	/*
	project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	1. income�� 1 ����
	2. projcetCareer 1 ����
	����
	*/

	public void participateProject(){
		System.out.println("���α׷����߷� ��������, ��½���");
		avgIncome++;
		projectCareer++;

	}
	/* =================== �߰��� method(OverLoading Method) =======================
		project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
		1. income 1 ����
		2. projectCareer 1����
		���� �� ���� project�� name�� ���÷����ϴ� ����
	*/
	public void participateProject(String project){
		System.out.println(project+"==> project ������ ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}

	/*
		���Ǹ� ���� ������ ����
		1.income�� 1 ����
		����
	*/
	public void instruct(){
		System.out.println("���Ǹ����� ��������");
		avgIncome++;
	}

	/*============== �߰��� method(OverLoading Method)====================
	���Ǹ� ���ؼ����� ����
	1. ���Ǽ��� ���� income�� ����
	����

	*/

	public void instruct(int IectureCount){
		System.out.println(IectureCount+" �� ���Ǹ����� ��������");
		avgIncome += IectureCount;
	}

	////////////////// �߰��� �κ� ////////////////////////

	/*
		���°��� return �ϴ� ���� (getter method)�� ����

		==> ��ü�� ��� ������ Encapsulation �Ǿ� ������,
		==> ������ ���� Encapsulation�Ǿ��ִ� ���°��� ������ �� �ִ�.
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
		//Developer2 class �� Instance ����
		Developer2 developer = new Developer2();
		
		// developer �ĺ����� ���� Instance . �����ڸ� ���� ���
		System.out.println("�̸��� : "+developer.name);
		System.out.println("������ : "+developer.job);
		System.out.println("��ռ����� : "+developer.avgIncome);
		System.out.println("PJT ����� : "+developer.projectCareer);
	
		System.out.println("================================================");

		//method�� ȣ���Ͽ� ������ ���� ���°� �޾� ����ϸ�...
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸��� : "+name);
		System.out.println("������ : "+job);
		System.out.println("��ռ����� : "+avgIncome);
		//�Ʒ��� ������ ��������
		System.out.println("��ռ����� : "+developer.getProjectCareer());

	}//main

}// class

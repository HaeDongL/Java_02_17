//package jb03.part05;

/*
	FileName: Developer1.java

	::����Ȱ���� ,������ �����ϴ� ȫ�浿�� Object Modeling
	1. ȫ�浿�� ���ȭ ������ �� : attribute ==> Field
	2. ������ �ش��ϴ� ����		 : behavior ==> Method

	========================================================
	::�߰����� ����(Polymorphism ����  ==> Method OverLoading)
		3. ������ project�� name�� ǥ�� �� �� �ִ� ���� �߰�
		4. ���� ���� ���� income�� ������ ��� �� �� �ִ� ���� �߰�.
*/



class Developer1 
{
	
	//Field Ư��, �Ӽ�(attribute)
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer;	//<== Field ���� �� ��� (������ ���� �Ѱ��) �ʱ�ȭ ������?

	
	//Method ==> ���, ����(behavior) ǥ��
	/*
	project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	1.income�� 1����
	2.projectCareer�� 1 ����
		����
	*/
	public void participateProject(){
		System.out.println("���α׷����߷� ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}
	/* ================= �߰��� method(OverLoading Method) ====================
	project �� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	1.income�� 1 ����
	2. projectCareer�� 1����
		���� �� ���� project �� name �� ���÷����ϴ� ����
	*/
	public void participateProject(String project){
		System.out.println(project+"==> project ������ ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}
	/*
	���Ǹ� ���ؼ����� ����
	1.income�� 1����
	����
	*/
	public void instruct(){
		System.out.println("���Ǹ����� ��������");
		avgIncome++;
	}

	/*================= �߰��� method(OverLoading Method) ====================
		���Ǹ� ���ؼ����� ����
		1. ���Ǽ��� ���� income�� ����
		����
	*/
	public void instruct(int lectureCount){
		System.out.println(lectureCount+" : �� ���Ǹ� ���� ��������");
		avgIncome += lectureCount;
	}

}//class

//package jb03.part05;

/*
	FileName: Developer1Test.java
	::Developer1.class�� Instance ���� ����ϴ� class ���� :: Application class ����
*/

class Developer1Test
{
	//Field
	//Method
	//main
	public static void main(String[] args) 
	{
		
		//Developer1.class�� Instance ����
		Developer1 developer = new Developer1();

		//developer �ĺ����� ���� Instance . �����ڸ� ���� ���

		System.out.println("�̸��� : "+developer.name);
		System.out.println("������ : "+developer.job);
		System.out.println("��ռ����� : "+developer.avgIncome);
		System.out.println("PJT����� : "+developer.projectCareer);

		System.out.println("=========================================");


		//project�� ����

		developer.participateProject();
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("project ���� ����� : "+developer.projectCareer);

		System.out.println("=========================================");

		//1�� ������ ����
		developer.instruct();
		System.out.println("��ռ����� : "+developer.avgIncome);


		//////////////////////// �߰��� �κ� /////////////////////////////////


		System.out.println("=========================================");

		//ȫ�浿�� �ѹ����� project�� ����
		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		//==> ���� �ζ����� �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�...
		System.out.println("��ռ����� : "+developer.avgIncome);
		System.out.println("project���� ����� : "+developer.projectCareer);

		
		System.out.println("=========================================");

		//ȫ�浿�� 2�� ������ ����
		int IectureCount = 2;
		developer.instruct(IectureCount);
		//==> ���� �ζ����� �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�....
		//hong1.instruct(2);
		System.out.println("��ռ����� : "+developer.avgIncome);

	}//main
}//class
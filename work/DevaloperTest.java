//package jb03.part03;
/*
FildName: DevaloperTest.java
::Devaloper.class Instance ����, ����ϴ� class ���� : Application class
*/
class DevaloperTest
{
	//Field
	//Method
	//main method
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
	}//main
}//class

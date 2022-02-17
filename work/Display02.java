//package jb06.part05.test03;

/*
	FileName: Display02
	1.busCharge.class�� charge() Method ���������?
		2.���� Ŭ����(Student.Adult.Old)���� charge() Method �� OverRiding �ʴ´ٸ�?
		/////////////////////////////////////////////////////////////////////
		
		==> abstract Method / abstract class �� �ʿ伺
		o abstract Method
			: ��ü���� �ʿ䰡 ���� Method
			: ����Ŭ�������� ��ü������ ������(OverRiding)�ؾ��ϴ� �������� ���� Method
		o abstract class
			: ��ü������ ���� abstract Method�� ���ǵ� Ŭ����
			: �Ϲ�ȭ�� ������ ������, �Ϲ��� ������ �Ӽ��� ������ �������� ���ǵ� Ŭ����
			==> abstract class�� instance ���� �� �� ����.:: �߿��߿�<==
		/////////////////////////////////////////////////////////////////////
*/


abstract class BusCharge
{
	///Field
	String section;
	///Constructor;
	public BusCharge(){
	}
	public BusCharge(String section){
		this.section = section;
	}
	///method
	public void information(){
		System.out.println("������ݾȳ�");
	}

	//==> ������ ������, ����Ŭ������ OverRiding�� �����ϴ� �߻�޼ҵ� ����

	//public void charge(){
	//	System.out.println("�л�:300,�Ϲ���:500,���:��¥");
	//}
	public abstract void charge();
}//class

class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}
	//==> �Ʒ��� Method �ּ�ó���ϰ� �����Ͻ�... ������ ������ Ȯ������

	public void charge(){
		System.out.println("300��");
	}
}//class

class Adult extends BusCharge{

	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}

}//class

class Old extends BusCharge
{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}
}//class


public class Display02 
{		//main
	public static void main(String[] args) 
	{
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();
	}//main
}

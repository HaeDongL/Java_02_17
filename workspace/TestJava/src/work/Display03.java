//package jb06.part05.test03;

/*
	FileName: Display03
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

	public abstract void charge();
}//class

//abstract class ��ӽ� abstract method ���� �缺��(OverRiding)�ؾ��� <== ������
class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}

	public void charge(){
		System.out.println("300��");
	}
}//class

//abstract class ��ӽ� abstract method ���� �缺��(OverRiding)�ؾ��� <== ������
class Adult extends BusCharge{

	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}

}//class


//abstract class ��ӽ� abstract method ���� �缺��(OverRiding)�ؾ��� <== ������
class Old extends BusCharge
{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}
}//class


public class Display03 
{		//main
	public static void main(String[] args) 
	{	
		//���� ���۷����� ���� �ν��Ͻ��� ��������(������ ����ȯ / ~ is a ~ Relation)
		//abstract class �� Ĵü �����Ұ� �׷��� type ������ ????
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();
		//==> PolymopPhism : �ϳ��� �������̽��� ���� �� �پ��� Ȱ��
		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();

		
		//==> ���� �ڵ��� �Ʒ��� �ڵ��� ���ϸ�
		//==> 1.�ݺ��� �κ��� ���°�
		//==> 2.���� DayaType ����(�迭:Array)�� �̿��Ͽ� �ϰ������� ���� �� ���� ���°�.

		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for(int i=0; i<bc.length; i++){
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}


	}//main
}

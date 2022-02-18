//package jb05.part06;

/*
	FileName : CastionComplet.java
	1. Primitive Type ����ȯ(������/�����): data �� ũ��
	2. Reference Type ����ȯ(������/�����): ������ ũ��(�߻�ȭ����)
		: �߿�, �߿� : ��ü�� ����ȯ ���� : ~~ is a ~~ Relationship
*/

//���� class Super����

class Super
{
	///Method
	public void a(){
		System.out.println("Super : a()");
	}
}//end of class

//���� class Spuer�� ��� �޴� ���� class Sub ����
class Sub extends Super
{
	///Method

	public void a(){
		System.out.prinltn("overriding�� Sub:a()");
	}

	public void b(){
		System.out.println("sub:b()");
	}
}//end of class

//���� class Super�� ��� �޴� ���� class Sub ����


public class CastingComplete
{	

	///Main Method
	public static void main(String[] args) 
	{
		//�ϳ� : ���� class �ν��Ͻ� ����(Data type == �ν��Ͻ� �� ���)
		System.out.println("\n����� Super s1 = new Super()�κ�");
		Super s1 = new Super();

		//�ο� : ���� class �ν��Ͻ� ����(Data type == �ν��Ͻ��� ���)
		System.out.println("\n����� Sub s2 = new Sub()�κ�");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		//���� : ���� data type ���� ���� �ν��Ͻ� ����(Data type != �ν��Ͻ�)

		System.out.println("\n����� Super s3 = new Sub()�κ�");
		Super s3 = new Sub();
		s3.a();// ����ȯ�� �Ͼ�� SuperŬ������ �ν��Ͻ��� �����̵Ǿ� ����Ŭ������
				//b()�� ������� ���ϰԵȰ�.
		//�Ʒ��� ������ error�� �߻��Ѵ� s3�� b90�� �����Ҽ� ����.(�� ����);

		//s3.a()�� ����Ϸ��� ==>casting ������ ���(�� �ڿ��� �����º���(?)) a �ƴϰ� b����

		System.out.println("\n�� b()�� ���� �Ұ��ϴ�.");
		System.out.println("casting �����ڸ� �̿� Sub sub = (Sub)s3 ����� ����ȯ");
		Sub sub = (Sub)s3;
		Sub.b();

		//�׿� : ���� data type���� ���� �ν��Ͻ� ���� (Data type != �ν��Ͻ�)
		//error ���� (�������۷��������� �����ν��Ͻ��� ���۷����� �� ����.) �Ʒ�
		//Sub s4 = new Super();

	

	}
}

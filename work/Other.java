package jb04.part07;

public class  Other
{

	/*
		FileName : Other.java
		1.Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
		2.public /  / protected/ private �� ��� �� ����

		o Son�� Father�� ���� package �� �����ϸ�, ��Ӱ����̴�.
		o �ּ��� Ǯ��
		==> Compile �� error�� Ȯ���ϰ�, error�� �ǹ� ����
		==> �� Access Modifier�� ���ٹ����� Ȯ��
	*/

	//Field
	String name = "ȫ�浿";
	String job = new String("������");
	//==> ���� String Data Type�� name job ���°��� ������ ���� �����Ѵٸ�...
	//==> Other.class Has A String.class(~~ Has A ~~ : Association Relation)
	//==> �Ʒ��� Father Data Type �� Other.class ���� �����

	Father owner = new Father(); //==> Father �ν��Ͻ� ����

	//Constructor
	public Other(){
		System.out.println(this.owner.name); //==> public String name = "ȫ�浿";
		System.out.println(owner.bank);		//==>  protected String bank = "�Ѿ�����";
		System.out.println(owner.branch);	//==>  String branch = "���ﵿ����";
		//System.out.println(f.password);	//==> private int password = 1234;

		//Field(��������)�� Method(����)�� �̿� ����

		System.out.println("���� ��й�ȣ: "+this.owner.getPassword(0));
	}



}//

/*
	1.private�� ����Ͽ� �ٸ� class�� ���� ���� ��������
	2.method �� ���� (������ ����) �������� ���θ� ����
*/

package jb04.part07.outer;

	/*
		FileName : Other.java
		1.Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
		2.public /  / protected/ private �� ��� �� ����

		o Son�� Father�� ���� package �� �����ϸ�, ��Ӱ����̴�.
		o �ּ��� Ǯ��
		==> Compile �� error�� Ȯ���ϰ�, error�� �ǹ� ����
		==> �� Access Modifier�� ���ٹ����� Ȯ��
	*/

public class  Other1
{

	//Field
	//==> Father�� �����Ұ�
	Father unknown = new Father(); //==> Father �ν��Ͻ� ����

	
	//Constructor
	public Other1(){
		System.out.println(this.unknown.name); //==> public String name = "ȫ�浿";
		//System.out.println(f.bank);			//==>  protected String bank = "�Ѿ�����";
		//System.out.println(f.branch);			//==>  String branch = "���ﵿ����";
		//System.out.println(f.password);		//==> private int password = 1234;

		//Field(��������)�� Method(����)�� �̿� ����

		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));
	}



}//class

/*
	1.private�� ����Ͽ� �ٸ� class�� ���� ���� ��������
	2.method �� ���� (������ ����) �������� ���θ� ����
*/

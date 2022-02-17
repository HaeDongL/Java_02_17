//package jb03.part04;

/*
	FileName : MethodSyntax.java
	1.OOP	 : Message
	2.OOPL	 : Method
	o ��ü���� ������ ���� �ϴ� Method ����
	o OPP���� Message (Method)�� ��ü�� data�� ���� �Ǵ� ���� �� �ִ� ����.
	o OOP�� ��ü�� ��ü�� ����� method ȣ��
*/

class MethodSyntax 
{
	//Field
	String name = "ȫ�浿";
	String add = "�Ѿ�";

	//Method
	//=> �������� �Ѵ� ��������
	public void browerOn(){
		System.out.println("brower�� �Ѵ�");
	}

	//==> �۾��� �ϰ� �۾������� boolean type ���� return�ϴ� ����
	public boolean documentWork(){
		System.out.println("document�۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}
	//==> �ΰ��� ������ �޾� ���� return �ϴ� ����
	public int sum(int i, int j){
		System.out.println("<<"+i+">> �� <<"+j+">>���� �޾� �� return");
		return (i+j);
	}

	//==> �̸��� return �ϴ� ����
	public String getName(){
		System.out.println("�̸��� �����մϴ�.");
		return name;
	}
	//==> �ּҸ� retrun �ϴ� ����
	public  String getAdd(){
		System.out.println("�ּҸ� �����մϴ�.");
		return add;
	}
	//==> �̸�, �ּ� �ΰ��� ����(���°�)�� Array DataType return �ϴ� ����
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str = {"ȫ�浿", "�Ѿ�"};
		return str;
	}
}//class

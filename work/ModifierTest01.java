//package jb05.part03;

/*
	FileName: ModifierTest01.java

	1.ModifierTest01, ModiFierTest02, ModiFierTest03, ModiFierTest04�� ����
	class ������ modifier / Access Modifier ��� Ȱ��, ����Ǵ� �� ���� ����...
	2.TopSecret01.class �� Access Modifier, Modifier�� ��� �����Ű������ ����
*/

class TopSecret01
{

	///Field
	int secretNo = 7777;

	///Constructor
	public TopSecret01(){

	}

	///Method
	//getter Method
	public int getSecretNo(){
		return secretNo;
	}

}///end of class


public class ModifierTest01 
{

	/// main Method
	public static void main(String[] args) 
	{
		
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.getSecretNo());

	}// end of main
}// end of class

/*
	TopSecret.class�� ������
	o: secretNo�� �߿��� attribute�̴� �׷��� ������ ���ٹ� ������ ����
*/
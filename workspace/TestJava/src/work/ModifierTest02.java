
/*
	FileName: ModifierTest02.java

	==> TopSecret01.class ������
	==> Access Modifier�� ���� information hiding�� Method(����)�� ���� ����
*/

class TopSecret02
{
	///Field
	//==> access modifier�� Ȱ���� information hiding
	//==> private ������� ��� ���������� �� ������ �ϰ� getter Method ���� ����
	private int secretNo = 7777;

	///Constructor
	public TopSecret02(){
		
	}
	//Method
	//getter Method
	//=> method�� ���� ������ ������ ��츸 secretNo�� retrun
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else {
			return 0;
		}
	}
}//class


public class ModifierTest02 
{

		//main Method
	public static void main(String[] args) 
	{
		TopSecret02 topSecret = new TopSecret02();

		//==> private Field�� information hiding �Ǿ� �־� ���� �� ������ �Ұ�
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;

		System.out.println(topSecret.getSecretNo(0));
	}//end of main
}//end of class
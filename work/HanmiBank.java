//package jb05.part08;

/*
	FileName : HanmiBank.java

	1.Bank.class, Deposit.class, PayOut.class�� �̿��Ͽ� HanmBank�� ����
	2.Bank.class, Deposit.class, PayOut.class�� � ���࿡���� ���ɼ� �ִ�.
	3.Deposit.class, PayOut.class �� ��������̸� ��𼭳� ��� �� �� �ִ� ����� ������
	(SPEC�� ������ :: ��������� �ݵ�� �Ա�,��� ����� �����ؾ� �Ѵ�.).class
*/
public class HanmiBank extends Bank001 implements Deposit,PayOut{


	///Field

	///Constructor
	public HanmiBank(){

	}

	public HanmiBank(String name){
		super(name);
	}
	
	///Method
	public void display(){
		System.out.println("�����: "+this.getName());
	}

	public void deposit(int money){
		System.out.println(money+"�� �Ա��մϴ�.");
	}
	
	public void payOut(int money){
		System.out.println(money+"�� ����մϴ�.");
	}

	/// main Method
	public static void main(String[] args) 
	{
		HanmiBank hb = new HanmiBank("�ѹ�����");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//==>interface ���ο� ����� Field�ǹ̸� ��������
		//interface �� Field�� Ȯ���ϰ�...
		System.out.println(Deposit.deposit); //==>static ���ٹ���� ?
		System.out.println(hb.payOut);		//==> static ���ٹ���� ?

		//Field�� ���°��� ������ ����
		//Deposit.deposit = "�Ա�";
		//PayOut.payOut = "���";
		//==> compile error �߻� interface�� ����Ǵ� ������ final static�� Ư¡�� ����
	}
}

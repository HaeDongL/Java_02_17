//package jb04.part01;

/*
	FileName: Bank02.java
	�Է¹��� ������ ���� �ٶ� �ְŷ� ����, �Ա�, ��� ������ �����ϴ� Application
*/

public class Bank02
{
	///Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Constructor
	public Bank02(){

	}
	public Bank02(String[] str){
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}


	///Method
	// ==> commend �� �Ǵ� deposit(), withdrawal() ȣ���ϴ� ����

	public void work(){
		if(command == 1){
			deposit();
		}else if(command == 2){
			withdrawal();
		}
	}
	//==> �Ա��� ���� method
	public void deposit(){
		balance += money;
		System.out.println(money+"�� �Ա���.");
	}
	//==> ����� ���� method
	public void withdrawal(){
		balance -= money;
		System.out.println(money+"�� �����.");
	}

	//==> ������ �ݾ��� display�ϴ� method
	public void displayMoney(){
		System.out.println("����ݾ��� : "+balance+"�Դϴ�.");
	}
	///getter//setter method ����

	//main method
	public static void main(String[] args){
		
		//data�� ��ȿ�� �˻�
		if(!(args.length==2 || args.length == 4)){
			System.out.println("[usage]::java Bank02 [coustomerName][bankName][option][money]");
			System.out.println("[usage]::���ڰ��� 2,4�� �ʿ��մϴ�.");
			System.exit(0);
		}

		System.out.println(args[0]+"���� �ְŷ����� "+args[1]+"�Դϴ�.");

		Bank02 b = new Bank02();

		if(args.length != 2){
			//�Ա�: 1, ���: 2���� �Ǵ��� ���� command
			int command = Integer.parseInt(args[2]);

			if(command !=1 && command !=2){
				System.out.println("[usage]::java Bank02 [coustomerName][bankName][option][money]");
				System.out.println("[usage]::option�� Ȯ���ϼ��� :: 1 => �Ա�, 2==>���");
				return;
			}

			//String Array ���� �޴� �����ڸ� �̿��� �ν��Ͻ� ����
			b = new Bank02(args);

		}
		//�ܾ��� ǥ���ϴ� method ȣ��
		b.displayMoney();
	

	}

}
//
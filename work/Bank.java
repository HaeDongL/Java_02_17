class Bank
{
	//Feild
	int balance = 0;
	String bankName;
	String userName;
	int money;



	//Constructor
	
	public Bank(String uName, String bName){
		userName = uName;
		bankName = bName;
		System.out.println(userName+"���� �ְŷ������� "+bankName+"�Դϴ�.");
	}
	
	
	//Method
	public void deposit(int x, int y){
		money = y;
		if(x == 1){
			System.out.println(y+"�� �Ա���");
			balance += money;
		}else {
			System.out.println(y+"�� �����");
			balance -= money;
		}//else
		System.out.println("���� "+balance+"�� �ֽ��ϴ�.");
	}//deposit
		
	}

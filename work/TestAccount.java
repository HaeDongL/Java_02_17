class Account
{
	///Field
		private String accNo;
		private int balance;
	///Constructor
		public Account(){
		}
		public Account(String accNo){
			this.accNo = accNo;
			System.out.println(this.accNo+" 계좌가 개설되었습니다.");
		}
	///Method
		public String getAccNo(int pwd){
			if(pwd == 1234){
				return this.accNo;
			}else {
				return 0;
			}
		}

		public int getBalance(int pwd){
			if(pwd == 1234){
				return this.balance;
			}else {
				return 0;
			}	
		}
}

public class TestAccount
{
	public static void main(String[] args) 
	{
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo()+"계좌의 잔고는"+balance+"만원입니다.");
		
		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");
		
	
	}
}

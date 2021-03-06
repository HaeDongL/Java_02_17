//package jb05.part08;

/*
	FileName : HanmiBank.java

	1.Bank.class, Deposit.class, PayOut.class를 이용하여 HanmBank를 구현
	2.Bank.class, Deposit.class, PayOut.class는 어떤 은행에서도 사용될수 있다.
	3.Deposit.class, PayOut.class 는 금융기관이면 어디서나 사용 할 수 있는 기능을 정의한
	(SPEC을 정의한 :: 금융기관은 반드시 입금,출금 기능이 존재해야 한다.).class
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
		System.out.println("은행명: "+this.getName());
	}

	public void deposit(int money){
		System.out.println(money+"를 입금합니다.");
	}
	
	public void payOut(int money){
		System.out.println(money+"를 출금합니다.");
	}

	/// main Method
	public static void main(String[] args) 
	{
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//==>interface 내부에 선언된 Field의미를 이해하자
		//interface 의 Field를 확인하고...
		System.out.println(Deposit.deposit); //==>static 접근방식은 ?
		System.out.println(hb.payOut);		 //==> static 접근방식은 ? 인스턴스를 생성하여 식별자로접근

		//Field의 상태값을 변경해 보자
		//Deposit.deposit = "입금";
		//PayOut.payOut = "출금";
		//==> compile error 발생 interface에 선언되는 변수는 final static의 특징을 갖음
	}
}

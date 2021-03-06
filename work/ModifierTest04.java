
/*
	FileName: ModifierTest04.java

		1.TopSecret02.class가 중요한 class라면 modifier를 통해 상속할 수 없도록 했으며
		2.secretNo를 readOnly를 명확히 함
		2.또한 중요한 class라면 객체 생성을 불가능하게 한다.
		==>아래의 coding을 이해하자. 생성자를 외부에서 접근하지 못하게 private선언.
			(예<java.lang.System.class의 소스와 API를 통해 확인)
		3.static method 를 통해 인스턴스를 리턴할 수 있도록 한다.
			==> 단... 조건을 만족할 경우만 인스턴스를 return함.
*/

//final modifier 를 활용 상속불가
final class TopSecret04
{
	//Field
	//==> access modifier를 활용한 information hiding
	//==> final modifier을 활용한 수정불가.
	private final int secretNo = 7777;
	
	//Constructor
	//==> Access modifier를 통한 객체생성불가(private Constructor을 사용한 이유를 이해)
	private TopSecret04(){
	}
	//Method
	//getter Method
	//=> method 를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else {
			return 0;
		}
	}


//static method 를 이용한 instance return 하게하여 다른 class에서 사용가능함.
//==> managerNo를 인자로 받아 Instance를 return 할 것인지를 판단한다.
	public static TopSecret04 getInstance(int managerNo){
		if(managerNo == 1234){
			return new TopSecret04();
		}else {
			return null;
		}
	}

}// class

public class ModifierTest04
{	//main method
	public static void main(String[] args) 
	{
		
		//instance 생성 불가로 static method를 통해 인스턴스 return받는다.
		//==> 또한 instance를 return받는 경우도 조건(managerNo)을 충족해야함.

		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));
		
		//==> ModifierTest01.class ~ ModifierTest04.class 까지 변경하면서
		//==> Access Modifier와 Modifier의 사용,활용을 이해하자.

	}// main
}//class

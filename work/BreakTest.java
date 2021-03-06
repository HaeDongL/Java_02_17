//package jb02 part03;

/*
	FileName : BreakTest

	// ==> keyword : break ==> 자신이 속한 반복문은 종료

	// ==> break 문을 이용하여 입력받은 수까지의 합을 구하자

	// ==> java BreakTest 10 ==> 이면 1 ~ 10 더해서 55 출력
*/
class BreakTest 
{
	//main method
	public static void main(String[] args) 
	{
		// 입력받은 data를 int 변환
		int inputData = Integer.parseInt(args[0]);

		//while 문의 초기화변수 선언
		int i=0;

		// 더한값을 지정하기 위한 변수 선언
		int sum = 0;

		while(true){
			i++;
			sum = sum+i;

			if(i==inputData){
			break;
			}
			System.out.println("0 ~ "+inputData+" 까지의 합은 : "+sum+"입니다.");
		}// end of while
	}// end of main
}// end of class

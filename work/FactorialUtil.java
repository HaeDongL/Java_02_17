import java.util.Scanner;

public class FactorialUtil 
{
	

	public int factorial(int n){
		// 구현하세요
		int result = 1;
		for(int i=n; i>=1; i--){
				result *= i;
		}

			System.out.print("팩토리얼 결과 값 = "+result+"\t(");
		for(int i=n; i>1; i--){
			System.out.print(i+"*");
			if(i == 2){
				System.out.print(i-1+")\t");
			}
		}

		return result;
		
	}

	


		//main
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input		= ");

		FactorialUtil util = new FactorialUtil();
		System.out.print("Result= "+util.factorial(keyboard.nextInt()));
	}//main
}//class

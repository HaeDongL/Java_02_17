public class Prob16
{

	public static void printGugudan(int no){//////staitc
		
		if(!(no > 0 && no < 10)){
			System.out.println("1�̻� 9������ ���� �Է��ϼž��մϴ�.");
			return;
		}

		for(int i=1; i<=9; i++){
			for(int j=1; j<=no; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}//inFor
			System.out.println();
		}//OutFor

	}//printGugudan
	
	///Main Method
	public static void main(String[] args) 
	{
		
		System.out.println("�־��� ���ڱ����� �������� ����ϴ�.");
		System.out.println("-------Sample 1---------");
		Prob16.printGugudan(4);

		System.out.println("-------Sample 2---------");
		Prob16.printGugudan(9);

		System.out.println("-------Sample 3---------");
		Prob16.printGugudan(-1);

		System.out.println("-------Sample 4---------");
		Prob16.printGugudan(10);
			
	}///main
}///class

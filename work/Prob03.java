import java.util.Scanner;
class Prob03 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� ");
		int inputInt = keyboard.nextInt();
		
		
		//�Ʒ��� �����ϼ���
		if(inputInt > 1 && inputInt < 10){
			
			for(int i=1; i<=inputInt; i++){
				int factorial = 1;
				for(int j=1; j<=i; j++){
					factorial *= j;
				}
				System.out.println(i+"! = "+factorial);
			}

			
		}else {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}//else

	}//main
}//class

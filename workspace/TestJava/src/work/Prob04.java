
import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� ");
		number = keyboard.nextInt();
		
		/*���⿡ ���α׷��� �ϼ��Ͻʽÿ�*/
		
		if(number > 0 && number < 1000) {
			for(int i=number; i<=1000; i++) {
				if(i % number == 0) {
					sum += i;
					count++;
				}//if
			}//for
			System.out.println(number+"�� ��� ���� = "+count);
			System.out.println(number+"�� ��� �� = "+sum);
		}else {
			System.out.println("1 ~ 1000 ������ ���� �Է��ϼ���.");
		}
		
		
	}//main
}//class

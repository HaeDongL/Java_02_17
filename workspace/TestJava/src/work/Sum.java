//package jb01.part02
/*
 [3] �μ��� �Է¹ް� �Է¹������� ¦��, Ȧ��,3�� ����� �Ǵ��ϱ�
 	FileName: Test3.java
 	
 	���࿹> java Test3 10 15
 	==>������(��°��...)(�˾Ƽ� ����Ұ�)
 	�Է��Ͻ� 1��° ���ڰ� 10�� ¦�� �̸� 3�� ������ƴմϴ�.
 	�Է��Ͻ� 2��° ���ڰ� 15�� Ȧ�� �̸� 3�� ����Դϴ�.
 */
public class Sum {
	//main method
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		// ù��° ���ڰ�
		if(num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.println("�Է��Ͻ� 1��° ���ڰ� "+num1+"�� ¦�� �̸� 3�� ����Դϴ� ");
			if(num1 % 3 != 0){
			
			}
				
			
		}else if(num1 % 2 != 0) {
				System.out.println("�Է��Ͻ� 1��° ���ڰ� "+num1+"�� Ȧ�� �̸� 3�� ������ƴմϴ�.");
		}
		
		
		if(num2 % 2 == 0 && num2 % 3 == 0) {
			System.out.println("�Է��Ͻ� 2��° ���ڰ� "+num2+"�� ¦�� �̸� 3�� ����Դϴ� ");
			
				
			
		}else if(num2 % 2 != 0) {
				System.out.println("�Է��Ͻ� 2��° ���ڰ� "+num2+"�� Ȧ�� �̸� 3�� ������ƴմϴ�.");
		}
		
	
		
	}
}
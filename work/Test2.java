/*
 	[2]: �μ��� �Է¹ް� �μ��� ���Ͽ� ���ϱ�/���� ����
 	ù��°�μ��� ũ�� ���� / ������ ���ϱ�
 	FileName : Test2.java
 	
 	���࿹> java Test2 2 1
 	==>������(��°��..)
 	ù��°�μ�:2, �ι�°�μ�:1, 2-1=1�Դϴ�.
 	
 	���࿹> java Test2 1 2
 	ù��°�μ�:1, �ι�°�μ�:2, 1+2=3�Դϴ�.
 	
 */
public class Test2 {
	//main method
	public static void main(String[] args) {
		
		int num1 =  Integer.parseInt(args[0]);
		int num2 =  Integer.parseInt(args[1]);

		if(num1>num2) {
			System.out.println("ù��° �μ�: "+num1+", �κ�° �μ�: "+num2+", "+num1+"-"+num2+"="+(num1-num2));
		}else if(num1<num2) {
			System.out.println("ù��° �μ�: "+num1+", �κ�° �μ�: "+num2+", "+num1+"+"+num2+"="+(num1+num2));
		}
		
	}
}

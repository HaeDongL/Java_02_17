/*
 	[4] ���ڸ� �Է� �޾�(1~100) 90�̻� ��, 80���̻� ��, 70���̻� ��, 60�̻� ��
 	(�Է��� ���� 0~100 ���� �̾���Ѵ�. �� �̻� �������� ��� ��� ó���� ���ΰ�.)
 	FileName: Example1.java
 	
 	���࿹> java Example1 95
	==>������(��°��...)
	�Է��Ͻ� �� 95���� ���Դϴ�.
 
 */
public class Example1 {
	//main method
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		// 100/10 99/10 98/10... switch
		
		/*if(score<=100 && score>=90) {
			System.out.println("�Է��Ͻ� ��: "+score+"���� ���Դϴ�.");
		}else if(score<=89 && score>=80) {
			System.out.println("�Է��Ͻ� ��: "+score+"���� ���Դϴ�.");
		}
		else if(score<=79 && score>=70) {
			System.out.println("�Է��Ͻ� ��: "+score+"���� ���Դϴ�.");
		}
		else if(score<=69 && score>=0) {
			System.out.println("�Է��Ͻ� ��: "+score+"���� ���Դϴ�.");
		}
		else {
			System.out.println("�߸��� ������ ���Դϴ�.");
		}
		*/
		
		if(args.length != 1){
			System.out.println("������ �Է� �ϼ���.");
			return;
		}
		if(score > 100 || score < 0){
			System.out.println("������ ������ �߸��Ǿ����ϴ�.");
			return;
		}
		
		String grade = "��";
		switch (score/10){
			case 10:
			case 9:
			break;
			case 8:
				grade = "��";
				break;
			case 7:
				grade = "��";
				break;
			default :
				grade = "��";
				

		}
		System.out.println("�Է��Ͻ� ��: "+score+"���� "+grade+"�Դϴ�.");
		
		

	}//main
}//class

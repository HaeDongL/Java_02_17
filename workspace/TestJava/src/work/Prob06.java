
public class Prob06 {
	public static void main(String[] args) {
		
		int year = 1988;
		int month = 2;
		int maxDay = 28;
		
			if(year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
				if(year % 4 == 0 && year % 100 == 0) {
					System.out.println(year+"���� ������ �ƴմϴ�.");
				}else {
					System.out.println(year+"��"+month+"���� ������ "+maxDay+"�Դϴ�.");
				}//In if - else
			}else {
				System.out.println(year+"���� ������ �ƴմϴ�.");
			}//Out if - else
		}//main
		
	}//class


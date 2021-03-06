package t02_25;

public class ArrayUtil {
	
	public char[] reverseString(char[] s,int start, int end) {

		char[] tempCharArray = new char[s.length];
		for(int i=0; i<s.length; i++) {
			for(int j=(int)'A'; j<=(int)'z'; j++) {
				if(s[i] == (char)j) {
					tempCharArray[i] = (char)j;
				}
			}
		}
		
		
		int count = start;
		for(int i=end; i>=count; i--) {
			char temp = tempCharArray[count];
			tempCharArray[count] = tempCharArray[i];
			tempCharArray[i] = temp;
			count++;
		}
			
		
		
		return tempCharArray;
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		System.out.println(au.reverseString(s, 0, 3));
		System.out.println(au.reverseString(s, 4, 7));
		System.out.println(au.reverseString(s, 8, 10));
		System.out.println(au.reverseString(s, 0, 10));
		
	}
	
}

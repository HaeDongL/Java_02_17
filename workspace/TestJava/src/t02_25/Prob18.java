package t02_25;

public class Prob18 {
	
	
	
	public static String myReplace(String str, char oldChar, char newChar) {
		
		String reStr="";
		for(int i=0; i<str.length(); i++) {
		
			if(!(str.charAt(i) == oldChar)) {
				reStr += str.charAt(i);
			}else {
				reStr += newChar;
			}
		
		}
		
		return reStr;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("--------Sample 1--------");
		String str1 = myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("--------Sample 2--------");
		String str2 = myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("--------Sample 3--------");
		String str3 = myReplace("hello world",'a','*');
		System.out.println(str3);
	}
}

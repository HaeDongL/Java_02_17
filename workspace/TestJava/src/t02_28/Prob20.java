package t02_28;

public class Prob20 {

	
	private static String[] stringSpilt(String str1, String str2) {
		int str2Num = 0;
		int arrayCount = 0;
		String strTemp = "";
		String strTemp2 = "";
		String[] newStr;
		
		for(int i=0; i<str1.length(); i++) {
			if(str2.equals((strTemp+str1.charAt(i))) ) {
				str2Num += 1;
			}
		}
		
		newStr = new String[str2Num+1];
		
		for(int i=0; i<str1.length(); i++) {
			if(!str2.equals(strTemp+str1.charAt(i))){
				strTemp2 += str1.charAt(i);
			}else {
				newStr[arrayCount] = strTemp2;
				arrayCount++;
				strTemp2 = "";
			}
		}
		newStr[newStr.length-1] = strTemp2;
		
		return newStr;
	}
		
	
			
			
			
	
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Smasung#3#6000000";
		String[] strs = stringSpilt(str,"#");
		System.out.println("===문자열 처리 결과===");
		for(int i=0; i< strs.length; i++) {
			System.out.println(strs[i]);
		}

	}

}

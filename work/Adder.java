public class Adder

{
	/*
	public int execute(String expr){
		int result = 0;
			String strTemp = "";
			String strPlus = "+";
			String strTemp2 = "";
		for(int i=0; i<expr.length(); i++){
				
			if(!strPlus.equals(""+expr.charAt(i))){
				strTemp += expr.charAt(i);
				if(i == (expr.length()-1)){
					result += Integer.parseInt(strTemp);
				}//InIf
			}else {
				result += Integer.parseInt(strTemp);
				strTemp = "";
			}//else if
			

		}//for
		return result;
	}

*/

	public int execute(String expr){
		int result = 0;
		String strNum = "";

		for(int i=0; i<expr.length(); i++){
			char c = expr.charAt(i);
			if(c == '+'){
				result += Integer.parseInt(strNum);
				strNum = "";
			}else {
				strNum += c;
			}
		}
		return (result + Integer.parseInt(strNum));
	}
	


	public static void main(String[] args) 
	{
		Adder adder = new Adder();

		String expr = "3+5+9+1";
		System.out.println(expr + "=" + adder.execute(expr));

		expr = "11+45+77+3";
		System.out.println(expr + "=" + adder.execute(expr));

		expr = "33+51+12+11";
		System.out.println(expr + "=" + adder.execute(expr));
		

	}
}

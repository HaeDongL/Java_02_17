//package jp01.part05;

/*
	FileName: VectorTest01.java

	1. Array: 같의 Data Type의 묶음, 고정 길이
	2. java.util.Vector: 다른 Data Type 도 묶음, 가변길이
*/
import java.util.*;

class VectorTest01 
{	
	///Main Method
	public static void main(String[] args) 
	{
		//Vector 생성 : API의 생성자를 확인, 인자로 전달된 10,10 의미 확인;
		Vector vector = new Vector(10,10);
		
		//Vector에 Object 저장 ==> add(Object obj): Object를 인자로 받는다는 의미는?
		
		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕하세요.");

		//Vector 저장된 값을 출력 :: vector.capactiy() 무엇을 return 하는가...

		for(int i=0; i<vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//String s = (String)vector.elementAt(i); //위의 두 line과 비교
			System.out.print(s);
			//System.out.print((String)vector.elementAt(i);
			}//for
			

			System.out.println("\n==>API 확인");
			vector.insertElementAt("4.길:",1);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}//for
	
		
			System.out.println("\n==>API 확인");
			vector.setElementAt("5.홍길순",3);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}
		
			System.out.println("\n==>API 확인");
			vector.removeElementAt(3);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}

	}
}

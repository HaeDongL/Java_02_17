/*
	FileName: VectorTest02.java

	1.Vector가 갖는 문자열 값을 출력하는 for문을 Method로 추출, 정의
	2.Vector를 확장하여 필요한 기능(Method)를 추가
*/

import java.util.*;

class VectorTest02 extends Vector
{

	///Field

	///Constructor
	public VectorTest02(){
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity,capacityIncrement);
	}


	///Method
	// Vector가 관리(?, 저장)한 문자열 값을 출력하는 Method정의
	public void pringString(Vector vector){

		//for(int=0; i<vector.size();i++){
		//	System.out.print((String)vector.elementAt(i));
		//}

		//위의 for문과 비교하여 이해하자. / JDK1.5에 추가된 기능 :: Enhanced For Loop
		//Vector 내부에 저장된 값을 size()만큼 반복, 1EA씩 추출 Object에 담아(?)준다.

		for(Object object : vector){
			//위의 for문의 elementAt() 후 Casting 한 것과 비교하여 이해
			System.out.print((String)object);
		}

	}

	
	//Main Method

	public static void main(String[] args) 
	{
		//Vector 확장하여 추가적 기능(pringString())을 정의한 VectorTest02 인스턴스 생성

		VectorTest02 vectorTest = new VectorTest02(10,10);

		//Vector 에 Object 저장

		String s1 = new String("1.홍");
		vectorTest.add(s1);
		vectorTest.add(new String("2.동"));
		vectorTest.add("3.님 안녕하세요");
		//Vector 저장된 값을 출력
		vectorTest.pringString(vectorTest);

		System.out.println("\n==>API확인");
		vectorTest.insertElementAt("4.길",1);
		vectorTest.pringString(vectorTest);

		System.out.println("\n==>API확인");
		vectorTest.insertElementAt("5.홍길순",3);
		vectorTest.pringString(vectorTest);

		System.out.println("\n==>API확인");
		vectorTest.removeElementAt(3);
		vectorTest.pringString(vectorTest);

	}
}

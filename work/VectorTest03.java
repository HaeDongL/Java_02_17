//package jp01.part07;

/*
	FileName: VectorTest03.java

	:: Generic : jdk1.5추가기능
		o Vector 생성시 관리할 DataType을 미리 선언 가능.
*/

import java.util.*;

public class VectorTest03 
{	
	///Main Method


	public static void main(String[] args) 
	{
		//Vector 객체 생성시 관리(저장,추출)될 인스턴스 DataType명시
		Vector<String> vector = new Vector<String>(10,10);
		
		//Vector에 String저장
		//add(E obj): E를 인자로 받는다는 의미는 ? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕");	

		//Vector 저장된 값을 출력
		for(int i=0; i<vector.size(); i++){
			//Generic 사용으로 명시적 형변환 불필요
			String s = vector.elementAt(i);
			System.out.print(s);
			//System.out.print(vector.elementAt(i));
		}

		System.out.println("\nJDK 1.5 추가기능 :: Generic, Enhanced For Loop 사용");
		//==> 위의 for문과 비교하여 이해하자. JDK 1.5에 추가 기능 :: Enhanced For Loop
		//Vector 내부에 저장된 값을 size()만큼 반복, 1EA씩 추출 String 준다. (Generic 사용으로...)

		for(String value : vector){
			System.out.print(value);
		}
		
		System.out.println("\n==>API 확인");
		vector.insertElementAt("4.길",1);
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}

		System.out.println("\n==>API 확인");
		vector.setElementAt("5.홍길순",3);
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n==>API확인");
		vector.removeElementAt(3);
		
		for(int i=0;i<vector.size(); i++){
			System.out.println(vector.elementAt(i));
		}
		
	}
}

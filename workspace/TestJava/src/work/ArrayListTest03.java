//package jp01.part07;

/*
	FileName : ArrayListTest03.java

		1.Vector, ArrayList �� Hierachy�� ���� �� Ŭ������ ���� �� ���������� ���´�.
			���� �н��� Thread�� ����ȭ �κп��� �ٸ� ������ �Ѵ�.(==>���� �н�)
		2.Generic(jdk1.5 �߰����)
			o ArrayList ������ ������ DataType�� �̸� ���� ����.
			o Data ����� ������ DataType �� �����Ǿ� ������ ������ ����ȯ�� ���ʿ�.
*/


import java.util.*;

public class ArrayListTest03 
{
	///Main
	public static void main(String[] args) 
	{
		//ArrayList ������ ����(����,����)�� ��ü�� DataType����
		ArrayList<String> arrayList = new ArrayList<String>(10);

		//add.(E obj): E�� ���ڷ� �ٵ�ٴ� �ǹ̴� ? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1 = new String("1.ȫ");
		arrayList.add(s1);;
		arrayList.add(new String("2.��"));
		arrayList.add("3.�� �ȳ��ϼ���.");

		//ArrayList ������ ���� ���
		
		for(int i=0; i<arrayList.size(); i++){
			//Generic ������� ������ ����ȯ ���ʿ�
			System.out.print(arrayList.get(i));
		}

		System.out.println("\nJDK 1.5 �߰���� :: Generic, Enhanced For Loop ���");
		//==> ���� for���� ���Ͽ� ��������./JDK1.5�� �߰��� ��� :: Enhanced For Loop
		//ArrayList ���ο� ����� ���� size()��ŭ �ݺ�, 1EA�� ���� String �ش�.(Generic �������...)

		for(String value : arrayList){
			System.out.print(value);
		}
		
		System.out.println("\n==>APIȮ��");
		arrayList.add(1,"4.��");
		for(int i=0; i<arrayList.size(); i++){
			System.out.println(arrayList.get(i));
		}
	
		System.out.println("\n==>APIȮ��");
		arrayList.add(3,"4.ȫ���");
		for(int i=0; i<arrayList.size(); i++){
			System.out.println(arrayList.get(i));
		}

		arrayList.remove(3);
		for(int i=0; i<arrayList.size(); i++){
			System.out.println(arrayList.get(i));
		}

	}
}


























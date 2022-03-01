//package jp01.part05;

/*
	FileName: VectorTest01.java

	1. Array: ���� Data Type�� ����, ���� ����
	2. java.util.Vector: �ٸ� Data Type �� ����, ��������
*/
import java.util.*;

class VectorTest01 
{	
	///Main Method
	public static void main(String[] args) 
	{
		//Vector ���� : API�� �����ڸ� Ȯ��, ���ڷ� ���޵� 10,10 �ǹ� Ȯ��;
		Vector vector = new Vector(10,10);
		
		//Vector�� Object ���� ==> add(Object obj): Object�� ���ڷ� �޴´ٴ� �ǹ̴�?
		
		String s1 = new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("3.�� �ȳ��ϼ���.");

		//Vector ����� ���� ��� :: vector.capactiy() ������ return �ϴ°�...

		for(int i=0; i<vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//String s = (String)vector.elementAt(i); //���� �� line�� ��
			System.out.print(s);
			//System.out.print((String)vector.elementAt(i);
			}//for
			

			System.out.println("\n==>API Ȯ��");
			vector.insertElementAt("4.��:",1);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}//for
	
		
			System.out.println("\n==>API Ȯ��");
			vector.setElementAt("5.ȫ���",3);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}
		
			System.out.println("\n==>API Ȯ��");
			vector.removeElementAt(3);
			for(int i=0; i<vector.size();i++){
				System.out.print((String)vector.elementAt(i));
			}

	}
}
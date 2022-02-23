//package jp01.part09;

import java.util.HashSet;
import java.util.Set;

/*
	FileName : SetTest

	::java.util.HashSet : data�� �ߺ��� ������� �ʴ� �ڷ�����
		������ Set(interface)/ HashSetAPI�� Ȯ���ϰ� ������ Method �ǹ��� Ȯ��
		�Ʒ��� ��°ܷΰ��� ���� �� Ȯ��

*/

public class SetTest 
{
	
	public static void main(String[] args) 
	{
		Set<String>hs = new HashSet<String>();
		
		String str = new String("A");
		boolean isAddOk = hs.add(str); // �ߺ����� ���� �����͸� �����ϰ� booleanŸ���� true�� ��ȯ?
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("�������� : "+isAddOk);// ���� ���� �ߺ��� �ڷ��� �������� �ʰ� false�� ��ȯ�ϴ°� ����.

		System.out.println("����� data ���� : "+hs.size());

		if(hs.contains("b")){ // contains�� �ش� �����͸� ������ �ִ��� �Ǻ��ϴ� booleanŸ���� �޼ҵ�
			System.out.println("����� data b�� ������.");
			hs.remove("b");
		}
		System.out.println("����� data ���� : "+hs.size());
	}
}

import java.util.*;

public class StackTest
{

	/*
		FileName: StackTest.java
		
		::java.util.Stack (Last in First Out)
		������ API�� Ȯ���ϰ� ������ Method�ǹ̸� Ȯ��
		�Ʒ��� ��°���� ���� �� Ȯ��
	*/

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();

		String value = new String("1: ȫ�浿");
		stack.push(value);
		stack.push(new String("2.:�̼���"));
		stack.push("3.�ָ�");

		System.out.println("==> ����� Data ���� : "+stack.size());
		String str1 = stack.pop(); // �����͸� ������ ������
		System.out.println(str1);

		System.out.println("==> ����� Data ���� : "+stack.size());
		String str2 = stack.peek(); // ==> pop(), peek()�� ������...
		System.out.println(str2);	// �����͸� ������ �������� �ʰ� ���� ����...

		System.out.println("==> ����� Data ���� : "+stack.size());
		while(!stack.isEmpty()){ // ����ִ��� Ȯ���ϴ� boolean���� �޼ҵ��ΰ� ����.
			String str3 = (String)stack.pop(); // �����͸� �������鼭 �����.
			System.out.println(str3);
		}
	}
}

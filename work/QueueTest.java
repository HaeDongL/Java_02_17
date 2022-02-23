//package jp01.part09;
import java.util.LinkedList;
import java.util.Queue;
/*
	FileName: QueueTest.java

	::Java.util.Queue: First In First Out
		������ Queue(interface) / LinkedList�� Ȯ��, ������ Method �ǹ� Ȯ��
		�Ʒ��� ��°���� ���� �� Ȯ��

*/


public class QueueTest 
{
	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<String>(); // LinkedList�� Queue�� ��ӵǾ��ִ�.

		String value = new String("1: ȫ�浿");
		queue.offer(value);
		queue.offer(new String("2:�̼���"));
		queue.offer("3:�ָ�");

		String str1 = (String)queue.poll();//���� ���� ���� �����͸� �������鼭 �����͸�����.
		System.out.println(str1);

		String str2 = (String)queue.peek(); //==> poll(),peek()�� ��������...
		System.out.println(str2);		// �����͸� �������� ����.

		//==>peek()�� null�� return�ϴ� ������.../ null�� return �ϴ� ������ �̿� �ݺ���...
		while(queue.peek() != null){// ���� ���� �����Ͱ� ���� �ƴ϶�� �̶�¶�.
			String str3 = (String)queue.poll();
			System.out.println(str3);
		}
	}
}

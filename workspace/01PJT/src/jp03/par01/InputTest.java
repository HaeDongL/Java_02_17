package jp03.par01;

/*
 * FileName : InputTest.java
 * 
 * 1.java.io package: ���α׷� �ܺη� �ڿ��� �ްų�(?), ����(?)��쿡 ���
 * 2.keyboard�� ���� data�� �о� ���̸�...
 */

import java.io.*;

public class InputTest {
	//Main Method
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		//InpuStream :: ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream = System.in;
		
		System.out.println("�Է��� ��ٸ��ϴ�....");
		
		try {
			//���� �о���̴� ���� loop ����
			while(true) {
				
				//1.java.io �� ����(block)�ɼ� �ִ�.
				int i = inputStream.read();
				char c = (char)i;
				
				//2.java.io �� FIFO ���� => Queue
				System.out.println("�Է��Ͻ� �� : "+c);
				
				//==> char 'x'�� �ԷµǸ� while ����
				if(c=='x'){
					inputStream.close();
					break;
				}
				//�ѱ��Է½� ����(?)��... �ѱ� 1EA�� 2�� ����� ���� Ȯ������.
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
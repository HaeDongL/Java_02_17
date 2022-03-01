package jp03.par05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTestFilter02 {
	public static void main(String[] args) throws Exception {
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard�� �Է¹ޱ����� Sink Stream Reader ��
		// 1���� line�� �б����� readLine() Method �� �����ϴ� BufferedReader ����
		// Reader r = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//File �� ���� �������� FileWriter �� BufferedWriter ����
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(new FileWriter("test.txt"));//==> API
		bw = new BufferedWriter(new FileWriter("test.txt",true)); //==> API
		
		System.out.println("ȭ�Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		while(true) {
			String str = br.readLine();
			if(str.equals("��")) {
			break;
			}
			bw.write(str,0,str.length());
			//bw.write(str);
			bw.newLine();
		}
		bw.flush();
		
		//Stream close();
		br.close();
		bw.close();
		
		
	}
}
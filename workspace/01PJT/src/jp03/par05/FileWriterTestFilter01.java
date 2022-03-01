package jp03.par05;

import java.io.*;

/*
 * FileName: FileWriterTestFilter01.java
 * 
 * ==>FileCopy�ϴ� Application �ۼ�
 * 1.Keyboard�� FileName�� �Է�
 * 2.File�� ������ read() ==> FileReader
 * 3.File�� ������ write()==>FileWriter
 */

public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args) throws IOException {
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
				BufferedReader br = null;
				BufferedWriter bw = null;
				String fileName = "";
				String copyFileName = "";
				
				int readCount=0; //read�� Count�ϱ����� ����
				
				System.out.print("copy�� file�̸��� �Է��ϼ���: ");
				//copy �� FileName�� �Է¹ޱ�...
				fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
				
				//=> �������� Data�� read�� �� �ִ� BufferedReader ����
				br = new BufferedReader(new FileReader(fileName));
				//=> �纻���� �̸� �����
				copyFileName = fileName+"_copy";
				//=> Data�� write �� �� �ִ� BufferedWriter(copyFileName));
				bw = new BufferedWriter(new FileWriter(copyFileName));
				//read /writer �ϴ� while��
				String source = null;
				while((source=br.readLine())!=null) {
					
					bw.write(source);
					bw.newLine();
					readCount++;
				}
				bw.flush();//==>���� ����
				
				//Stream close()
				bw.close();
				br.close();
				
				System.out.println("=====================================");
				System.out.println("====>>>readȽ�� readCount: "+readCount);
				System.out.println("=====================================");
	}

	
		
	
}
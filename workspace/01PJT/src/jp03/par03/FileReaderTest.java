package jp03.par03;


import java.io.*;

/*
 * FileName: FileReaderTest01
 */

public class FileReaderTest {

	///main method
	public static void main(String[] args) {
		//File�� �о� ���̴� Stream ����
		FileReader fr = null;
		//read()�� count���� ����
		int readCount=0;
		
		try {
			fr = new FileReader(args[0]);
			
			while(true) {
				int i = fr.read();
				if(i==-1) {//i= -1�� �ǹ̴� ==> APIȮ���Ұ�.
					break;
				}
				
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
				
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n================================");
			System.out.println("=========>>> read Ƚ�� readCount : "+readCount);
			System.out.println("====================================");
			try {
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}

package jp03.par03;

import java.io.*;

/*
 * FileName : FileInputStreamTest
 * 
 */

public class FileInputStreamTest {

	public static void main(String[] args) {
		///File�� �о� ���̴� Strema ����
		FileInputStream fis = null;
		//read() �� count ���� ����
		Writer writer = new OutputStreamWriter(System.out);
		
		int readCount=0;
		
		try {
			fis = new FileInputStream(args[0]);
			
			while(true) {
				int i = fis.read();
				
				if(i==-1) {//-1�� �ǹ̴� ==> APIȮ�� �� ��.
					break;
				}
				
				//char c = (char)i;
				//System.out.print(c);
				writer.wait(i);
				
				readCount++;
			
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n=========================================");
			System.out.println("=======>> readȽ�� readCount: "+readCount);
			System.out.println("\n\n=========================================");
			try {
				if(fis!=null) {
				fis.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

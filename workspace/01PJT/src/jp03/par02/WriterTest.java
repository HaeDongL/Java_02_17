package jp03.par02;

/*
 *	FileName : WriterTest.java
 *	 1.byte 처리를 위한 Stream 인 input/output Stream을 이용하여
 *		Keyboard로 입력, monitor로 출력하는 예
 *	 2.한글 처리(문자처리)를 위하여 Reader/Writer 계열로 바꾸어 입력, 출력
 *
 */

import java.io.*;

public class WriterTest {
	//Main Method
	public static void main(String[] args) {
		
		try {
			//InputStream :: 표준입력장치 추상화한 class
			//InputStream inputStream = System.in;
			//문자리를 위한 Reader 로 변경
			//Reader reader = new InputStreamReader(inputStream);
			Reader reader = new InputStreamReader(System.in);
			
			//OutputStream:: 표준출력장치 추상화한 class
			OutputStream outputStream = System.out; 
			//문자처리를 위한 Writer 로 변경
			Writer writer = new OutputStreamWriter(outputStream);
			
			//Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("입력을 기다립니다...");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
				//writer.flush();
				
				if((char)i == 'x') {
					break;
				}
			
			}
			//==> while문 내부의 flush()와 밖의 flush()의 의미는?
			writer.flush();
			
			//Stream close()
			reader.close();
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}


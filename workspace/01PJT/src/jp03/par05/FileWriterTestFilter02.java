package jp03.par05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTestFilter02 {
	public static void main(String[] args) throws Exception {
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard로 입력받기위한 Sink Stream Reader 및
		// 1개의 line을 읽기편한 readLine() Method 를 제공하는 BufferedReader 생성
		// Reader r = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//File 에 글을 쓰기위한 FileWriter 및 BufferedWriter 생성
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(new FileWriter("test.txt"));//==> API
		bw = new BufferedWriter(new FileWriter("test.txt",true)); //==> API
		
		System.out.println("화일에 저장하실 글을 입력하세요.");
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
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

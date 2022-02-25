package jp03.par06;

import java.io.*;

/*
 * FileName: ReadObjectFile.java
 * 
 * o ObjectInputStream�� Persistence data (file)�� �����
 * 	 ȸ�������� ���� UserVO instance�Z(��ü�� ���¸� ��´�/����������)�о�´�.
 * 
 * 
 */


public class ReadObjectFile {
	
	//main Method
	
	public static void main(String[] args)throws Exception {
		//1.instance �� File�� ������ SinkStream :: FileOutputStream ����
		//2.instance �� �����ϴ� FilterStream : ObjectOutputStream ����
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO)ois.readObject();
		UserVO user02 = (UserVO)ois.readObject();
		
		System.out.println("1��° ȸ������ :: "+user01);
		System.out.println("2��° ȸ������ :: "+user02);
		
		//Stream close()
		ois.close();

	}

}

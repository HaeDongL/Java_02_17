package t03_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileController {

	public void reverseLine(String oldf, String newf)throws Exception{
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));
		String txt = null;
		while(true) {
			
			
			txt = br.readLine();
			bw.write(txt);
			bw.newLine();
			bw.flush();
			count++;
			if(txt == null) {
				break;
			}
			
			
		}
		
		//resverLine �޼ҵ�
		br.close();
		bw.close();
	}
	
	
	public static void main(String[] args)throws Exception  {
		
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf,newf);
	}

}

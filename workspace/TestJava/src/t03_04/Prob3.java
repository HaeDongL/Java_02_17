package t03_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob3 {

	
	public Vector getList() throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("list.txt"));
		Vector vc = new Vector();
		String read = "";
		String returnRead = "";
		String result = "";
		String[] strSplit = new String[4];
		while(true) {
			read = br.readLine();
			if(read == null) {
				break;
			}
		
		}
		return vc;
}
	
	
	public static void main(String[] args) throws Exception {
		
		Prob3 e = new Prob3();
		
		Vector scores = e.getList();
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}
		
	}

}

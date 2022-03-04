package t03_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Prob02 {

	private static int[] generateRandomNumber() {
		
		int[] randomIntArray = new int[10];
		int random = 0;
		Random rd = new Random();
		
		for(int i=0; i<randomIntArray.length;i++) {
			for(int j=0; j<randomIntArray.length; j++) {
				random = rd.nextInt(21);
				if(random == randomIntArray[j] ) {
					continue;
				}else {
					randomIntArray[i] = random;
				}
			}
					
		}
		
		return randomIntArray;
		
	}
	
	public static void printStatistics(int[] array) {
		BufferedWriter br = null;
		int maxNum = 0;
		int minNum = 21;
		int sum = 0;
		double avg = 0.0;
		String write = "";
		try {
			br = new BufferedWriter(new FileWriter("store.txt"));
			for(int list : array) {
				sum += list;
				br.write(Integer.toString(list));
				br.newLine();
				if(maxNum < list) {
					maxNum = list;
				}
				if(minNum > list) {
					minNum = list;
				}
			}
			avg = (double)sum / array.length;
			br.write("�ִ밪 : "+maxNum+"\n");
			br.write("�ּҰ� : "+minNum+"\n");
			br.write("��հ� : "+avg+"\n");
			br.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br == null) {
				try {br.close();} catch(Exception e) {}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] array = generateRandomNumber();
		Prob02.printStatistics(array);

	}

}
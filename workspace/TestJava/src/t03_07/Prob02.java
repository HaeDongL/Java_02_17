package t03_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Prob02 {

	private static int[] generateRandomNumber() {
		
		int[] randomIntArray = new int[10]; //초기값 0
		boolean[] difference = new boolean[10]; // 전부 false;
		int random = 0;
		Random rd = new Random();
		
		randomIntArray[0] = rd.nextInt(20)+1;
		for(int i=1; i<randomIntArray.length;i++) {
			while(randomIntArray[i] == 0) {
				random = rd.nextInt(21);
				for(int j=0; j<i; j++) {
					if(random == randomIntArray[j]) {
						break;
					}else if(j == i-1) {
						randomIntArray[i] = random;
					}
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
//				if(maxNum < list) {
//					maxNum = list;
//				}
//				if(minNum > list) {
//					minNum = list;
//				}
				maxNum = Math.max(maxNum,list);
				minNum = Math.min(minNum,list);
				
			}
			
			avg = (double)sum / array.length;
			br.write("최대값 : "+maxNum+"\n");
			br.write("최소값 : "+minNum+"\n");
			br.write("평균값 : "+avg+"\n");
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

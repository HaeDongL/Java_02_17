package t03_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob04 {
	
	//static method
	public static char CheckGrade(double avg) {
		char grade = 'F';
		
		if(avg <= 100 && avg >= 90) {
			grade = 'A';
		}else if(avg <= 89 && avg >= 80){
			grade = 'B';
		}else if(avg <= 79 && avg >= 70){
			grade = 'C';
		}else if(avg <= 69 && avg >= 60){
			grade = 'D';
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.print("학번을 입력하세요 : ");
		stdNum = keyBoard.nextLine();
		System.out.print("국어 성적을 입력하세요 : ");
		kor = keyBoard.nextInt();
		while(kor > 100 || kor < 0) {
			System.out.print("점수가 잘못 되었습니다. 다시입력 하세요 : ");
			kor = keyBoard.nextInt();
		}
		System.out.print("수학 성적을 입력하세요 : ");
		math = keyBoard.nextInt();
		while(math > 100 || math < 0) {
			System.out.print("점수가 잘못 되었습니다. 다시입력 하세요 : ");
			math = keyBoard.nextInt();
		}
		System.out.print("영어 성적을 입력하세요 : ");
		eng = keyBoard.nextInt();
		while(eng > 100 || eng < 0) {
			System.out.print("점수가 잘못 되었습니다. 다시입력 하세요 : ");
			eng = keyBoard.nextInt();
		}
		System.out.print("자바 성적을 입력하세요 : ");
		java = keyBoard.nextInt();
		while(java > 100 || java < 0) {
			System.out.print("점수가 잘못 되었습니다. 다시입력 하세요 : ");
			java = keyBoard.nextInt();
		}
		
		/*이곳에 프로그램을 완성하십시오.*/
		sum = kor + math + eng + java;
		avg = (double)sum/4;
		
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter("grade.txt"));
		
		bw.write("--------------------------\n");
		bw.write("학번 : "+stdNum+"\n");
		bw.write("--------------------------\n");
		bw.write("국어 : "+kor+"\n");
		bw.write("수학 : "+math+"\n");
		bw.write("영어 : "+eng+"\n");
		bw.write("자바 : "+java+"\n");
		bw.write("--------------------------\n");
		bw.write("총점 : "+sum+"\n");
		bw.write("평균 : "+avg+"\n");
		bw.write("학점 : "+Prob04.CheckGrade(avg)+"\n");
		bw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw == null) {
				try {bw.close();}catch(Exception e) { }
			}
		}
		
	}
}

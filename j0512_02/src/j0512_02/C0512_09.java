package j0512_02;

import java.util.Scanner;

public class C0512_09 {

	public static void main(String[] args) {
		//국어,영어,수학,합계에 이름을 첫번째, 평균을 마지막에 추가하세요
		Scanner scan = new Scanner(System.in);

		//1. 배열 변수 입력
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[2];
		int[][] score = new int[2][4];
		double[] avg = new double[2];
		
		//2. 점수 입력
		for(int i=0;i<score.length;i++) {
		System.out.println((i+1)+"번째 : ");

		// 이름 
		System.out.println("이름을 입력하세요");
		name[i] = scan.next();
		// 점수		
		for(int j=0;j<score[i].length-1;j++) {
			System.out.println(title[j+1]+"점수를 입력하세요.");
			score[i][j]= scan.nextInt();
		} //for j
			
		// 3.합계 점수, 평균 점수
		score[i][3] = score[i][0]+score[i][1]+score[i][2];
		avg[i] = score[i][3]/3.0;
		}//  for i
		
		// 4.점수 출력
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		// 5. 출력
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}// for j
			System.out.println(avg[i]);
		}//for i
		

	}// main
} //class
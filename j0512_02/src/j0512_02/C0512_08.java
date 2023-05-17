package j0512_02;

import java.util.Scanner;

public class C0512_08 {

	public static void main(String[] args) {
		//국어, 영어, 수학,합계
		Scanner scan = new Scanner(System.in);
		
		//1.배열 변수 입력
		String[] title = {"국어","영어","수학","합계"};
		int [][] score = new int[4][4];
		
		
		//2. 점수입력
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 : ");
			
			for(int j=0;j<score[i].length-1;j++) {
				System.out.println(title[j]+"점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}// for j
			
			// 점수 배열에서 점수 입력할 때  zero index 번호 입력
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
		} //for i
		
		// 3. 점수 출력
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		} 
		System.out.println();
		
		// 4. 출력
		 for(int i=0;i<score.length;i++) {
			 for(int j=0;j<score[i].length;j++) {
				 System.out.print(score[i][j]+"\t");
			 }//for j
			 System.out.println();
		 }//for i

		 
	}// main

} //class

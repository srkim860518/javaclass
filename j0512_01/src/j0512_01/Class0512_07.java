package j0512_01;

import java.util.Scanner;

public class Class0512_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] title =  {"국어","영어","수학"};
		int[][] score = new int[5][3]; // 5명의 국어,영어,수학
		//점수입력
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 : ");
			for(int j=0;j<score[i].length;j++) {
				System.out.println(title[j]+"점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}//for j
		}//for i
		
		//출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
								System.out.print(score[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i


	} // main

}// Class

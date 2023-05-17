package j0512_02;

import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		//10 진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
//		// 1차원 배열
//		int[] num = new int[3];
//		for(int i=0;i<num.length;i++) {
//			System.out.println("점수를 입력하세요.");
//		    num[i] = scan.nextInt();
//		}//for
//		for(int i=0;i<num.length;i++);
//			System.out.println(num[i]);
//		} // for
//	    
//-------------------------------------------------------------		
		//2차원의 재배열
		//1.변수 입력
		int[][] score = new int[2][2];
	
		// 2.점수 입력
		for(int i=0;i<score.length;i++) {
		  for(int j=0;j<score[i].length;j++) {
		  System.out.println("2차원 점수를 입력하세요.");
		  score[i][j] = scan.nextInt();
	}// for j
} //for i
		
// 3. 출력
for(int i=0;i<score.length;i++) {
	for(int j=0;j<score[i].length;j++) {
		System.out.print(score[i][j]+"");
	}// for j
	System.out.println();
} //for i


	}// main

} //class

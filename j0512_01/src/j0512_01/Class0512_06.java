package j0512_01;

import java.util.Scanner;

public class Class0512_06 {

	public static void main(String[] args) {
		// 1.5 다차원 배열의 선언과 생성
	    //1차원 배열
		Scanner scan = new Scanner(System.in);
//		int[] num = new int[3];// 한 줄 5칸, for문은 1번만 
//		for(int i=0;i<num.length;i++) {
//			System.out.println("점수를 입력하세요.");
//			num[i] = scan.nextInt();
//			
//		}//for
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
		// 2차원 배열
		int[][] score = new int[3][4]; //행열로 이루어진 다차원 배열
		for(int i=0;i<score.length;i++) {
		  for(int j=0;j<score[i].length;j++) {
		    System.out.println("2차원 점수를 입력하세요.");
		    score[i][j] = scan.nextInt();
		    
		 } // for j
		} //for i
		//출력
		for(int i=0;i<score.length;i++) {
			  for(int j=0;j<score[i].length;j++) {
			    System.out.print(score[i][j]+"");
			    
			 } // for 
			  System.out.println();// 마지막 1~12까지를 행 단위로 나눔.ln
			}
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
		
		
		
		
		
		
		

	} //main

}//Class

package j0512_01;

import java.util.Scanner;

public class Class0512_08 {

	public static void main(String[] args) {
		//국어, 영어, 수학, 합계
		Scanner scan = new Scanner(System.in);
		String[] title = {"국어","영어","수학","합계"};
		int[][] score = new int[4][4];
		// 점수입력
	   for(int i=0;i<score.length;i++) {
	   	System.out.println((i+1)+"번째 :  ");

	     for(int j=0;j<score[i].length-1;j++) {// 합계는 -1
	    	 System.out.println(title[j]+"점수를 입력하세요.");
	    	  score[i][j] = scan.nextInt();
	     }//for j
	     //j 값은 존재하지 않음
	     score[i][3] = score[i][0]+score[i][1]+score[i][2]; // 이부분 수정해주세요
	   }// for i	
	   
	
	   //점수 출력
	  for(int i=0;i<title.length;i++) {
		  System.out.printf("%s\t", title[i]);
	  }
	  System.out.println();
		// 출력
	   for(int i=0;i<score.length;i++) {
		   for(int j=0;j<score[i].length;j++) {
			   
			   System.out.print(score[i][j]+"\t");
			   
		   }//for j
		   System.out.println();
	   }//for i
	   
	   
	} //main

}//Class

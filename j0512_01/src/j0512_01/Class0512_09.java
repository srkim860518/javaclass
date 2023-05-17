package j0512_01;

import java.util.Scanner;

public class Class0512_09 {

	public static void main(String[] args) {
		//문제) 국어, 영어, 수학, 합계 에 이름을 첫번째, 평균을 마지막에 추가하세요 
		
		Scanner scan = new Scanner(System.in);
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] Name = new String[5];  //추가 1. 이름 변수 + [행수 입력]  " // new string[""]는 따옴표안에는 값을 직접 입력하고 싶을때
		int[][] score = new int[5][4];
		double[] avg = new double[5];  //추가 1. 평균 변수 지정 + [행수 입력]
		// 점수입력
	   for(int i=0;i<score.length;i++) {
	   	System.out.println((i+1)+"번째 :  ");
	   	// 이름 입력 받으면 됨.
	   	System.out.println("이름을 임력하세요."); // 추가2. 이름 입력값 추가
	   	Name[i]= scan.next();

	     for(int j=0;j<score[i].length-1;j++) {// 합계는 -1
	    	 System.out.println(title[j+1]+"점수를 입력하세요."); // 국어점수 1인덱스부터 입력
	    	  score[i][j] = scan.nextInt();
	 
	     }//for j
	     //j 값은 존재하지 않음
	     score[i][3] = score[i][0]+score[i][1]+score[i][2]; // 합계 점수 입력 [i][3] 3은 인덱스 번호 = score[i][인덱스번호 ] 3개 더하기
	     avg[i] = score[i][3]/3.0; //2. .평균 입력 
	   }// for i	
	   
	
	   //점수 출력
	  for(int i=0;i<title.length;i++) {
		  System.out.printf("%s\t", title[i]);
	  }
	  System.out.println();
	  
		// 출력
	   for(int i=0;i<score.length;i++) {
		   System.out.print(Name[i]+"\t"); // 3. 이름을 추가했을때 마지막 출력 Name[i]
		   for(int j=0;j<score[i].length;j++) {
		
			   System.out.print(score[i][j]+"\t"); //합계 입력 
			   
		   }//for j
		   System.out.println(avg[i]); // 3. 평균 출력 : 마지막 입력 프린트 임으로 println(평균);과 같이 프린트 
		   // 평균을 추가 하지 않았을때는 println으로 마무리, class0512_07로 마무리
		   }//for i
	   

	   //print  

	} //main

}//Class

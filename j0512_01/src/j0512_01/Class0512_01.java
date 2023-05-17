package j0512_01;

import java.util.Scanner;

public class Class0512_01 {

	public static void main(String[] args) {
		// 문제)
		//1. 성적입력
		//2. 성적출력
		//3. 성적수정
		//4. 등수처리
		//0. 프로그램종료
		Scanner scan = new Scanner(System.in);
		int[] score = new int [6]; // 배열
		int input = 0;
		int count = 0;             // 변수
		//성적입력 변수
		
		 int n = 2;         // n은 임시 지정 변수를 지정하였으니 값도 [n]
		String[] name = new String[n];
		int[] kor = new int[n];
		int[] eng = new int[n];
		int[] math = new int[n];
		int[] total = new int[n];
		double[] avg = new double[n];
		
		while(true) {                               // 무한 반복
			System.out.println("[성적처리프로그램]");
			System.out.println("성적입력");
			System.out.println("성적출력");
		    System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			
			switch(input) { // switch 조건문 : == true일때만, if 조건은 등
			
			case 1: // 성적입력
				for(int i=count;i<name.length;i++) {
					System.out.println((count+1)+"첫번째 이름을 입력하세요.(0.이전페이지 이동)");
					
					name[i] = scan.next();
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동 합니다.");
						System.out.println();
						break;
					} // if
					
					System.out.println("국어점수를 입력하세요.");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					math[i] = scan.nextInt();
					
					// 자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++;			
				} // for
				break; //switch
				
			case 2: // 출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
//				System.out.printf("%s\t%d/t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
				for(int i=0;i<count;i++) {
				
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);				
				} //for
				break;			
			
			} // switch	
			
		}//while
				
		
		
	} //main

}//Class

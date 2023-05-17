package j0512_02;

import java.util.Scanner;

public class C0512_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//문제)
//		1. 성적 입력
//		2. 성적 출력
//		3. 성적 수정
//		4. 등수 처리
//		0. 프로그램 종료
		int[] score = new int[6]; // 배열
		int input = 0; //무한 반복의 입력 변수
		int count = 0; // count 변수 
		
		// 성적입력 변수
		//int n = 2; test할땐 간단히 2개만 합시다
		String[] name = new String [5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];		
		
		//성적입력
		while(true) { // while 반복문
			System.out.println("<성적 처리 프로그램 >");
			System.out.println("<1. 성적 입력>");
			System.out.println("<2. 성적 출력>");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			
		switch(input) { // switch 조건문
		
		//성적입력
		case 1: 
			for(int i=count;i<name.length;i++) {
				System.out.println((count+1)+"첫번째 이름을 입력하시오.(0.이전페이지 이동");
				
				name[i] = scan.next();
				if(name[i].equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
				} //if
				
				System.out.println("국어 점수를 입력하세요.");
				kor[i] = scan.nextInt();
				System.out.println("영어 점수를 입력하세요");
				eng[i] = scan.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				math[i] = scan.nextInt();
				
				//자동 계산
			   total[i] = kor[i]+eng[i]+math[i];
			   avg[i] = total[i]/3.0;
			   count++;

			} // for 
			break; 
		
		//출력
		case 2:
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
			for(int i=0;i<count;i++) {
				System.out.printf("%s\t%d\t%d\t%d\t5%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			}//for
			break;
		  } // switch+
		}//while
			
	}// main
} //class
			

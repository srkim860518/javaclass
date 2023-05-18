package j0518_01;

import java.util.Scanner;

public class Class0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력 받아 양수인지 음수인지 출력하시오. 0은 양수로 인정
		//
		Scanner scan = new Scanner(System.in);
//		System.out.println("[음수양수 확인 프로그램");
//		System.out.println("수를 입력하세요.");
//		int num = 0;
//		num = scan.nextInt();
//		if(num<0) {
//			System.out.println("음수"); 
//		}else {
//			System.out.println("양수");
//		}
//		// 변수 선언
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();
		
		// 
		int total = kor+eng+math;
		System.out.println("합계: "+total);
		double avg = total/3.0;
		System.out.printf("평균: %.2f \n",avg);
		
		
		System.out.println("합격여부");
		if(avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
				
				
				
				
	}	// main

}//class

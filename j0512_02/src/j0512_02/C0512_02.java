package j0512_02;

import java.util.Scanner;

public class C0512_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//문제) 이름,국어,영어,수학, 합계,평균 = 10명
		
//		1. 성적 입력
//		2. 성적 출력
//		3. 성적 수정
//		4. 등수 처리
//		5. 학생 성적 프로그램
//		0. 프로그램종료
		
		// 변수 입력
		int input=0; // 프로그램 종료, 탈출 
		int count=0; //입력된 학생 수
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];
		
		while(true) {
			
			// 2. 화면 출력
			System.out.println("## 성적 입력 프로그램 ##");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
//			System.out.println("3.성적 수정"); // input 
//			System.out.println("4.등수 처리");
//			System.out.println("5.학생 성적 검색");
//			System.out.println("6.프로그램을 종료합니다.");
			System.out.println("----------------------------"); 
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			
		
			if(input==0) {
				System.out.println("## 프로그램 종료합니다. ##"); // 탈출
				break;
		}//if
			
		// 3.조건문
		switch(input) {
		
		case 1: // 성적입력
			for (int i=count;i<name.length;i++) {
				System.out.println("이름을 입력해주세요.(0.이전 화면으로 이동)");
				name[i] = scan.next();	
				if(name[i].equals("0")) {
				
					System.out.println("이전 화면으로 이동합니다.");
					System.out.println();				
				    break;
			}//if
				
				
				System.out.println("국어 점수를 입력해주세요");
				kor[i] = scan.nextInt();
				System.out.println("영어 점수를 입력해주세요.");
				eng[i] = scan.nextInt();
				System.out.println("수학 점수를 입력해주세요.");
				math[i] = scan.nextInt();
				total[i] = kor[i] + eng[i] + math[i];
				avg[i] = total[i]/3.0;
//				count++;
			} // case1 for
			break;

		case 2:
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
			for (int i = 0; i < count; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			} //case2 for
			break;
		}//switch

		}//while
			
	}// main

} //class

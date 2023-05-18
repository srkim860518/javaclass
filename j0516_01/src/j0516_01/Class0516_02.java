package j0516_01;

import java.util.Scanner;

public class Class0516_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학, 합계,평균 - 10명
		int choice = 0; // 선택 번호
		int count = 0; // 등록 성적 입력 학생 수
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		
	// 무한 반복
		loop:while(true) {
			
	// 화면출력 부분
			System.out.println("[학생 성적처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {			// switch(choice)= if 조건문과 동일 하다 생각하세요
			
			case 1: 
				for(int i=0;i<name.length;i++) {
					// 이름 부분 입력
					System.out.println((count+1)+"번째 학생의 이름을 입력하세요.(0.이전 페이지 이동)");
			// 국어 :score[i][0], 영어 : score[i][1], 수학: score[i][2]	
					name[i] = scan.next();
				}
					
					
					
		
			// 국영수 점수 입력
			for(int j=0;j<3;j++) {
			System.out.println((title[j+1])+"점수를 입력하세요");
			score[i][0]= scan.nextInt();
								
				}// for
			
			// 합계부분
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			/// 평균 부분
			avg[i] = score[i][3]/3.0;
			
			System.out.println((count+1)+"번째 학생 성적이 등록되었습니다.");
			System.out.println();
					
			// 학생수 1 증가
			count++;
			
			
				}//for
			break;

			case 0:
			    System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;// switch 종료

				
			} // switch
					
		} //while
	
	} // main

} // class




























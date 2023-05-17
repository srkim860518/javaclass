package j0515_01;

import java.util.Scanner;

public class Class0515_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// class0512-02 복사- 성적 수정하기
//문제) 이름,국어,영어,수학, 합계,평균 = 10명

//		1. 성적 입력
//		2. 성적 출력
//		3. 성적 수정
//		4. 등수 처리
//		5. 학생 성적 프로그램
//		0. 프로그램종료

		// 변수 입력
		int input = 0; // 프로그램 종료, 탈출
		int count = 0; // 입력된 학생 수
		String modifyname=""; // 수정
		String[] name = new String[10];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		int[][] score = new int[10][4];
//		int[] kor = new int[2];
//		int[] eng = new int[2];
//		int[] math = new int[2];
//		int[] total = new int[2];
		double[] avg = new double[10];

		while (true) {

			// 2. 화면 출력
			System.out.println("## 성적 입력 프로그램 ##");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.성적 수정"); // input
			System.out.println("4.등수 처리");
			System.out.println("5.학생 성적 검색");
			System.out.println("6.프로그램을 종료합니다.");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();

			if (input == 0) {
				System.out.println("## 프로그램 종료합니다. ##"); // 탈출
				break;
			} // if

			// 3.조건문
			switch (input) {

			case 1: // 성적입력
				for (int i = count; i < name.length; i++) {
					System.out.println("이름을 입력해주세요.(0.이전 화면으로 이동)");
					name[i] = scan.next();
					if (name[i].equals("0")) {

						System.out.println("이전 화면으로 이동합니다.");
						System.out.println();
						break;
					} // if

					// 국어,영어,수학-> 합계 title 이름, 국어, 영어, 수학
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j+1]+"점수를 입력하세요.");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3] + score[i][j]; // 국어,영어,수학->합계
					} // for
					avg[i] = score[i][3] / 3.0;
					count++;
				} // case1 for
				break;

			case 2:
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				
				System.out.println();
				System.out.println("------------------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
				} // case2 for
				break;
				
			case 3: // 3. 성적 수정
				System.out.println("수정할 학생 이름을 입력하세요.");
				modifyname=scan.next();
				
				int chk = 0; //찾을 학생이 없을 경우 0, 있으면 1
				
					for(int i=0;i<count;i++) {
					if(name[i].equals(modifyname)) { // 
						System.out.println("[수정과목 선택]");
						System.out.println("------------------------------");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("수정할 과목을 선택해 주세요.");
						System.out.println();
						input = scan.nextInt();
						chk = 1;// 찾는 학생이 있을 경우 1로 변경
						
						switch(input) {
						
						case 1:
							//score[i][0]= 국어, score[i][1] = 영어, score[i][2]= 수학, score[i][3]= 합계
							System.out.println("현재 국어 점수는 : "+score[i][0]);
							System.out.println("---------------------------------------------");
							System.out.println("변경할 국어점수를 입력하세요");
							score[i][0]=scan.nextInt();// 수정할 점수 입력
							score[i][3]=score[i][0]+score[i][1]+score[i][2];// 합계 수정
							avg[i]=score[i][3]/3.0; // 평균 수정
							System.out.println("[수정완료");
							System.out.println();							
							break;
						}// switch-case 3
				
				   }// if
				}// for
				
				if(chk==0) {					
					System.out.println("[찾는 학생 없음]");
					System.out.println("찾는 학생이 없습니다. 다시 입력해 주세요. ");
					System.out.println();
				}// if
				
				break;
			}//switch

		} // while

	}// main

} // class

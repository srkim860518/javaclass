package j0516_01;

import java.util.Scanner;

public class Class0516_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Class0516_03 인스턴스 내용 수정된 내용 비교 하세요
		
		int choice = 0; // 선택 번호
		int count = 0; // 등록 성적 입력 학생 수
		String searchName = "";
		String[] name = new String[10];
		
		int[][] score = new int[10][4]; //
		int chk = 0;// 존재유무(학생 존재의 유무)
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		Student[] s = new Student[10]; // 참조 변수 배열 10개 생성 // 객체는 삭제 불가, 대신 0으로 입력 대체
	//	s[0] = new Student(); // 객체 선언 , 참조 변수 저장 됨
	
		while(true) {
			// b.화면출력
			System.out.println("[성적 처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();

		switch(choice) {
	
		case 1:// 이름: i
			for (int i = count; i < s.length; i++) {
				s[i]= new Student(); //객체 선언
				
				//이름 입력
				
				
				
				System.out.println((count + 1) + "번째 학생의 이름을 입력하세요(0.이전화면 이동)");
				s[i].name = scan.next();

				// 이전 페이지 이동확인
				if (s[i].name.equals("0")) { // equals("0" = name[i]=="0"이 같을 때 
					System.out.println("이전 페이지 이동됩니다..");
					System.out.println();
					break; // 추가해야만 페이지 이동!!!!
				}
				// 국영수
				System.out.println("국어 점수를 입력하세요. ");
				s[i].kor = scan.nextInt();
				System.out.println("영어 점수를 입력하세요. ");
				s[i].eng = scan.nextInt();
				System.out.println("수학 점수를 입력하세요. ");
				s[i].math = scan.nextInt();


				// 합계부분
				s[i].sum();

				/// 평균 부분
				s[i].average();
				// 과목
				System.out.println((count + 1) + "번째 학생 성적이 등록되었습니다.");
				System.out.println();

				// 학생수
				count++;
			}

			} // for 이름

			break;

	
	
		}//switch(choice)
	
	
	
	} // main

} // class



















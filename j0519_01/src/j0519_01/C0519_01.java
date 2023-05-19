package j0519_01;

import java.util.Scanner;

public class C0519_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student[] s = new Student[10]; //객체선언
		String[] title = {"kor","math","eng","total","avg","rank"};// 객체 배열 선언
		
		int count = 0; // 원하는 번호 입력하는 변수
		int choice = 0;
		// 성적 입력
		System.out.println("[성적처리프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		
		
		switch(choice) {
				
		case 1: // Student class에 입력받은 s[i]= new student 학생선언 
			   for(int i=0;i<s.length;i++) { 
				
				   s[i]= new Student();
				   
				   System.out.println("이름을 입력해주세요");
				   s[i].name= scan.next();
				   System.out.println("국어 점수를 입력해주세요");
				   s[i].kor = scan.nextInt();
				   System.out.println("영어 점수를 입력해주세요");
				   s[i].eng = scan.nextInt();
				   System.out.println("수학 점수를 입력해주세요");
				   s[i].math = scan.nextInt();
			   }//for


		
		}// switch

	}// main

}// class





























package j0509_01;

import java.util.Scanner;

public class Class0509_03 {
	public static void main(String[] args) {
		
		// 어떻게 짜여있는지 확인 한는 키 : ex) ctrl + println
		
		// 배운거 연습
		  // int kor = 15;   // 변수를 지정할때 첫글자가 숫자만 아니면 됨!!! 7kor 에러발생 두번째 이상 부터 가능
		  double kor = 10;
	      int eng = 12;
	      int math = 89;
		  String name="홍길동"; // 이름 나중에 추가
	      
		// 데이터 입력 Scanner- 파일 또는 화면에서 입력을 받음. 객체는 대문자 표기 됨
		//java.util.Scanner;  --> 상단 자동 생성 import java.util.Scanner;
		Scanner scan = new Scanner(System.in);
		//String str = new String("aaa")
		System.out.println("이름을 입력하세요.");
		name = scan.next(); // 띄어씌고 전까지만 나옴 ex너무 좋아요  너무 띄어쓰기 뒤부터 안나옴
//		name = scan.nextLine(); // 한줄 전체 입력 ex)너무 좋아요 함께 해요.  
		
		
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextDouble(); // 입력 받는 숫자 대기숫자를 입력 받음 nextDouble은 실수를 입력받는 다는 뜻
		System.out.println("영어 점수를 입력하세요");
        eng = scan.nextInt();
        System.out.println("수학 점수를 입력하세요");
        math = scan.nextInt();
		      
        
		double total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");
		System.out.printf("%s\t%.1f\t%d\t%d\t%.1f\t%.1f\n",name,kor,eng,math,total,avg);
		
		
		
	} // main
} // class


// scanner import 자동으로 뜨는거 질문하기
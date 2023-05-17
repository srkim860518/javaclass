package j0512_01;

import java.util.Scanner;

public class Class0512_02 {

	public static void main(String[] args) {
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료
		
		// 이름,국어,영어,수학, 합계,평균 = 10명
		Scanner scan = new Scanner(System.in);
		int input=0;
		int count=0;
		String[] name = new String[10]; // 배열도 하나의 객체 같은 개념
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		while(true) {
		//2. 화면 출력
		System.out.println("[성적프로그램처리");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		input = scan.nextInt();
		
		if(input==0) {
			System.out.println("[이프로그램을 종료합니다.");
			break;
		}
		
		//3. 조건문
		switch(input) {
		
		case 1: // 성적입력 
			for(int i=count;i<name.length;i++) {
			System.out.println("이름을 입력하세요.(0.이전 화면으로 이동)");
			name[i] = scan.next();		// i 번째에 진행 
			if(name[i].equals("0")) {
				System.out.println("이전 화면으로 이동합니다.!!");
				System.out.println();
				break;
			}
			
			System.out.println("국어 점수를 입력하세요.");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			eng[i] =  scan.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/0.3;
			count++;
			}
		case 2:
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
			for(int i=0;i<count;i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			}
			
			break;
	
		} //switch 
		
		}// while
		
		
		
		
		
		
		
		
		
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
//----------------------------------------------
		
		
		
		

	} //main

}//Class

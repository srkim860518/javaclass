package j0511_01;

import java.util.Scanner;

public class Class0511_09 {

	public static void main(String[] args) {
		// 문제) 랜덤 숫자 맞추기
		// 10번 기회를 주어지고 정답확인시 입력한 번호를 출력해 보세요.
		//1. 랜덤 숫자 맞추기
		Scanner scan = new Scanner(System.in);
		int input=0;// 입력 받은 변수
		int random=0;// 랜덤 받을 숫자
		int count=0; // 도전 횟수 
		int[] num = new int[10];// 입력한 숫자를 저장
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 :"+random);
		
		while(true) {
			// 몇 번 도전했는지 확인 
			if(count>=10) {
				System.out.println("10번 도전했습니다. 프로그램을 종료합니다.");
				break;				
			}
			// 도전번호 입력
			System.out.println((count+1)+"번째 숫자를 입력하세요>>>");
			num[count] = scan.nextInt();
			if(num[count]==random) {
				System.out.println("정답입니다.");
			  break;
			}else {
				System.out.println("오답입니다. 다시 도전하세요.");
			}
			count++;
		}// while
		
		//count = 10
		
//		//입력한 숫자 출력
//		System.out.println("정답 : "+random);
//		System.out.println("입력한 숫자: ");
//		for(int i=0;i<count;i++) { // count 만큼 도전
//			System.out.print(num[i]+",");
			
		// 따옴표를 빼고 싶을 때 -- 교수님 자료 확인하기
			System.out.println("정답 : "+random);
			System.out.println("입력한 숫자: ");
			for(int i=0;i<count;i++) { // count 만큼 도전
				if(i==0 ) {
					System.out.print(num[i]);
			}else {
				System.out.print(","num[i]);
				
		}
	 
			
		
		
		//---------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		//-------------------------------			
		//---------------------------------------------------------------------		
					
					
					
					
					
		//---------------------------------------------------------------------		
								
				
				
					
		
		

	}// main

}// class

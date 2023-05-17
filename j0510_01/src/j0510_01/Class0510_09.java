package j0510_01;

import java.util.Scanner;

public class Class0510_09 {
	
	public static void main(String[] args) {
		// //교수님 자바 Chapter 4. 조건문과 반복문 
		// 2.3 중첩 반복문 = 중첩 for 문
		
//		for(int i=1;i<=9;i++) {
//			//System.out.println(i+" * "+i" = "+(i*i));
//			System.out.printf("%d *d = %d \n", i,i,i*i);
//		}
//--------------------------------------------------------
		//중첩 반복문 2번 (3번이 하고 싶으면 )
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) // i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//			//System.out.println(i+" * "+i" = "+(i*i));
//			System.out.printf("%d %d = %d \n",i,j,i*j);
//		}
//		System.out.println(); //i=1 * j=1~9까지 반복 하고 구간 나눔
//------------------------------------------------------------------------------------	
                //구구단  구간 나눔System.out.println("[    ]");
				//중첩 반복문 2번 (3번이 하고 싶으면 )
//				for(int i=1;i<=9;i++) {
//					System.out.println("[    ]");
//					for(int j=1;j<=9;j++) // i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//					//System.out.println(i+" * "+i" = "+(i*i));
//					System.out.printf("%d %d = %d \n",i,j,i*j);
//				}
//				System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
////-------------------------------------------------------------------------------------				
//				//중첩 반복문 - 구구단  구간 나눔System.out.println("[    ]");
//				for(int i=1;i<=9;i++) {
//					System.out.println("[ %단  ]");
//					for(int j=1;j<=9;j++) // i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//					//System.out.println(i+" * "+i" = "+(i*i));
//					System.out.printf("%d *d = %d \n",i,j,i*j);
//				}
//				System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
//------------------------------------------------------------------------------			
				//중첩 반복문
//				//문) 0-9까지 출력하시오.
//				for(int i=1;i<=10;i++) {
//					System.out.println(i);
//				}
//------------------------------------------------------------------------------					
//				//문) 00 01 02 03 04,,,,, 09 10 11....99	
//				for(int i=0;i<=9;i++) { //중괄호를 한 문단 사용 비추!!!/ 중괄호 2번 추천!!!!!
//				for(int j=0;j<=9;j++) { // i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//					//System.out.println(i+" * "+i" = "+(i*i));
//					System.out.printf("%d%d \n",i,j);
//				}
//				}
//	
//				System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
//-----------------------------------------------------------------------------
				// // //교수님 자바 Chapter 4. 조건문과 반복문 
				// 2.4 while 문
				//i--, i-=1, i=i-1
				//i++, i+=1, i+i+1
//				for(int i=10;i>0;i=1-1) { // 1을 빼고 싶을 때
//				 System.out.println(i);
//---------------------------------------------------------------				 
//				 for(int i=10;i>0;i=1-2) { // 2를 빼고 싶을 때
//					 System.out.println(i);
//---------------------------------------------------------------					
//					 for(int i=10;i>0;i=1-5) { // 5를 빼고 싶을 때
//						 System.out.println(i);
//---------------------------------------------------------------
		//	i=0일때 , i=1일때 비교하기  
				
//				// i=0	인경우
				//for(int i=0;i<10;i++) { 
//				  System.out.println(i);
//				}		 
				// i=1	인경우
//					for(int i=1;i<10;i++) { 
//						  System.out.println(i);
//				}
//--------------------------------------------------------------------		
		//문제) 랜덤 숫자 1-100까지의 랜덤 숫자 1개를 출력하시오.
				int random = 0;
	        	random = (int)(Math.random()*100)+1;
		  	    Scanner scan = new Scanner(System.in);
			//	System.out.println(random);
//--------------------------------------------------------------------				
		//문제) 숫자 맞추기 프로그램
				// 10번
//				int i = 1;
//				while(i<=10) // 10번이라고 하면 11번째때 나옴 10+ i(1)
//					System.out.println("숫자를 입력하세요.");
//					int input = scan.nextInt(); // 10번 입력 받음
//					
				int i = 1;
				while(i<=10) { 
					System.out.println(i+"숫자를 입력하세요.");
					int input = scan.nextInt(); // 10번 입력 받음
					if(input==random) {
						System.out.println("정답입니다.");
						break;
					}else if(input>random) {
						System.out.println("[ 오답 ]입력한 숫자 보다 작은 수입니다.");
					}else {	
						System.out.println("[ 오답 ]입력한 숫자 보다 큰 수입니다.");
					}
				}
				// 랜덤숫자 1~100번 중에 1개가 랜덤으로 임시 지정됨 ex)53이라고 한다면
				//랜덤 숫자를 기준으로 오답의 숫자보다 큰 수입니다. 작은 수 입니다 
				//랜덤 숫자를 맞추면 break로 나오게 됨
				
//------------------------------------------------------------------------------				
				// 숙제 5/11ㅇㄹ에 품
				// 문제) 10개의 숫자를 입력받아 합계를 출력하시오.
				// 1. 변수선언 2. Scan입력 3. 합계 4. 출력	
					Scanner scan = new Scanner(System.in);
					
					int num =0, sum=0;
					int i = 0;
					//반복문
					while(i>10) {
						//2. 반복문
						System.out.println((i+1)+"번째 숫자를 입력하세요.");//(i+1) 몇번째를 뜻함.
						num= scan.nextInt();
						//3. 합계
						sum = sum + num;// 10번 출력은 여기까지 
					}
						
					i++;
						//4. 출력 - 1번만 출력은 여기
					System.out.println("합계 :"+sum);
						
				
				
				
				
				
				
					// i++; <-- 이거는 모야?
					
					
					
					
					
					
					
				
					
					
					
					
				
	}//main

}//class








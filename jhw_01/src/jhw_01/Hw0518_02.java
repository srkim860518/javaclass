package jhw_01;

import java.util.Scanner;

public class Hw0518_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 2개를 입력받아 [예) num1 = 1, num2 = 10 ] num1 부터 num2 까지의 합을 구하세요
		// 1-10까지의 합

		//변수 선언		
//		int sum = 0;
//		//			
//		//입력
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		// num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//		//num2 = scan.nextInt();
//		
//		//합계
//		for(int i=num1;i<=num2;i++) { 
//			sum = sum+i;			
//		}
//		// 출력
//		System.out.println("합계: "+sum);

//===================================================================		

			
				// 문제) 10개의 숫자를 입력받아 합계를 출력하시오.
				// 1. 변수선언 2. Scan입력 3. 합계 4. 출력
		
		// 1. 변수선언
		
		int sum = 0;
		int input = 0;

		// 2. Scan입력
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			input = scan.nextInt();
			System.out.println(input*1);
			
		}
		
		// 3. 합계
		for (int i = 0; i <10; i++) {// i는 1부터 10,i 증감
			
			System.out.println();
		}

		// 4. 출력
//		System.out.println("합계: " + sum);
////=============================================================================		
//	
//		1-100까지의 합
//		for(int i=1;i<=100;i++) {
//			sum = sum +i;
//		}
//       //1-1000까지의 합
//		for(int i=1;i<=1000;i++) {
//		  sum = sum +i;
//		}

	}// main

}// Class

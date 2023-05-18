package j0518_01;

import java.util.Scanner;

public class Class0518_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 팩토리얼 5!= 5 * 4 * 3 * 2 * 1;
		// 팩토리얼 10! = 10*9*887.....*1
		// for문으로 해보세요.
		// 숫자를 입력 받아 해당되는 팩토리얼을 구현하시오.
		
		int num=1;
//		for(int i=5;i>0;i--) {
//		num =num*i; // 5
//		System.out.println("num : "+num);
//		}		
//		System.out.println(num);
		
		// 10
		
		int n = 0;
		System.out.println("숫자를 입력해 주세요");
		n = scan.nextInt();
				
		for(int i=n;i>0;i--) {
			num= num*i;
			System.out.println("num : "+num );
		}
		System.out.println(num);

		//	for(i=0;i<5;i++) {		 
		//}

		//1-10까지의 합
		//1-100까지의 합
		//1-1000까지의 합
		// 문제) 10개의 숫자를 입력받아 합계를 출력하시오.
		// 1. 변수선언 2. Scan입력 3. 합계 4. 출력	
		int sum = 0;
		for(int i=1;i<=10;i++) { // (int i=1초기식 : int i<=10조건식 ;i++) 증감식
			sum = sum+i;			
		}
		System.out.println(sum);

	}// main

//===============================================================
}//class


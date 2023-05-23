package jhw_01;

import java.util.Scanner;

public class HW0519_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	

		// A. 두 수를 입력받아 사칙연산하는 프로그램을 만드세요
		// 예) 6 , 3 을 입력받으면
		// 출력 :
		// 6 + 3 = 9
		// 6 - 3 = 3
		// 6 * 3 = 18
		// 6 / 3 = 2.00
		
		//변수 생성

		//2. 입력(입력한 숫자 2개)


		System.out.println("1번째 숫자를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("2번째 숫자를 입력해주세요");
		int b = scan.nextInt();
		
		System.out.printf("%d + %d = %d \n",a,b,a+b);		
		System.out.printf("%d - %d = %d \n",a,b,a-b);
		System.out.printf("%d * %d = %d \n",a,b,a*b);
		System.out.printf("%d / %d = %.2f ",a,b,(double)a/b); // 3.333

	}
}
	
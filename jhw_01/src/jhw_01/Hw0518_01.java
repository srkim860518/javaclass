package jhw_01;

import java.util.Scanner;

public class Hw0518_01 {

	public static void main(String[] args) {
		// 숫자 2개를 입력받아 [예) num1 = 1, num2 = 10 ] num1 부터 num2 까지의 합을 구하세요

//1. 변수 선언
		int sum = 0;
		int num1 = 1;
		int num2 = 10;

//2. 숫자 2개 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요");
		num2 = scan.nextInt();

//3. for문을 사용해서 합계를 구하기
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}

//4. 결과 값 출력하기
		System.out.println("합계: " + sum);

	}// main

}// Class

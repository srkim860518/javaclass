package j0509_01;

import java.util.Scanner;

public class C0509_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		byte a = 10;
//		byte b = 20;
//		//byte c = a+b; 에러남 byte c = (int)a+b
//		int c = a+b;
		int a = 1000000;
		int b = 2000000;
		long c = a * (long) (b);// 둘중에 하나만 long으로 구분해줘야 long으로 변경 됨 , 큰 쪽을 기준으로 연산
		System.out.println(c);

		// 대문자 입력시 소문자로 출력하시오.
		// 1. 변순선언 2. 입력 3. 출력

		char ch = ' ';
		System.out.println("대문자를 입력하세요");
		ch = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
		char ch2 = (char)(ch+32); //대문자로 치환 ,대소문와 소문자의 차이는 32 대문자 A:97, 소문자 65
		System.out.println("입력한 대문자: "+ch);
		System.out.println("변환된 소문자: "+ch2);
		
		// 소문자를 입력받아 대문자로 출력하시오
		System.out.println("소문자를 입력하시오");
		char ch3 = ' ';
		ch2 = scan.next().charAt(0);// 문자열에 첫번째 문자를 가져옴.
		char ch4 = (char)(ch-32);
		System.out.println("입력한 소문자: "+ch3);
		System.out.println("변환된 대문자: "+ch4);
		
//		char ch ='A';
//		int num = ch+1;
//		System.out.println(num);
//		// 2항 연산자
//		int num = 10;
//		double num2 = 10;
//		double num3 = num+num2; // num: 1항 + num2 2항 두개를 연산해서 2항 연산자라고함
//		System.out.println(num3);

		// 숫자를 입력 받아 짝수인지 홀수인지 출력하시오.
		// 짝수입니다. 홀수 입니다.
		// 변수선언 2. 입력 3.출력
//		int n = 0;
//		System.out.println("숫자를 입력하세요");
//		n = scan.nextInt();
//		String input01 = (n%2==0)?"짝수입니다":"홀수입니다.";
//		System.out.println(input01);
//		System.out.println("입력한 숫자: "+n);
	} // class
} // main

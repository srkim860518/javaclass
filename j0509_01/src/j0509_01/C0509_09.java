package j0509_01;

import java.util.Scanner;

public class C0509_09 {

	public static void main(String[] args) {

		// 1개의 글자를 입력받아 숫자로 변환하시오.
		// "15784" 1문자를 숫자로 변환
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		char input = scan.next().charAt(0); //charAt() 문자열에서 1개의 문자를 가져옴.
//		int result = input - '0';  //char타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환됨.
//		String content = (result%2==0)?"짝수입니다.":"홀수입니다.";
//		System.out.println("추출한 숫자 : "+result);
//		System.out.println(content);
//		
		char ch = ' ';
		System.out.println("문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);// charAt() 문자열에서 1개의 문자를 가져옴
//		int ch1 = input - '0'; // 문자를 숫자 값으면 변환 할때는 -'0'
//		int result1 = input - 0; // 1 아스키코드로 출력 48
//		System.out.println(result1);

//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		char input = scan.next().charAt(2); 
//		// scan.next()문자열에서 .charAt(2) 문자 인덱스 2번을 가져와라

		// 짝수 홀수
		int result = input - '0'; // char타입의 숫자는 '0'문자ㄹ 0을 빼야 숫자값으로 변환됨
		// int result1 = input - 0; //1 아스키코드로 출력 48
//				System.out.println(result1);
//		char input = scan.next().charAt(0);
		int result3 = input = '0';
		String content = (result3 % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("추출한 숫자 : " + result3);
		System.out.println(content);

	} // class
} // main

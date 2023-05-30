package j0509_01;

import java.util.Scanner;

public class C0509_01 {

	public static void main(String[] args) {


		// 1개의 글자를 입력받아 숫자로 변환하시오.
		// "15784" 1문자를 숫자로 변환
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char input = scan.next().charAt(0); //문자열에서 0번째  1개의 문자를 가져옴.
		int result = input-'0'; //char타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환됨.
		String content = (result%2==0)? "짝수입니다":"홀수입니다.";
		System.out.println("추출한 숫자 : "+result);
		System.out.println(content);
		
	} // class
} // main

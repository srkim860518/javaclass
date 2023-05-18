package j0518_01;

import java.util.Scanner;

public class Class0518_04 {

	public static void main(String[] args) {
		// 문자를 입력 받아 해당 소문자로 변환하시오.
		Scanner scan = new Scanner(System.in);

		
		//System.out.println("문자를 입력하세요");
//
//		char ch = scan.next().charAt(0); // 문자의 0번째
//				
//			System.out.println(ch);
//			
		// A-65, z-96, a-97,98
//		System.out.println("소문자를 입력하면 대문자로 변환됩니다.");
//		char ch = scan.next().charAt(0); // 문자의 0번째
//		ch = (char)(ch-32);
//		System.out.println(ch);
//					
		//대문자를 소문자로 
//		System.out.println("대문자를 입력하면 소문자로 변환됩니다.");
//		char ch = scan.next().charAt(0); // 문자의 0번째
//		ch = (char)(ch+32);
//		System.out.println(ch);
//		
		// if 를 사용하여 대문자를 소문자로, 소문자를 대문자로 변경
		System.out.println("[대소문자 변경 프로그램]");
		System.out.println("대소문자를 입력하면 변환됩니다.");
		 char ch = scan.next().charAt(0); // 문자의 0번째
		if(ch>='A' && ch<='Z') { 
			ch = (char)(ch+32);
			System.out.println("변환: "+ ch);
		}else {
			ch = (char)(ch-32);
			System.out.println("변환: "+ ch);
		}
			
			
	}// main

}// class

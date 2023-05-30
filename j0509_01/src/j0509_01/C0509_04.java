package j0509_01;

import java.util.Scanner;

public class C0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오.
		// 문자열, 정수형, 문자열
		// 아이디 패스워드 이름
		// abcd 1111 홍길동
		
		//1. 변수 선언
		String id = "";
		String pw = "";
		String name = "";
		//2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("id를 입력 해주세요");// next()-문자만 입력받음, nextLine()- 엔터키까지 입력으로 인식하고 받음  // 엔터키도 문자로 입력 받음
		id = scan.nextLine();
		System.out.println("pw를 입력 해주세요");
		pw = scan.next();
		System.out.println("name를 입력 해주세요");
		name = scan.next();
		//scan.nextLine(); //nextInt() enter키를 입력으로 사용
		
		//출력
		System.out.println("======================");
		System.out.println("id\tpw\tname");
		System.out.println("----------------------");
		System.out.printf("%s\t%s\t%s\t",id,pw,name);
	} // class
} // main

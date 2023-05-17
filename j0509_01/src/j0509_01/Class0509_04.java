package j0509_01;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오.
		// 문자열, 정수형, 문자열
		// 아이디  패스워드 이름
		// abcd   1111  홍길동
		
		// 1.변수선언
	    String ID = "";
	    String PW = "";
	    String Name = "";
	    // 2. Scanner- 입력 클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("ID를 입력하세요.");
		ID = scan.nextLine(); // next()-문자만 입력받음, nextLine()- 엔터키까지 입력으로 인식하고 받음  // 엔터키도 문자로 입력 받음
		// 홍길동 enter 키

		System.out.println("PW를 입력하세요.");
//		PW = scan.next());
		
		PW = scan.nextLine(); //nextInt() enter키를 입력으로 사용
		
		System.out.println("이름을 입력하세요.");
		Name = scan.nextLine();
		//System.out.println("id+name".);
		
		// 3. 출력
		System.out.println("-----------------------------");
		System.out.println("ID\tPW\tName");
		System.out.println("-----------------------------");
		System.out.printf("%s\t%s\t%s \n",ID,PW,Name);
	}
}

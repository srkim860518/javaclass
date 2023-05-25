package j0525;

import java.util.Scanner;

public class C0525_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//
	
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num1 = scan.nextInt();
			System.out.println("숫자를 입력하세요");
			int num2 = scan.nextInt();
			try {// 외부와 교류가 있을때만 try, catch문을 적용,//오타에 적용하면 프로그램이 늦어지니 외부와 연결할때만 사용
				System.out.println("나누기 : "+(num1/num2));
				
			} catch (Exception e) {// 최상위 클래스 
				System.out.println("프로그램에 오류가 있어 다시 실행됩니다."); // 숫자 두개를 입력해야만 에러가 뜸
				e.printStackTrace();// 에러 구문, 에러 위치 설명해줌
			}//catch
			
		} //  while
		
	} // main

}// class

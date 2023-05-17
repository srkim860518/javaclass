package j0517_01;

import java.util.Scanner;

public class Class0517_03 {

	public static void main(String[] args) {
		// Scannnr도 객체 scan 소문자로 만드세요 
		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력 받아 합계를 구하시오.
		// add 메소드를 사용하시오.
		
		// 객체선언
		// 클래스명 참조변수명 = new 클래스명();
		Class0517_03 c = new Class0517_03();
		
	
	
	int[] num = new int[3];
	//3개 숫자 입력
	for(int i=0;i<3;i++) {
		System.out.println((i+1)+"번째 숫자를 입력하세요.");
		num[i]=scan.nextInt();
	}
	//메소드호출
		int bc = c.ab(num[0],num[1],num[2]);
		System.out.println("더하기 결과값 : "+bc);
		
		
	}// main
//===============================================================	

	int ab(int a, int b, int c) {
		int bc = a + b + c;
		return bc;	
				
		}
			
			
	

}// class

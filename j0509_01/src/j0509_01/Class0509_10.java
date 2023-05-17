package j0509_01;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		//double num = 564.124586 소수점 3자리까지 절삭 2자리까지 존재
		double num = 564.124586;
		double result = (int)(num*100)/100.0; //  곱하는 값 = 나눈는 값 동일하게(int)(pi*100)/100.0
		System.out.println(result);
		
		// 실수 소수점자리 7자리까지 입력받아, 소수점 4자리까지만 출력하시오.
		// 1. 변수선언 2. 입력 3. 출력
//		double num1 = 564.124586;
//		double result2 = (int)(num*10000)/10000d;  <-- 요 수식은 외우기
//		System.out.println(result2); //564.1245
//		
		double nu = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요.");
		nu = scan.nextDouble();
		double result3 = (int)(num*10000)/10000.0;		 
		System.out.println(result3);
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0; // (int)(pi*1000)/1000.0d d가 생략되어있음, 10000d 지정해주면됨
//				System.out.println(result);
	}
	}

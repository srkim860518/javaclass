package j0509_01;

import java.util.Scanner;

public class Class0509_12 {

	public static void main(String[] args) {

		
		// 예시) double pi = 3.7894; 소수점 2자리에서 반올림해서 출력하시오.
		// 3.7894;
		// double result = Math.round(pi*10)/10.0;
		//System.out.println(result);
		//-------------------------------------------------------
		
		//문) 소수점 5자리를 입력 받아 3자리에서 반올림해서 출력하시오.
//		double input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextDouble();
//		// 반올림 round(), 올림 ceil(), 버림 floor()
//		double result2 = Math.round(pi*100)/100.0; 
//		System.out.println(result2);
	   	//-------------------------------------------------------
		//문) 실수를 입력 받아 소수점 4자리에서 올림해서 출력하시오.
		double input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력하세요.");
		input = scan.nextDouble();
		// 반올림 round(), 올림 ceil(), 버림 floor()
		double result2 = Math.ceil(1000)/1000.0; 
		System.out.println(result2);		
	}
}
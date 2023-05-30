package j0509_01;

import java.util.Scanner;

public class C0509_11 {

	public static void main(String[] args) {
		
		// 실수를 입력받아 소수점 4자리에서 올림해서 출력하시오.
		Scanner scan = new Scanner(System.in);
//		double input = 0;
//		System.out.println("실수를 입력해주세요");
//		input = scan.nextDouble();
//		double result = (int)(input*10000)/10000.0; //int가 왜 드렁가야하는지?
//		System.out.println(result);
//		//반올림 round(),올림 ceil(), 버림 floor();
//		double result2 = Math.ceil(input*1000)/1000.0;
//		System.out.println("올림: "+result2);
			

		// 소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오.
		double num = 0;
		System.out.println("소수점 5자리를 입력해주세요");
		num = scan.nextDouble();
		double result3 = Math.round(num);

	} //class
} // main

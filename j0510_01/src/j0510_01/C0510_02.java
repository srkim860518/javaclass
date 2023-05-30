package j0510_01;

import java.util.Scanner;

public class C0510_02 {
	public static void main(String[] args) {
		// ch3. 연산자/ 14. 대입 연산자 p.
		// 점수를 입력받아 60점이상이면 합격, 60점미만이면 불합격을 출력하시오.

		// 입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력
		// 1.변수선언 2.scan 한후 변수입력받음 3.비교 4.출력
		// 1.변수선언
		int num = 0;
		// 2. Scan 선언 및 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();

		// 3. 비교
		// if 문 중괄호 없어도 되지만 실습은 중괄호 넣어주세요
		if ((num % 2) == 0) { // 2의 배수 : 변수의 몫(%) 값
			System.out.println("2의 배수 입니다.");
		} else {
			System.out.println("2의 배수가 아닙니다.");
		}

//    	  //if문만
//    	  int num1 = 0;
//    	  if(num1==0) {
//    		  System.out.println("0입니다.");
//    	  }

		// if, else if, else
//    	  int num = 0;
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
//---------------------------------------------------------  
//    	int num = 8;
    	// (num>=1)?"":"" //삼항식      // 뜻 num이 1보다 크냐? 
    	if(num==8) {
    		System.out.println("8입니다..");
    	}else {
    		 System.out.println("8이 아닙니다.");
    	}

	} // main
}// class
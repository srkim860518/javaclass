package j0509_01;

import java.util.Scanner;

public class Class0509_06 {
	public static void main(String[] args) {
	// 연산자 p.84
	
	//int result = 3+(4*5); //23 연산을 할때는 반드시 우선순위에 괄호 넣기 필수
	int num = 5;
	num = num +1; // num=6
	System.out.println(num);
	
	//증감 연산자 ++
	int result = ++num; // num을 1을 더해서 그 결과값을 result대입
	int result1 = num++; // result 에 먼저 대입을 한 후 num을 1을 더함.
	System.out.println(result); // result2 값=4
	
	//String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다.";
	//System.out.println(answer);
	
	// 1. 개의 정수형을 입력 받아 10보다 큰 수 인지 출력하시오
	// 1. 변수선언 2. 입력 3. 확인출력
    int input = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("숫자를 입력하세요.");
    input = scan.nextInt();
    
    String answer2 = (input>10)?"10보다 큽니다.":"10 보다 작습니다.":"(input==10)?"10 입니다..":"10보다 작습니다.";
     // 에러날 확률이 많이 자주 사용하지 않음

	System.out.println(answer2);
	
	 // 정수를 입력 받아 음수 양수로 양수면 음수로 변경하시오.
	 System.out.println("음수는 양수로, 양수는 음ㄹ수로 변경하빈다. 숫자를 입력하세요.");
	 input = scan.nextInt();
	 int result2 =(input>0)?-input:-input; //음수만: -input:input 으로 사용 
	 System.out.println("결과값 : "+result2; //
	 
	
	 
	}
}

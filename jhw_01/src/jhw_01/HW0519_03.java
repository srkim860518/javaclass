package jhw_01;

import java.util.Scanner;

public class HW0519_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//C. 사칙연산을 함수로 만들어서 출력하세요  메서드 총 1개 calculator() 만들어서 출력
		//(나눗셈결과도 int type)
		//(힌트: int[] result = new int[n] )
		//예) 6 , 3 을 입력받으면
		//출력 :
		//6 + 3 = 9
		//6 - 3 = 3
		//6 * 3 = 18
		//6 / 3 = 2.00
		
		// class 지정
		String title = {"더하기","빼기","곱하기","나누기"};
		int[] num = new int[4]; // 배열 4개
		for(int i=0;i<4;i++) {
			System.out.println(title[i]+"를 입력하세요.");
			num[i]= scan.nextInt();			
		}//for
		
		
		
		
		
		
		
		
		
		// calculator() 
		int num[0] = num[];
		

	}

}

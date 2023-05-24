package jhw_01;

import java.util.Scanner;

public class C519 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		//  문제 1.
	//  열 크기와 행 크기를 입력받아 . 배열에  a-z까지 채워 넣으세요
	//  4, 5 를 입력 받으면
	//  출력 :
//		a b c d e
//		f g h i j
//		k l m n o
//		p q r s t
	// 순서 :
	// --------------
	// char 배열이 어려우면, int배열로 만들어서 숫자로 채우기 (3.번에서char배열대신 int배열생성)
	// 예. 4, 5 입력 시 아래와 같이 출력
	// 1 2 3 4 5
	// 6 7 8 9 10
	// 11 12 13 14 15
	// 16 17 18 19 20

		
		// 1. 변수선언
		// 2. 숫자 두개 입력받기
		System.out.println("1번째 번호를 입력하세요");
		int num = scan.nextInt();
		System.out.println("2번째 번호를 입력하세요.");
		int num2 = scan.nextInt();
		
		// 3. int 배열 생성
		int[][] abc = new int[num][num2];
		
		// 4. 이중for문을 사용해서 넣기.
		for(int i=0;i<abc.length;i++) {
			System.out.println("");
			
		}
		
		
		// 5. 이중for문을 사용해서 출력
		
		
		
		
		
	}
}
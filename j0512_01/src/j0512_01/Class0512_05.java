package j0512_01;

import java.util.Scanner;

public class Class0512_05 {

		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		String[] binary = {"0000","0001","0010","0011","0100",
//						   "0101","0110","0111","1000","1001"};
//		binary[0] = "0000";
//		
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt();
//		//0
//		System.out.println(binary);
//		
//		// binary는 제로 인덱스 
//		//binary[0];
//		//binary[1],binary[2],binary[3],binary[4],binary[5]
//		//binary[6],binary[7],binary[8],binary[9]]
//
//		int[] num = new int[4];
//		// 1025 - 0001 0000 0010 0100 0101
//		//1
//		//0
//		//5
//		//0125
//		// 한번에 숫자를 받으려고 하면 0은 사라진다 int로 받아서 하나하나 자를 수가 없다.
//		//	-->해결 : String으로 한꺼번에 받으면 하나하나 자랄라 배열로 사용 할 수 있다. 
////---------------------------------------------------------------------		
//		//1개씩 받기 
//		// 1025 - 0001 0000 0010 0100 0101
//		for(int i=0;i<num.length;i++) {
//			System.out.println("번호를 입력하세요.");
//			num[i] = scan.nextInt();
//			
//		}
//		// 10진 코드 출력
//		System.out.print("10진코드: ");
//		for(int i=0;i<num.length;i++){
//		System.out.print(num[i]+" ");
//		
//		}
//		System.out.println();
//		
//	// 2진 코드로 번호출력
//		System.out.println("이진코드: ");
//		for(int i=0;i<num.length;i++) {
//			System.out.println(binary[num[i]]+" ");
//		}
//		System.out.println();
	//------------------------

	public static void main(String[] args) {
		// chapter 5. 배열 1.4 배열의 활용
//		// 10진수를 2진수로 변경하는 프로그램
//		Scanner scan = new Scanner(System.in);
//		int[] nu = new int[0];
//		// zero index 
//		String[] data = {"0000","0001","0010","0011","0100",
//				         "0101","0110","","1000","1001"};
//
//		for(int i=0;i<5;i++){
//		System.out.println("10진수를 입력하세요.");
//		int num = scan.nextInt();
//		System.out.println(data[num]);
//}//for
		
		//----------------------
		Scanner scan = new Scanner(System.in);
		int[] num = new int[0];
		// zero index 
		String[] data = {"0000","0001","0010","0011","0100",
				         "0101","0110","","1000","1001"};

		//1. 숫자 입력 5번
		for(int i=0;i<5;i++){
		System.out.println("10진수를 입력하세요.");
		num[i] = scan.nextInt();
		System.out.println(data[num[i]]);// 출력
		//int num = scan.nextInt();
		//System.out.println(data[num]);
}//for
		//2. 2진코드 입력 
		
		for(int i=0;i<5;i++) {
			System.out.println(data[num[i]]+" ");
		}
		System.out.println();
		
//----- 기본 개념만 이해하기 , 자주 사용하지 않음, 이해 못하면 사용 못하니 알아두세요-----------	
		
			
		

	} //main

}//Class

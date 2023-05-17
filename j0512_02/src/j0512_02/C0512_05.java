package j0512_02;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
                        // zero index
		String[] data = {"0000","0001","0010","0011","0100",
				         "0101","0110","0111","1000","1001"};
		
		int[] num = new int[0];
		
		//1. 숫자 입력 5번
		for(int i=0;i<5;i++) {
			System.out.println("10진수를 입력하세요.");
			num[i] = scan.nextInt();
			System.out.println(data[num[i]]);//출력
			
		} //for
		
		//2. 2진 코드 입력
		for(int i=0;i<5;i++) {
			System.out.print(data[num[i]]+" ");
		} //for
		System.out.println();
		

	}// main

} //class

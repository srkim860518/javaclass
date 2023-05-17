package j0512_02;

import java.util.Scanner;

public class C0512_10 {

	public static void main(String[] args) {
		//  정렬 array 
		Scanner scan = new Scanner(System.in);
		
//		Integer[] arr = {1,11,23,45,2,3,9,5};
		int[] arr = {1,11,23,45,2,3,9,5};
		// 오름 차순 Arrays.sort(arr); 디폴트 
		// 내림 차순 Array.sort(arr.co) 추후 배울 예정
		int num = 10;
		// 단순 for 문 - 단순 배열만 가능
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		// 
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}// main

} //class

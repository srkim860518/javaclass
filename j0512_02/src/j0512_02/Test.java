package j0512_02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer[] arr = {1,11,23,45,2,3,9,5};
		//Arrays.sort(arr);  //오름차순정렬
		//Arrays.sort(arr,Collections.reverseOrder()); //내림차순정렬
		int num=10;
		//단순for문
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		


	}

}

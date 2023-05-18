package j0517_01;

import java.util.Arrays;
import java.util.Scanner;

public class Class0517_09 {

	public static void main(String[] args) {
		// 3개의 변수를 입력 받아 작은 수 부터 순차적으로 출력하시오.
		// calculate() 메소드를 만들어서 사용하시오 
		// 10 5 25 -> 5 10 25
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("숫자를 입력하세요.");
		arr[i]= scan.nextInt();
		}
		// 배열 정렬
//		 Arrays.sort(arr);제일 간단함.
		calculate(arr);
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
//		
//		int[] num = new int[3];
//		
//		int a = 10;
//		int b = 5; 
//		int c = 1;
//		
//		calulate(num, a,b,c);
//		
//		System.out.println("최대값: ");		
//		System.out.println("최소값: ");		
//		System.out.println("오름차순 : "); //	
//				 
//	
//		}
//	
//
//	static void calulate(int[] num, int a, int b, int c) {
//	
//	
//		
//		num[0] = Math.min(Math.min(a,b), c);
//		num[1] = 
//		num[2] =  Math.max(Math.max(a,b), c);
//	
	// 최소값 
	// 최대값

	
	
	//  비교 
	
	
	
	} // main
	
	
	static void calculate(int[] arr) {
		int min = Math.min(Math.min(arr[0], arr[1]),arr[2]);
		int max = Math.max(Math.max(arr[0], arr[1]),arr[2]);
		int middle = (arr[0]+arr[1]+arr[2])-max-min;
		
		arr[0]=min;
		arr[1]=middle;
		arr[2]=max;
	
	}
}	//class


































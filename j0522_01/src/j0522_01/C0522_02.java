package j0522_01;

import java.util.Scanner;

public class C0522_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[4];
		int[] data = new int[8];
		//두수를 입력 받아, 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용
		for (int i=0;i<5;i++) {
			
		for(int j=(2*i)+0;j<(2*i)+2;j++) {//i=0일경우 0,1/2,3이나 -->j=(i*2)+0  (2*0)+0=0/(2*0)+1/ (2*1)+0=2/(2*1)+1=3ㅑ
			System.out.println((j+1)+"번째 숫자를 입력하세요.");//1,2까지는 잘됨 
			num[j] = scan.nextInt();
		}
			
			data[4*i] = num[(2*i)]+num[(2*i)+1]; //4*0/ 4*1/4*2/4*3/
			System.out.println(data[4*i]);
			
			data[4*i+1] = num[(2*i)]-num[(2*i)+1];
			System.out.println(data[4*i+1]);
			
			data[4*i+2] = num[(2*i)]*num[(2*i)+1];
			System.out.println(data[4*i+2]);
			
			data[4*i+3] = num[(2*i)]/num[(2*i)+1];
			System.out.println(data[4*i+3]);

		}
			
//-====================================================================		
//		//변수 선언
//		for(int i=0;i<4;i++) {
//		System.out.println((i+1)+"번째 숫자를 입력하세요.");
//		num[i] = scan.nextInt();
//		}
//		
//		//2번째-4번째만 진행할 경우
////		for(int i=2;i<4;i++) {
////			System.out.println((i+1)+"번째 숫자를 입력하세요.");
////			num[i] = scan.nextInt();
////			}
//	
//		
//		data[0] = num[0]+num[1];
//		System.out.println(data[0]);
//		data[1] = num[0]-num[1];
//		System.out.println(data[1]);
//		data[2] = num[0]*num[1];
//		System.out.println(data[2]);
//		data[3] = num[0]/num[1];
//		System.out.println(data[3]);
//		
////		System.out.println("3번째 숫자를 입력하세요.");
////		num[2] = scan.nextInt();
////		
////		System.out.println("4번째 숫자를 입력하세요.");
////		num[3] = scan.nextInt();
////		
//		
//		data[4] = num[2]+num[3];
//		System.out.println(data[4]);
//		data[5] = num[2]-num[3];
//		System.out.println(data[5]);
//		data[6] = num[2]*num[3];
//		System.out.println(data[6]);
//		data[7] = num[2]/num[3];
//		System.out.println(data[7]);
		
		
	}//main

}// class

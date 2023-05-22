package j0522_01;

import java.util.Scanner;

public class C0522_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//두수를 입력 받아, 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용
		
		//배열 선언
		Data[] d = new Data[2];
		
		for(int i=0;i<2;i++) {
		//객체선언, 유지 보수를 쉽게 하기 위해서 객체 선언하는 이유가 있음.
		d[i]= new Data();
		
		System.out.println("1번째 숫자를 입력하세요.");
		d[i].num1 = scan.nextInt();
		
		
	  // 참조변수명.변수명
	   	d[i].data1 = d[i].num1+d[i].num2;
		System.out.println(d[i].data1);
		d[i].data2 = d[i].num1-d[i].num2;
		System.out.println(d[i].data2);
		d[i].data3 = d[i].num1*d[i].num2;
		System.out.println(d[i].data3);
		d[i].data4 = d[i].num1/d[i].num2;
		System.out.println(d[i].data4);
		}
//		System.out.println("3번째 숫자를 입력하세요.");
//		d.num3 = scan.nextInt();
//		
//		System.out.println("4번째 숫자를 입력하세요.");
//		d.num4 = scan.nextInt();
//		
//		
//		int data5 = num3+num4;
//		System.out.println(data5);
//		int data6 = num3-num4;
//		System.out.println(data6);
//		int data7 = num3*num4;
//		System.out.println(data7);
//		int data8 = num3/num4;
//		System.out.println(data8);
//		
//		}
			
//-====================================================================		
//		//변수 선언 1번과 비교
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

package j0517_01;

import java.util.Scanner;

public class Class0517_05 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		//객체 선언
		Class0517_05 c = new Class0517_05();
		int[] num = new int[3];
		// 3개의 수를 입력받아, 평균 60점 이상이면 합격/ 불합격 출력하시오.
		// average() return String
//		while(true) {
//			
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"숫자를 입력하세요.");
//			num[i]= scan.nextInt();
//			
//		}// 3번만 입력 10,20,30
//		double result = c.average(num[0], num[1], num[2]); // for 안에 있으면 3배의 시간이 소요됨.
//		                                                   //for문 밖에 나와있어야 실행 시간 절약 가능
//		System.out.println("평균"+result);
//			
//			
//			
//			
//			
//			
//		}//while		
//		
//	}// main
////========================================================
//	// aveerage 메소드 
//	double average(int a,int b, int c) {
//		double result = (a+b+c)/3;
//		return result;
//	}
	
	
	while(true) {
		
	 String result="";  //변수는 한 종류만 !!!, 동일명 중복 변수 불가!!  다시 불러 사용 할 수 있음 ex)51번 
		
	for(int i=0;i<3;i++) {
		System.out.println((i+1)+"숫자를 입력하세요.");
		num[i]= scan.nextInt();
		
	}// 3번만 입력 10,20,30, 90,90,90
	result = c.average(num[0], num[1], num[2]); // for 안에 있으면 3배의 시간이 소요됨.
	                                                   //for문 밖에 나와있어야 실행 시간 절약 가능
	System.out.println("합격여부"+result);
	
	}//while		
	
}// main
//========================================================
// average 메소드 
String average(int a,int b,int c) {
	String result = "";
	if(((a+b+c)/3.0>=60)) {
		result = "합격";
	}else {
		result = "불합격";
	}
	return result;
}

	
	
	
	
	
}	//class



































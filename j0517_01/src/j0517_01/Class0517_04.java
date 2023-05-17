package j0517_01;

import java.util.Scanner;

public class Class0517_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력 받아 가장 큰 수를 출력하시오.
		// numMax 메소드를 만들어 사용하시오.
		
		// 객체 선언 
		Class0517_04 c = new Class0517_04();
		
		int num1 = 0, num2 = 0, num3 = 0;
	//	
		while(true) {
		System.out.println("1번째 숫자를 입력하세요.");
		int a1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.");
		int b2 = scan.nextInt();	
		System.out.println("3번째 숫자를 입력하세요.");
		int c3 = scan.nextInt();
//		System.out.println(" 큰수 : "+Math.max(Math.max(a1, b2), c3));
//		System.out.println(" 작은수: "+Math.min(Math.min(a1,b2), c3));
	
		
		// 다른 메소드 호출 방법
		// 참조변수명.메소드명 - 매개변수는 같아야함.
		int result1= c.max(1,a1,b2,c3);
		int result2= c.max(2,a1,b2,c3);
		
		System.out.println("3개의 수의 최대값 : "+result1);
		System.out.println("3개의 수의 최소값 : "+result2);
			
		
//		
//		int[] num = new int[3];
//		int a=10, b=5, c=25;
//		int d=10, e=5, f=25;
//		
//		
		int max = 0;		
//		int min = 0;
		
		//
//		// 삼항식
//		max = (a>b)?((a>c)?a:c):((b>c)?b:c);
//		min = (d<e)?((d<f)?d:f):((e<d)?e:d);
		
//		 Math.Max() // 삼항식 보다 Math.Max()가 간단함
//		max=Math.max(Math.max(a, b),c);
//		min=Math.min(Math.min(d, e),f);
				
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//		}
//		// 비교 3개 max 값 호출
//		int cd = c.ad(num[0], num[1], num[2]);
//		System.out.println(" 최대값 : "+max);
//		
		
		} //while
	}// main
		
//=================================================================
 //비교 
  // max 메소드
	int ad(int a, int b, int c) {
		int max;

		if (a > b) { // a가 b보다 크다
			if (a > c) { // a가 c보다 크다
				max = a; // 최대값
			} else { //
				max = b; // b
			} 
		
		} else { // a < b
			if (b > c) { // b가 c보다 크면
				max = b; // 최대값= b
			} else { // 아니면

				max = c; // 최대값은 c
			}
		}// if
	
		return max;
	}// int
		
		

			// min 메소드
	 int df(int d, int e, int f) {
		 int min;
		 
		 if(d<e) {
			 if(d< f) {
				 min=d;
			 }else {
				 min = e;
			 }
			 
		 }else {
			 if(e<f) {
				 min=e;
			 }else {
				 min=f;
			 }
		 }				
		 return min;
	}
//====================================================
	// 메소드 리턴타입과 return 변수는 타입이 같아야 함.
		int max(int check,int a,int b,int c) {
			int result = 0;
			if(check==1) {
				// 최대값 구하기
				result = Math.max(Math.max(a, b), c);
			}else {
				result = Math.min(Math.min(a, b), c);
			}
			return result;
		}
		
	 // 최대 최소값 더하기 메소드
	 //최대값
//	 int max(int a, int b, int c) {
//		 int result = 0;
//		 
// 		 //최대값 구하기
//		 result = Math.max(Math.max(a,b), c); 
//		 return result;
//	 }// int max
//	 
//
//	 // 최소값
// 
//	int min(int a, int b, int c) {
//		int result = 0;
//		result=Math.min(Math.min(a, b), c);
//		
//		return result = 0;
//	}
//	
	 
	// 리턴 없어도 되는 void 
	// void print();  리턴 안해도 됨., int는 반드시 return !!!
	 
	 
}//class






















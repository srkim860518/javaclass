package j0517_01;

import java.util.Scanner;

public class Class0517_02 {

	public static void main(String[] args) {
		Class0517_02 c = new Class0517_02();
		Scanner scan = new Scanner(System.in);
	int num1=10;
	int num2=5;
	
	//객체선언
	//클래스명 참조변수 명 = new 클래스명();
	// Card c1 = new Card();
	// 두 수를 입력 받아 더하기 결과값을 출력하시오.
	
	
//	System.out.println("첫번째 숫자를 입력하세요");
//	num1 = scan.nextInt();
//	System.out.println("두번째 숫자를 입력하세요");
//	num2 = scan.nextInt();
	
	int[] num = new int[2];
	for(int i=0;i<2;i++) {
		System.out.println((i+1)+"번째 숫자를 입력하세요");
		num[i]=scan.nextInt();
	}
	
	int result = c.add(num[0],num[1]);
		System.out.println("두수의 더하기 : "+result);

//	int result = c.add(num1,num2); // 지역변수: 메스드 내에 있는 변수
//	System.out.println("두수의 더하기 : "+result);
//	
	int sub =  c.sub(num[0],num[1]);
	System.out.println("두수를 빼기 : "+sub);
	
	int multi = c.multi(num[0],num[1]);
	System.out.println("두수를 곱하기: "+multi);
	
	double div = c.div(num[0],num[1]);
//	System.out.println("두수를 나누기: "+div);
	System.out.printf("두수를 나누기: %.2f",div);
	
	}//main
//================================================================
	//더하기 메소드
	int add(int a,int b) { //add가 main 내에 있으니 메소드 변수
//		int add(num1,num2)  //int a, num1 로 사용해도 됨
		
		int result = a+b; // 15 = 10+5
		return result;
	
	}// int add 
	// 서브메소드
	int sub(int a,int b) {
	int sub = a-b;
	return sub;
	}//
		
	// 멀티 메소드
	int multi(int a, int b) {
		int multi = a*b;
		return multi;
	}
	
	// div 메소드
	double div(int a, int b) {
		double div = a/(double) b; // 주의!! 형변환 둘 중 하나만 선언 필수!!!
		return div;
	}
		
		// 리턴 값이(반환값) 없을때는 void 적어주세요!!!!!!, 반환값은 int, double 등 동일하게!!!!!
		
		
	

}//class


























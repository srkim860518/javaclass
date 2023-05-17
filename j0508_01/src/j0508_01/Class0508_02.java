package j0508_01;

public class Class0508_02 {

	public static void main(String[] args){
		boolean power = true;
	
		char ch = 'A';
		// 연습 int num = 1;
		// 연습 숫자 + 문자 = 가능
		// 연습 int num2 = 1+ch; // 숫자 + 문자 실행 가능 
		char ch2 = 65; // 10진수 65 = 문자 A, 소문자 
		char ch3 = '\u0041';
	    //char tab ='\t'; // tab의 의미를 갖음  콘솔 실행 안됨
	    byte b = 127;
	    short s = 32767;
	    int i = 100;
	    int oct = 0100; // 8진수
	    int hex = 0x100; // 16진수
	    
	    // long l = 10000000000L;  에러
	    float f = 3.14f;
	    double d = 3.14;
	    float f2 = 100f; // 정수만 입력해도 소수점 자동 입력해줌
	    // 10. // 상식 : double ,  f가 없으니 더블로
	    // 3.14e3f  3.14*10*10*10(10의 3승)	    


	    System.out.println(ch2);   // ctrl + f11키 = 콘솔 실행
	    System.out.println(ch3);
	    //System.out.println(tab);   //tab의 의미를 갖음  콘솔 실행 안됨
	    
	    //연습 System.out.println(ch+num); // ctrl + f11키 = 콘솔 실행
	    //연습 System.out.println(num2); // ctrl + f11키 = 콘솔 실행
  } // main
	
}//class

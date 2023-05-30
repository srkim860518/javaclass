package j0508_01; //복습 0528

public class C0508_2 {

	public static void main(String[] args) {

		boolean power = true;

		char ch = 'a';
		// 연습
		int num = 1;
		// 숫자 + 문자 = 가능
		int num2 = 1 + ch; // 숫자 +문자 실행 가능
		char ch2 = 65;
		char ch3 = '\u0041';
		char tab = '\t'; // tab의 의미를 갖음 , 콘솔 실행 안됨.
		
		byte b = 127;
		short s = 32767;
		int i = 100;
		int oct = 0100; // 8진수
		int hex = 0x100; // 16진수

		long l = 10000000000000L; // 에러?
		float f = 3.14f;
		double d = 3.14;
		float f2 = 100f; //정수만 입력해도 소수점 자동 입려됨 100.0
		// 10. // 상식 : double ,  f가 없으니 더블로
	    // 3.14e3f  3.14*10*10*10(10의 3승)	 
		
		System.out.println(ch2);
		System.out.println(ch3);
		//System.out.println(tap);// 에러 tab의 의미를 갖음 , 콘솔 실행 안됨.
		
		System.out.println(ch+num); //98 = ch='a'(a=98)+num=1 문자+숫자  
		System.out.println(num2); //98 = 1+ ch //ch='a'(a=98)+num=1 문자+숫자
		
		char cha= 'A';
		System.out.println(cha+num);// 66 =  ch='A'(65)+1
		
	} // main

}// class

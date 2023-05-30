package j0508_01;

public class Class0508_01 {
//	pjt 1개에는 메인 메소드는 1개만 존재 (실습은 각 클래스마다 메인 메소드를 여러개 만들 예정)
	public static void main(String[] args) {
		
		boolean temp = true;
		boolean temp2 = false;
		boolean temp3;
		temp3 = true;
		
		char ch1 = ' '; //'' 공백없이는 사용할 수 없음. 문자형 타입, 공백은 문자로 인식 
		char ch2 = 'a'; // ''만 사용 가능
		char ch3 = 'A';
		char ch4 = 't';
		//char ch5 = " "; //<---에러 char ch5 = ""; "" 사용 불가
		
		
		byte num = 1;
		//byte num3 = 256; //127까지 숫자표현 가능
		short num2 = 10;
		//short num4 = 32768; //32767까지 숫자 표현 가능
		//short num4 = 32768; //32767까지 숫자표현 가능
		
		int num5 = 21;
		//int num6 = 2147483648; //2147483647까지 숫자 표현 가능
		long num7 = 21;
		long num8 = 2147483648L; // //접미사 L,l을 붙여야 함.대소문자 L,ㅣ 사용 가능하나 소문자보다 대문자가 구분이 쉬움, L을 붙여주는게 좋음
		
		float num09 = 3.14f; //실수형 소수점 실수+f/F = 접미사, F,f를 붙여야함  대소문자 상관없음
		float num9 = 3.87654321f; //실수형 8자리까지 정밀도 표현 가능, 
		float num10= 987.654321000000f;//// 접미사 F,f를 붙여야 함.8자리 이상 쓸 수 있으나 정확하지 않은 숫자가 됨
        			
		double num11= 1.123456789012345f; // 실수형 16자리까지 정밀도 표현 가능 
	
	    // 문자열 = class 일때 대문자 표현, 소문자를 쓰면 에러남
		
		String str1 = new String("abc"); // 기본형은 무조건 new String("") 적용
		
		String str2 ="aaa"; // 기본형 타입으로 선언(예외), 대부분의 개발자들은 변수 이름을 소문자로 선언함
	
		char str3 = ' '; // 작은 따옴표안에 공백을 넣어야함!!!! 공백 없으면 에러 발생
		String str4 = ""; // 빈공백을 안 넣어줘도 에러 안남
		
		// 변수
		int score  = 100;
		score = score + 200; // score 300 이라는 값이 들어감.
		
		// 상수
		final int SCORE2 = 100; // 상수는  final int 대문자 변수 = 100; 
		//sco = 200; // 상수는 값을 변경할 수 없음.
	
	} 
}
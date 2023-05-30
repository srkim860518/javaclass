package j0508_01;

public class C0508_6 {

	public static void main(String[] args){
		//형변환
	//기본형 8가지
		// 논리형 1바이트 = boolean
		//문자형 2바이트 = char
		//정수형 1바이트 = byte, 2바이트 - short, 4바이트 - int, 8바이트-long
		//실수형 4바이트 = float, 8바이트 double
		//문자열 - String
		
		float f = 1.6f; // 소수점이 있음.
		int i = (int)f; // 강제 형변환 (int)f->int , 큰-> 작은것으로 넣으려면 type을 꼭 적어줘야함.
		System.out.println(i); // 1
		
		int num = 10;
		int num1 = 11;
		double d = num; // 10.0
		float e = num1;// 11.0 소수점 자동 입력
		System.out.println(d);
		System.out.println(e); // 11.0
		
		// String(객체) > double > float > long > int > char, byte, short( 3개는 자주 안씀으로 3개 한 번에 같이 적음)
	    // 큰-> 작  무조건 type 작성/ 작-> 큰 type 미 작성 
		char ch = 'A';
		int n = ch; //65
		System.out.println(n); // 65
		
		int n2 = 97;
		char ch2 = (char)n2;
		System.out.println(ch2);
		
		//대문자에서 소문자 변경 대-소 32차이
  } // main
	
}//class

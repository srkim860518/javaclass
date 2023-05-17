package j0509_01;

public class Class0509_01 {

	public static void main(String[] args) {

		// 형변환(자동 형변환 작->큰 / 에러 : 큰-> 작, //강제 형변환을 할 때가 있음, 신중히 해야함
		// 변수 = 8가지
		// 논리형 1바이트 = boolean
		// 문자형 2바이트 = char
		// 정수형 1바이트 = byte, 2바이트 = short , 4바이트= int, 8바이트 = long,
		// 실수형 4바이트 = float, 8바이트 = double
		// 문자열[객체] = String(DB 상관없이 모든 문자 가능)
		
		char ch = 'a'; // 무조건 한글자만 , 두글자 이상은 안됨, 알아두기 : A=65, a=97, 0 = 48
		int num = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;		
		int num9 = 9;
		int num10 = 10;			
		
		 // print 줄 바꿈있음, print + ln = 줄 단락
		 // 한 줄 삭제 ctrl + D
		
		System.out.printf("더하기 결과값 : %d \n",num+num2);
//	System.out.printf("나누기 결과값 : %f  \n,num/(double)num2");// ex)%d를 넣으면 정수와 double 과 충돌이 되어 에러가 남
        System.out.println("더하기 결과값: "+(num+num2)+"\n"+ ""); //괄호를 넣어주지 않으면  String으로 인식 
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/num2); // int +int = int로 계산 됨 type:int , 소수점 제외 자동 계산
//		System.out.println(num/(float)num2);// int에 둘 중 하나만이라도 float or double 써줘야함
		System.out.println((double)num/num2);
		System.out.println(10/0.3);  // type이 double/ float 이면(10/0.3)f;를 붙여줘야함
		System.out.println(7+5);
		System.out.println(7-5);
		System.out.println(7*5);
		System.out.println(7/5);		

	} //class
} // main

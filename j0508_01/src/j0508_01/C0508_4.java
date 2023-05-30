package j0508_01;

public class C0508_4 {

	public static void main(String[] args){
		long num = 2;
		long num2 = 0L;
		char ch = 'A';
//		char ch2 = 'AB'; // 에러 char는 ' '안에 문자 1개만 가능
		char ch3 = ' ';
		String strl="";
		
		System.out.println(num2);//0, 
		
		String str2 = "a"+"b";
		System.out.println(str2); //ab
		
		int num3 = 7;
		int num4 = 7; // int는 숫자 타입
		String num5 = "7"; // String은 문자 타입: 7
		System.out.println(num3+num4);// 14
		System.out.println(num3+num4+num5);// 147 int 7+7=14 +string
		System.out.println(num3+num4+num3);// 21 int+int+int
		
		                 //String + int + int = String 
		System.out.println("결과값: "+num3+num4);// 77		
  } // main
	
}//class

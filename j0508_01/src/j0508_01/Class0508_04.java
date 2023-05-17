package j0508_01;

public class Class0508_04 {

	public static void main(String[] args){
		long num = 2;
		long num2 = 0L; 
		char ch = 'A';
		//char ch2 = 'AB';
		char ch3 = ' ';
		String str1 = "";
		
		String str2 = "a"+"b"; // 문자+문자 = ab
		System.out.println(str2);
		
		int num3 = 7;
		int num4 = 7;
		String num5 = "7"; // 7 + "7" type은 문자열 string/ str(문자)과 string(문자열)은 다름
				
		System.out.println(num3+num4); //14 int 숫자 + int 숫자 = int숫자 숫자끼리 더함
		System.out.println(num3+num4+num5); //14+"7" = 문자열 147int+int+String=String
		System.out.println(num5+num4+num); //"7"+7+7 =  777 String+int+int=String 첫번째 type이 기준, 문자열 +숫자+숫자 = type String 
	
		                  //String + int+ int = String
		System.out.println("결과값 : "+num5+num4
				); //결과값:77
	
	}//main
}//class

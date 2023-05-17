package j0509_01;

public class Class0509_08 {
	public static void main(String[] args) {
		
//		
//		byte a = 10;
//		byte b = 20;
//		// //byte c = a+b; 에러남 byte c = (int)a+b
//		int c = a+b;
		
		int a = 1000000; 
		int b = 2000000;
		long c = a * (long)(b);// 둘중에 하나만 long으로 구분해줘야 long으로 변경 됨 , 큰 쪽을 기준으로 연산
		System.out.println(c);
		
	}
}

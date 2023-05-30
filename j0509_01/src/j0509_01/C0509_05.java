package j0509_01; //교재 85-87 확인

public class C0509_05 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
//		int result =(num2*num3)+num1; //23
//		System.out.println(result);//23
		
		//증감 연산자 ++ 
		++num3; //증감 +1 먼저 더해라
		System.out.println(num3);// num3 + ++num3 5+1=6
		
		num2++; // 증감 후에 더해라
		num2= num2 +2;
		
		int result2 = num2;//4+2+증감1
		System.out.println(result2); //4+2+증감1
		System.out.println("num2: "+num2); //7 
		
	} //class
} // main

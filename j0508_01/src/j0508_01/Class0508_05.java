package j0508_01;  

public class Class0508_05 { // 정수의 오버 플로우
    
	public static void main(String[] args){
		// 오버플로우
		//214783647
		int num = 2147483647;
		System.out.println(num+1); 
		System.out.println(num+2); //연산이 거꾸로 돌아간다???= 오버플로우 마이너스
		
		int num1 = 1000000;
		int num2 = 2000000;
		System.out.println(num1*num); //2,000,000,000,000
		
		int num3 = -2147483648;
		System.out.println(num3-1); //
	} //main
} // class

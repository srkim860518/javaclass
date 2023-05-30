package j0508_01;

public class C0508_5 {

	public static void main(String[] args){
		//정수의 오버 플로우
		//2147483647
	 int num = 2147483647;
	 System.out.println(num+1);// -2147483648
	 System.out.println(num+2);//-2147483647
	 
	 int num1=1000000;
	 int num2=2000000;
	 System.out.println(num1*num2);//2,000,000,000,000
	 
	 int num3= -2147483648;
	 System.out.println(num3-1);
  } // main
	
}//class

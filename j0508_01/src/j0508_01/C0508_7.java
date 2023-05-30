package j0508_01;

public class C0508_7 {

	public static void main(String[] args){
		// printf, println, print
	    System.out.println(); //sysout+ctrl+스페이스바
		System.out.println(10/4.0); // 출력후 enter 키 포함
		//\ 단락 \t tab 키
		System.out.printf("%.2f \n",10/7.0); //2.4 실수형 출력, %2.f소수점 둘째자리까지
		System.out.printf("%09d \n",1000); // 정수형, 9째자리, 빈공간은 0으로 채움,00000+1000=000001000
		System.out.printf("[%09d]\n",1100); // 대괄호
		System.out.printf("%x\n",16); //16진수
		System.out.printf("%o\n",9); //8진수
		
		System.out.printf("당신의 나이 : %d 세, 생년: %d 년 \n",38,1986);// 나이 생년 월일 숫자 
		System.out.println("당신의 나이 : "+25+"세, 생년: "+1986+"년");
  } // main
	
}//class

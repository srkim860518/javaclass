package j0508_01;

public class Class0508_07 {

	public static void main(String[] args){
		// printf, println, print 
		// System.out.println( ); // sysout + ctrl + 스페이스 바 ;System.out.println( ); 자동입력
		System.out.println(10/4.0); // 3.333333333333큰 쪽으로 자동 형 변환
		// \n 단락 \t tab키
		System.out.printf("%.2f \n",10/7.0); //  \n 출력후 자동 enter 키 , 소수점 둘째자리까지 "%.2f",
		System.out.printf("%09d \n",1000); // 정수형 , 9째 자리, 빈 공간은 0으로 채움00000+1000 =  000001000 
		System.out.printf("[%09d]\n",1100); // 대괄호
		System.out.printf("%x\n",16); // 16진수
		System.out.printf("%o\n",9);     // 8진수
		
		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년 \n",25,1986); // 나이, 생년월일 숫자 
		System.out.println("당신의 나이 : "+25+" 세, 생년 : "+1986+" 년");
		
 }//main
}//class
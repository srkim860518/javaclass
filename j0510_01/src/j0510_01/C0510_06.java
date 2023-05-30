package j0510_01;
import java.util.Scanner;
public class C0510_06 {
      public static void main(String[] args) {
    	// 1.변수선언 num1,num2,op 2.scan입력 3번 입력
  		// 3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4 
    	 
    	// 변수 선언  
    	  int num1 = 0;
    	  int num2 = 0;
    	  int result = 0;
    	  char op = ' ';
    	 // scan입력 3번
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("첫번째 숫자를 입력해주세요");
    	  num1 = scan.nextInt();
    	  System.out.println("두번째 숫자를 입력해주세요");
    	  num2 = scan.nextInt();
    	  System.out.println("문자를 입력해주세요");
    	  op = scan.next().charAt(0);

    	  //3 비교(switch)
    	 switch(op) {
    	 case '+':
    	 	result = num1+num2;
    	 	System.out.println("결과값: "+(num1+num2));
    	 	break;
    	 case '-':
    		 result = num1-num2;
    		 System.out.println("결과값: "+(num1-num2));
    		 break;
    	 case '*':
    		 result = num1*num2;
    		 System.out.println("결과값: "+(num1*num2));
    		 break;
    	 case '/':
    		 result = num1/num2;
    		 System.out.println("결과값: "+(num1/num2));
    		 break;
    	  
    	 }//switch
    	  
  	}//main
  }// class
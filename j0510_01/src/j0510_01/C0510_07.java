package j0510_01;
import java.util.*;
public class C0510_07 {
      public static void main(String[] args) {
    	//숫자를 입력받아 같은 값일경우 당첨 그렇지 않으면 꽝 출력하시오.
    	 
    	//1.변수선언
    	  int input = 0;
    	  int random = (int)(Math.random()*3)+1;//1,2,3
    	  
    	  //2입력
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("숫자를 입력하세요");
    	  input= scan.nextInt();
    	  
    	  if(input==random) {
    		  System.out.println("당첨입니다.");
    	  }else {
    		  System.out.println("------------.");
    	  }
    	  System.out.println(random);
    	  System.out.println(random);
    	  
    	  
    	//3.
  		System.out.println("숫자를 입력하세요.");
  		input = scan.nextInt();
  		
  		if(input==random) {
  			System.out.println("당첨입니다.");
  		}else {
  			System.out.println("꽝입니다.");
  		}
  		
  		System.out.println("랜덤숫자 : "+random);
  		System.out.println("입력숫자 : "+input);
    	  
//-------------------------------------------------------
    	//랜덤 숫자
  		int random1 = 0;
  		random1 =(int)(Math.random()*5)+1;
  		System.out.println(random);
  	}//main
  }// class
package j0510_01;
import java.util.Scanner;
public class C0510_05 {
      public static void main(String[] args) {

  		//점수를 입력받아, 90점이상이면 A, 80점이상이면 B, 70-C,60-D, F
  		// 97점이상 A+, 93이하 A-, 87점이상 B+, 83이하 B-
    	  
    	//1. 변수선언  
    	int score = 0; // 디폴트 값 : 0;
  		Scanner scan = new Scanner(System.in);
  		System.out.println("점수를 입력하세요.");
    	score = scan.nextInt();
    	
    	//2.if문
    	if(score>=90) { // 90-100까지 
    		System.out.print("A");//print 후, 줄바꿈 안함
    		if (score>=97) {
    			System.out.println("A+");
    		}else if(score>=93) { // 80~89까지 비교		
    			System.out.println("A-");// print 후ln 줄바꿈 	    
    		}//else
    	}//if
    	
    	else if(score>=80) { //80-89까지
    		System.out.print("B");
    		if (score>=87) {
    		System.out.println("B+");
    		}else if(score>=83) {
    		System.out.println("B-");	
    		}
    	}//if
    	
    	else if(score>=70) { // 70-79까지
    		System.out.print("C");
    		if (score>=77) {
    		System.out.println("C+");
    		}else if(score>=73){
    		System.out.println("C-");	
    		}//else if
    	}//if 
    		
    	else if(score>=60) {// 60-69까지
    		System.out.print("D");
    		if (score>=67) {
    		System.out.println("D+");
    		}else if(score>=63){
    		System.out.println("D-");
    		}
    	}//if
    	else { // 60미만
    		System.out.println("F");
    	}
    	  
    	  
  	}//main
  }// class
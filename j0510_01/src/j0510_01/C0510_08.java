package j0510_01;
import java.util.Scanner;
public class C0510_08 {
      public static void main(String[] args) {

  		Scanner scan = new Scanner(System.in);
  		 //교수님 자바 Chapter 4. 조건문과 반복문 
  		
  		
  		//랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하시오.
//  		int random = 0;
//  		random = (int)(Math.random()*100)+1;
//  		System.out.println(random);
//  		
//  		//숫자 맞추기 프로그램
//  		//10번
//  		
//  		int i=0;
//		while(i<=10) {
//			for( i=0;i<10;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			int input = scan.nextInt();
//			if(input==random) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(input>random) {
//				System.out.println("[ 오답 ] 입력한 숫자보다 작은 수입니다.");
//			}else {
//				System.out.println("[ 오답 ] 입력한 숫자보다 큰 수입니다.");
//			}
//			
//			i++;
//			}//for
//		
//		}//while
//------------------------------------------------------------------    	  
		//i--, i-=1, i=i-1
				//i++, i+=1, i=i+1
//				for(int i=100;i>0;i=i-5) {
//					System.out.println(i);
//				}
  		
  		// 이중 for문

  		for(int i=0;i<10;i++) {
  			for(int j=0;j<10;j++) {
  				System.out.printf("%d %d \n",i,j);
  			}
  		}
  		
  	}//main
  }// class
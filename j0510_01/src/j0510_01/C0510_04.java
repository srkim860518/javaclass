package j0510_01;
import java.util.Scanner;
public class C0510_04 {
      public static void main(String[] args) {
    	//m,f 입력받아 m남자 f여자라고 출력하시오.
  		//switch문을 사용하시오.
    	
    	//1.변수 선언  
    	  char input = ' ';
    	//2. scan입력
  		Scanner scan = new Scanner(System.in);
  		System.out.println("성별을 출력하시오.");
  		input = scan.next().charAt(0);
  		//3.switch
  		switch(input) {
  		
  		case 'm': 
  		case 'M':
  			System.out.println("남자입니다.");
  			break;
  		
        case 'f': case 'F':
			System.out.println("여자입니다.");
			break;
			
		// case문 한가지만 지정할 때	
//		case 'm':// case 변수명 : 
//			System.out.println("m은 남자입니다.");
//			break;
//		default: // if의 esle와 같다고 생각하세요
//			System.out.println("f는 여자입니다.");
//----------------------------------------------------			
//			int input = 0;
//			Scanner scan = new Scanner(System.in);
//			System.out.println("숫자를 입력하세요");
//			input = scan.nextInt();
//			
//			//swith()
//			switch(input==1) {
//				
//			case 1:	// 숫자는 변수명
//				System.out.println("1입니다.");
//				break; //break를 만나면 종료하게 됨
//			case 2:
//				System.out.println("6입니다.");
//				break;
//			case 3:
//				System.out.println("9입니다.");
//				break;
//			default:	
//				System.out.println("원하는 숫자가 아닙니다.");					
				
		} //switch  
  
  		
    	  
  	}//main
  }// class
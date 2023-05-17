package j0511_01;

public class Class0511_04 {
	public static void main(String[] args) {
		
		// chapter4. 조건문과 반복문
		// 2.8 .continue문

//--------------------------------------
//		// 짝수만
//		for (int i =0;i<=10;i++) {
//			if(i%2!==1) {   // 0일때는 짝수만 나오게 / 1일때는 빠져나오지 말라고??
//				continue; // 
//			}
//			System.out.println(i);
//		}// for
////-----------------------------------------------------	
//		//5일때 빠져나오기
//		for (int i =0;i<=10;i++) {
//			if(i==5) {   
//			
//			}
//			System.out.println(i);
//		}// for
////-----------------------------------------------------		
//		//continue5일때 빠져나오기 
//		for (int i =0;i<=10;i++) {
//			if(i==5) {   // 1~3까지 실행후 5일때만 if문 실행
//				continue; // 5일때 for문으로 다시 실행
//			}
//			System.out.println(i);
//		}// for
		
//--교수님내용수정하기-------------------------------------------------
	
		//문제) 구구단에서 5단만 빼고 출력하시오.
		//1. 구구단 2. if문 작성
		
		//중첩 반복문 
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단  ] \n", i);
//			
//			if(i ==5) { //i= 단5
//				continue;
//			} //if
//			
//			for(int j=1;j<=9;j++) {
//				// i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//			//System.out.println(i+" * "+i" = "+(i*i));
//			System.out.printf("%d *%d = %d \t",i,j,i*j); // \t:     \n: 
//			System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
//			} //for - j			
//----교수님내용수정하기------------------
//			// 구구단5단 빼고 출력하시오.
//			for(int i=2;i<=9;i++) {
//				System.out.printf("[ %d 단  ] \n", i);
//				if(i%2!==0) { //i= 단5, // (i%2!==0) 
//					continue;
//				} 
//			if(j==0)
//				}
//					// i = 1일때 j는 9번--> i가 9번 돌고*j가 9번 돌면 = 81번 반복  
//				//System.out.println(i+" * "+i" = "+(i*i));
//				System.out.printf("%d *%d = %d \t",i,j,i*j); // \t:     \n: 
//				System.out.println();// i=1 * j=1~9까지 반복 하고 구간 나눔
//
//		}//for -i
//-----------------------------------------------------	
		/// 2.9 이름 붙은 반복문과 break, continue
		
		
		//continue;인 경우 - 내용 확인하세요 
//		for (int i = 2; i <= 9; i++)
//			for (int j = 1; j <= 9; j++)
//				if (j == 6)
//					continue;
//		System.out.printf("%d*%d=%d\t", i, j, i * j);
//
////-----------------------------------------------------		
//		// break;인경우 - 함수 내용 확인 하세요
//		for (int i = 2; i <= 9; i++)
//			for (int j = 1; j <= 9; j++)
//				if (j == 6)
//					break;
//		System.out.printf("%d *%d = %d \t", i, j, i * j);
//		
//
////-----------------------------------------------------	
//		//loop  break;인경우 루프 빠져나올수 있음.
//		loop:for (int i = 2; i <= 9; i++) {
//			//		if (j == 6) break;
//			for (int j = 1; j <= 9; j++) {
//				if (j == 6) break loop; // 원하는 위치에 for문을 벗어날 수 있다.
//		System.out.printf("%d*%d=%d\t",i,j,i*j);
//			}
//		}
								
		
		
	}//main

}

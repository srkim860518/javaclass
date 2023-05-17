package j0511_01;

public class Class0511_03 {
public static void main(String[] args) {
	//chapt 4.조건문과 반복문
	// 2.7 break문
		
	
//	int i = 0, sum = 0;
//	
//	while(true) {
//		if(i>100) { // i>=100 = 100일때 멈춤 
//			break; // while문만 반응
//		}
//		sum = sum + 1;                         //i = 0, sum = 0, i= 1 sum=1 13일  sum=91
//		i++; // if(i에 +1씩 증가)                // i =14일
//		
//	}//while
//	
//	System.out.println("i의 결과값 : "+1);
//	System.out.println("sum의 결과값 : "+sum);
//-----------------------------------------------------
	//i++; // if(i에 +1씩 증가)  sum 앞에 i++ 가 있어야함
//	int i = 0, sum = 0;
//
//	while (true) {
//		if (sum > 100) { // i>=100 = 100일때 멈춤
//			break; // while,for문 종료할때 :break문
//		}
//		i++; // if(i에 +1씩 증가)  sum 앞에 i++ 가 있어야함
//		sum = sum + 1; // i=13일 때 sum=91
//
//	} // while
//
//	System.out.println("i의 결과값 : " + 1);
//	System.out.println("sum의 결과값 : " + sum);	
//-------------------------------------------------------------------------------------------------
//---------- 비교: 1. 위치에 따라 값은 동일함(수식확인하기)i++; = System.out.println("i의 결과값 : " + (i-1));------------------------------------------		
	//i++;를 입력하지 않았을때
//	int i = 0, sum = 0;
//
//	for(i=0;;i++) {
//		if (sum > 100) { // sum>=100 = 100일때 멈춤
//			break; // while,for문 종료할때 :break문
//		}
//		sum = sum + i; // i=13일 때 sum=91
//
//	} //for
//
//	System.out.println("i의 결과값 : " + (i-1)); // i++;가 없을때 (i-1) 울 빼줘야함
//	System.out.println("sum의 결과값 : " + sum);	

//------------0비교: 1. i++; = System.out.println("i의 결과값 : " + (i-1));------------------------------------		
// i++;가 for문 뒤 일때 +(i) 
	int i = 0, sum = 0;
    
	//반복문에서 break문 예제
	for(i=0;;i++) {
		if (sum > 100) { // sum>=100 = 100일때 멈춤
			break; // while,for문 종료할때 :break문
		}
		i++;
		sum = sum + i; // i=13일 때 sum=91

	} //for

	System.out.println("i의 결과값 : " +(i)); // 	i++;가 for문 뒤 일때 +(i) 
	System.out.println("sum의 결과값 : " + sum);	

//-----------------------------------------------------		
// 반복문 확인하기 - 디버깅 모드 f6 키로 변환되는 값 확인 할 수 있음.
		
	}// main

}// class

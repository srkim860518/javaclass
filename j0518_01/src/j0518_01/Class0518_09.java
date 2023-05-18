package j0518_01;

import java.util.Scanner;

public class Class0518_09 {

 public  static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int mymoney = 1000;
	int choice = 0;
	 // 자판기 프로그램.
	// 1. 밀크커피-500, 2.헤이즐럿커피 : 500원 , 3.블랙커피 350, 4.코코아 300, 5.우유 400, 6. 잔액충전
	loop: while(true) {
		 System.out.println("[우리동네 자판기]");
		 System.out.println();
		 
		 System.out.println("1. 밀크커피 : 300");
		 System.out.println("2. 헤이즐럿커피 : 500원");
		 System.out.println("3. 블랙커피 : 350,");
		 System.out.println("4. 코코아 : 300");
		 System.out.println("5. 우유 : 400");
		 System.out.println("6. 잔액충전");
		 System.out.println("0. 프로그램 종료");
		 System.out.println("==##====== =♡= ==##===");
		 System.out.println("원하는 번호를 입력하세요.");
		 System.out.printf("현재잔액: %,d \n",mymoney);
		 choice = scan.nextInt();
		 
		 switch(choice) {
		 // 메소드 사용 속도 비교- 메소드를 쓰면 6배 빨라짐
		 // 6*100=600
		 // 100+6= 106
		 
		 case 1:
			 mymoney = order(mymoney,300,"밀크커피");
				 
		 break;
		 
		 case 2: 
			 mymoney = order(mymoney,500,"헤이즐럿커피");
//			 if(mymoney>=500) {
//				 System.out.println("헤이즐럿 커피가 자동으로 나옵니다.");
//				 mymoney = mymoney-500;
//			 }else {
//				 System.out.println("잔액이 부족합니다. 잔액을 충전하세요.");
//			 }
		 break;
		 case 3:
			 mymoney = order(mymoney,350,"블랙커피");
//			 if(mymoney>=350) {
//				 System.out.println("블랙커피가 자동으로 나옵니다.");
//				 mymoney = mymoney-350;
//			 }else{
//				 System.out.println("잔액이 부족합니다. 잔액을 충전하세요.");
//			 }
			 break;
		 case 4:
			 mymoney = order(mymoney,300,"코코아");
//			 if(mymoney>=300) {
//				 System.out.println("코코아가 자동으로 나옵니다.");
//				 mymoney = mymoney-300;
//			 }else {
//				 System.out.println("잔액이 부족합니다. 잔액을 충전하세요");
//			 }
			 break;
		 case 5:
			 mymoney = order(mymoney,400,"우유");
//				 System.out.println("우유가 자동으로 나옵니다.");
//				 mymoney=mymoney-400;
//			 }else {
//				 System.out.println("잔액이 부족합니다. 잔액을 충전하세요.");
//			 }
			 break;
		 
		 case 6: System.out.println("잔액을 충전합니다. 충전금액을 입력하세요.");
		 int temp = scan.nextInt();
		 if(temp>0) {
			 System.out.println("결제수단 : 1. 카드 결제");
			 choice = scan.nextInt();
			 if(choice==1) {
				 mymoney+=temp; // mymoney = mymoney+temp;
				 System.out.println("카드 결제가 완료되었습니다.");
				 System.out.printf("충전금액 : %,d \n",temp);
				 System.out.printf("현재잔액 : %,d \n",mymoney);
				 System.out.println();
				 
			 }else {
				 System.out.println("[시스템에 오류가 있습니다. 다시 설명해 주세요.]");
				 System.out.println();
			 }//else
		 }//if
		 break;
		 case 0:	 
			 System.out.println("[프로그램 종료]");
			 System.out.println();
			 break loop;
		 
		 
		 }//switch		 
		 
		 
		 
	 }// while
	 
	 
  }// main
//======================================================================================= 
// 음료 제조 메소드
 static int order(int mymoney,int price,String title) {
	 if(mymoney>=price) {
		 System.out.println("밀크커피가 자동으로 나옵니다.");
		 mymoney = mymoney-price; // mymoney-=300;
	 }else{
		 System.out.println("잔액이 부족합니다. 잔액을 충전하세요.");
	 
	 }
	 return mymoney;
	 
} //메소드




}// class











































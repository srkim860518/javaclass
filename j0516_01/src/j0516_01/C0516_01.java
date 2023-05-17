package j0517_01;

import java.util.Scanner;

public class Class0517_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//리모콘 연습 
		//지역변수 메소드 내에서 변수 지정: 기본값을 지정나해주면 에러가 남
		//  리모콘
		// 채널 1,2,3,4,5,6,7,8,9
		// chanelUp, channelDown 이전 보기, 자막
		// volumeUp, volumeDown, 음소거
		// 전원
		
		int choice =0;
		int tempvolume = 0;
		
// 객체 선언
		Tvv t = new Tvv();
		
		while(true) {
			System.out.println("리모콘 프로그램");
			System.out.println("1. 전원 ,on/off");
			System.out.println("2. 채널up");
			System.out.println("3. 채널down");
			System.out.println("4. volume up");
			System.out.println("5. volume Down");
			System.out.println("6. 음소거");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
		choice =scan.nextInt();
		
		switch(choice) {
		case 1:
			t.power();
			if(t.power==true) {
				System.out.println("전원이 on 되었습니다.");
			}else{
				System.out.println("전원이 off 되었습니다.");
			}
//			System.out.println();
			break;
//=============================================================			
		case 2: 
			if(t.power!=true) {// 전원이 꺼진 상태
				System.out.println("전원을 켜주세요");
				break;
			}
			t.channelUp();
			System.out.println("현재 채널 : "+t.channel);
		case 3:
			if(t.power==false) {
				System.out.println("전원을 켜주세요");
				break;
			}
			t.channelDown();
			System.out.println("현재 채널: "+t.channel);
			break;
//=============================================================
		case 4:
			if(t.power!=true) {
				System.out.println("전원을 on 해주세요");
				break;
			}
			t.volumeUp();
			System.out.println("현재 volume : "+t.volume);
			System.out.println();	
			break;
		case 5:
			if(t.power!=true) {
				System.out.println("전원을 on 해주세요.");
				break;
			}
			t.volumeDown();
			System.out.println("현재 volume : "+t.volume);
			System.out.println();
			break;
//=============================================================
		case 6: // 음소거
			if(t.volume==0) {
			System.out.println("음소거");
			 break;
			}
		    
		}// switch
		}//while
		
		
	}// main

}//class
























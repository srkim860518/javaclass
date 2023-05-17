package j0516_01;

import java.util.Scanner;

public class Class0516_06 {

	public static void main(String[] args) { // 메인 메소드
		Scanner scan = new Scanner(System.in);
		
		// 지역 변수 : 메소드 내에서 변수 지정 : 기본값을 지정안해주면 에러가남 
		// class의 변수는 지정을 안해줘도 디폴트 값이 지정 됨.=0
		// 리모콘
		// 채널 1,2,3,4,5,6,7,8,9,
		// channelUp, channelDown, 이전 보기, 자막
		// volumeUp, volumeDown, 음소거
		// 전원
		int choice =0;
		int tempVolume = 0;
		//객체 선언
		Tv t = new Tv(); // 객체를 새롭게 생성해줘라:new
		
	
		while(true) {
		System.out.println("리모콘프로그램");
		System.out.println("1. 전원 on/off");
		System.out.println("2. 채널 Up");
		System.out.println("3. 채널 Down");
		System.out.println("4. volume Up");
		System.out.println("5. volume Down");
		System.out.println("6. 음소거");
		System.out.println("------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		switch(choice) {
		case 1: // 전원 on/off
			t.power(); // 객체 사용 방법: 참조변수명.메스드명
			if(t.power==true) {
				System.out.println("전원 on되었습니다.");
			}else {
				System.out.println("전원 off되었습니다.");
			}
			System.out.println();
			break;
		case 2:
			//if(t.power==false) = if(t.power!=true) 내용 동일
			if(t.power!=true) { // 전원을 꺼진 상태 
				System.out.println("전원을 on 해주세요.");
				break;
			} //if
			
			t.channelUp();
				System.out.println("현재 채널: "+t.channel);
				System.out.println();
				
		case 3:
			//if(t.power==false) = if(t.power!==true) 내용 동일
			if(t.power==false) { 
				System.out.println("전원을 on 해주세요.");
				break;
			} //if
			
			t.channelDown();
				System.out.println("현재 채널: "+t.channel);
				System.out.println();
				break;
//==============================================================
		case 4:		// 볼륨 업
			if(t.power!=true) {
				System.out.println("전원을 On 해주세요.");
				break;
			}
			t.volumeUp();
			System.out.println("현재 volume : "+t.volume);
			System.out.println();
				break;
		case 5: //볼륨 다운
			if(t.power!=true) {
				System.out.println("전원을 On 해주세요.");
				break;
			}
			t.volumeDown();
			System.out.println("현재 volume : "+t.volume);
			System.out.println();
				break;
			
		case 6: // 음소거
			if(t.volume==0) {
				t.volume = tempVolume; // 임시 볼륨 높이 입력
				System.out.println("음소거 해제");
				System.out.println("현재 볼륨 "+t.volume);
			
			}else {
				tempVolume = t.volume; //현재 볼륨 높이를 저장
				t.volume=0;		
			System.out.println("음소거 실행");
			System.out.println("현재 볼륨 : "+t.volume);
			}
				break;
//==============================================================	
		}// switch(choice)
		}// while
	
	
	} // main

} // class


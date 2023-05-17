package j0516_01;

public class Tv {
	String color; // class의 바로 밑에 선언 : 
	boolean power;
	int channel;
	int volume=10;
//	final int NUM=0;// 상수는 변경 불가
		
	void power() { // 괄호가 있으면 메소드, power 메소드
		power = !power;	
	}
	void channelUp() { //channelUp 메소드
		if(channel>=999) { 
			channel=1;
			return;
		}
		channel++;
	}
	void channelDown() { //channelDown 메소드	
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}

	void volumeUp() { //volumeUp 메소드
		if(volume>=100) {
			volume=100;
			return;
		}
		volume++;
	}
	
	void volumeDown() {
		if(volume<=0) {
			volume=0;
			return;
		}
		volume--;
	}
} // class

package j0518_01;

public class T { // 리모콘 연습

	 String color;
	 boolean power;
	 int channel;
	 int volume=10;
	 // final int Num=0; // 상수 변경 불가
	 
	 void power() {
		 power = !power;
	 }
	void channelUp() {
		if(channel>=99) {
			 channel=1;
			 return;
		 }//if
		channel++;
	 }
	 
	void channelDown() {
		if(channel<=1) {
			channel=99;
			return;
		}
		channel--;
	}
	 void volumeUp() {
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
	 
}//class

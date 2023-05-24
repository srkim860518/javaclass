package j0524;

public class Tv {
	boolean power;
	int channel;
	
	void power() {
		power  = !power;
		
	}
	
void channelUp() {
	channel++; // 채널up을 하면 1을 증가 시켜 1 실행됨.
}

void channelDown() {
	channel--;
}

}//class


package j0523_01;

public class Deck {

	Card[] c = new Card[52]; // 객체 선언 4종류*13 = 52장
	
	Deck() { // 기본생성자
		//kind = null, number = 0;//spade,1 spade,2, spade,4 ....clover 13;
		//spade : 1-13장, Heart-13장, Diamond-13장, Clover-13장

		for(int i=0;i<52;i++) { // number 1-13번
			c[i] = new Card(); // 객체 선언 (kind,number가 있는 공간)
			c[i].kind = c[i].kinds[i/13]; //"Space";// 0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,
			c[i].number = (i%13)+1; //1,2,3,4,5,6,7,8,9,10,11,12,13,1
			//  몫, 나머지 
		} //for
		}//기생

	//0-51번까지
	void shuffle() {
		for(int i=0;i<1000;i++) {
			
		int random = (int)(Math.random()*51);
		Card temp=null; // 객체`선언 Card에서 가져온 것으로 객체명 temp = null; 
		temp = c[0];
		c[0]= c[random];
		c[random]=temp;
		}
	}// shuffle
	
	
	
	
	
		//카드뽑기c[0],c[1],c[2],c[3]
	Card pick(int index) {//0-51
		return c[index];
	}
		
		
		
//====================================================================================================================	
//		//교재내용 -for 문
//		int k=0;
//		for(int i=0;i<4;i++) {// 모양
//			for(int j=0;j<13;j++) { // 숫자
//				c[k] = new Card(Card.kinds[i],j+1); // Card.kinds[i]: Card의 클래스 변수를 불러올때는 : 클래스명.변수명
//			k++;
//			}
//		
//	
//		
////		for(int i=0;i<52;i++) {// 13, 26, 39, 52
////			(i/13)
////			c[i] = new Card(); // 
//		
			
			
	
		
		
	
	
	
}

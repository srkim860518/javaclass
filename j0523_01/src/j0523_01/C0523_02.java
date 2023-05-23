package j0523_01;


public class C0523_02 {

	public static void main(String[] args) {
	
//		Card[] c = new Card[52]; // 카드 52가 들어있는 1개의 배열
		Deck d = new Deck();
		d.shuffle(); // 데크를 d로 저장해둔 상태이고, d.shuffle 로 불러올 수 있음
		//c[0]=Space,1,c[1].....c[51
		//d.pick[5];// 5번꺼 가져오세요
		
		// 카드 뽑기 메소드 =/d.pick[5];// 5번: 순번 가져오세요
//		System.out.printf("%s, %d \n",d.pick(51).kind, d.pick(51).number);
		
		
		
		
		
		
	
		// space, Heart, Dianmond, Clover
//		for(int i=0;i<13;i++) { // number 1-13번
//			 c[i] = new Card(); // 객체 선언 (kind,number가 있는 공간)
//			 c[i].kind = "Space";
//			 c[i].number = 1;
//		}
//		for(int i=0;i<13;i++) {
//			System.out.println(c[i].kind);
//			System.out.println(c[i].number);
//		}

//		// 52장 입력
//		int k=0;
//		//교재내용 -for 문
//		for(int i=0;i<4;i++) {// 모양
//			for(int j=0;j<13;j++) { // 숫자
//				c[k] = new Card(Card.kinds[i],j+1); // Card.kinds[i]: Card의 클래스 변수를 불러올때는 : 클래스명.변수명
//			k++;
//			}
//		
//		}
//		
//		for(int i=0;i<52;i++) {
//			System.out.println(c[i].number);
//			System.out.println(c[i].kind);
//		}
//		
		
		
//		for(int i=0;i<52;i++) { // number 1-13번
//			c[i] = new Card(); // 객체 선언 (kind,number가 있는 공간)
//			c[i].kind = c[i].kinds[1]; //"Space";// 0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,
//			c[i].number = (i%13)+1; //1,2,3,4,5,6,7,8,9,10,11,12,13,1
//			//  몫, 나머지 
//		}
		// 위 for문 이해하기 위한 설명
	//	kind = 1,2,3,4 //몫 : i(52)/13 = 4
	//	number = 1-13, 순번: 0-12 번째 // 나머지: i%13 을 하면 0~12까지 나옴 +1을 해주면 	
//			System.out.println(i/13"+"i%13);
//				System.out.println(i/13"+"(i%13)+1);
		
		
		//출력하시오.
//		for(int i=0;i<52;i++) {
//		System.out.printf("%s,%d \n",c[i].kind,c[i].number);
//		} //for
		for(int i=0;i<52;i++) {
			System.out.printf("%s,%d \n",d.c[i].kind,d.c[i].number);
			} //for
	
	}// main
	
}//class

package j0524;     // class -CaptionTv,Tv 적용

public class C0524_02 {

	public static void main(String[] args) {

		//다형성 : 조상 타입의 참조 변수로 자손타입의 객체를 다루는것 !! 
		
		//객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);// 채널up을 하면 1을 증가 시켜 1 실행됨.
		c.caption(); // 캡션 기능을 시작합니다.
		
		//다형성 , 다형성의 단점: 
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println("t.channel: "+t.channel); 
		// 1이 나온 이유 : 객체선언은 다른 내용, 
		// t.caption(); 공간만 있고 t에는 메소드가 없음-> 사용 불가

		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println("t2.channel: "+t2.channel);//1
		
		
		
//		CaptionTv c2 = null; // 주소값 받을 수 있는 공간만 만듦
//		확인 해봄
//		t2 = c;
//
//		c2 = (CaptionTv)t2; //  강제 형변환
//		System.out.println("c2: "+c2);
		
		
	}//main

}//class

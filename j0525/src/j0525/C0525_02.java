package j0525;

import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		// 퀴즈1 1,13q번째 

		
//		list.add(new Card(Card.kinds[0],1));
//		list.add(new Card(Card.kinds[0],2));
//		list.add(new Card(Card.kinds[0],3));
		
//
//		for(int i=1;i<14;i++) {
//			list.add(new Card(Card.kinds[0],i));
//			
//		}
		//출력
//		System.out.println("=====================");
//		for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
//			 System.out.println(list.get(i).kind+","+list.get(i).number);
//		 }
//	 
//		System.out.println("=====================");
//		for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
////			 System.out.println(list.get(i).kind+","+ list.get(i).number);
//		System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number-1]);// -1을 해주는 이유는 : 제로
//		}
//=============================================================================================================		
		// 퀴즈2 카드 4개를 만들어서, 4가지 종류를 넣으시오.
		
//		// 입력
//		for(int i=0;i<4;i++) { // 카드 4종류
//			list.add(new Card(Card.kinds[i],1)); // list add를 사용하여 class의 참조변수를 바로 불러옴 
//			                                     // Card.kinds[i]*4번 돌면 = card4종류// ,1 = 배열 1번째를 불러옴
//		}
//		
//		
//		// 출력
//		for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
//			System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number]);// -1을 해주는 이유는 : 제로
//		                        //list.get(i) = list에서 get(불러오닥)
//		}
		
//=============================================================================================================		
		// 퀴즈 3 카드 52장을 만들어서 space-13장 , heart-13장, Diamond-13장, clover-13장 숫자는 무조건 1로 넣으시오 
		//1,2,3,4...52 0*13+1, 0*13+2, 0*13+3...1*13+1,1*13+2,1*13+2...  
		// 입력 
		for(int i=0;i<52;i++){ // 카드 52장
			list.add(new Card(Card.kinds[i/13],i%13+1)); 
			//Card.kinds[i/13] 카드4종: i=52/13장=4종, i%13+1: 몫 : i52%13  numbers의 배열 순서 불러오기
		}
		// 출력
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number]);
			// ArrayList에서 생성및  호출된 Card.kinds 배열에서 list.get(i).kind.kind=카드 4종 
			 // 이름+ get=불러와 i 적용,numbers 배열의 i번째를 입력[string 1~K까지 실행 됨] 
		
		//출력 비교확인
//		System.out.println(list.get(i).kind+","+list.get(i).number);
		} // ArrayList에서 생성및  호출된 Card.kinds 배열에서 list.get(i).kind.kind=카드 4종 
		  // 이름+ get=불러와 i 적용,numbers의  i번째 숫자를 입력 --> 이름 뒤에 1,2,3,4,5,-13번까지 i순서
		
		
		
		
		
		
		
		
		
		
	}

}

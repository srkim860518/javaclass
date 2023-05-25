package j0525;

import java.util.ArrayList;

public class C0525_01 {

 public static void main(String[] args) {
	
	 Card[] c = new Card[2];// 100,1000개 이상으로 리스트에 담으면 메모리를 많이 쓰게 됨,
	                        //대체 : ArrayList 사용
	 
	 Card c1 = new Card(Card.kinds[0],1);
	 Card c2 = new Card(Card.kinds[1],1);
	 Card c3 = new Card(Card.kinds[2],1);
	 Card c4 = new Card(Card.kinds[3],1);
	 
	 c[0] = c1;
	 c[1] = c2;
//	 c[2] = c3;
//	 c[3] = c4; // 프로그램상 에러는 아니지만, 실행시키면 배열 벗어남으로 에러 남--> 해결 : 배열 4 변경
	 
//	 
//	 ArrayList list = new ArrayList();
//	 //ArrayList 추가
//	 list.add(c1); //배열의 0번째 Object o = new Card(Card(Card.kinds[1],1)
//	 list.add(c2); //배열의 1번째
//	 list.add(c3); //배열의 2번째
//	 list.add(c4); //배열의 3번째 
//	 
//	 // ArrayList 읽기
//	 //list.get(0); 오브젝트를 형번환해야함. 아래 내용처럼
//	 Card card =(Card)list.get(0);
//	 System.out.println(card.kind+","+card.number);
//	 System.out.println(card.number); // list.get(0)은 Object, list안은 card --> 형변환:
//	 
//	 
//	 System.out.println("프로그램 종료");
	 
	 ArrayList<Card> list = new ArrayList();
	 //ArrayList 추가
	 list.add(c1); //배열의 0번째 Object o = new Card(Card(Card.kinds[1],1)
	 list.add(c2); //배열의 1번째
	 list.add(c3); //배열의 2번째
	 list.add(c4); //배열의 3번째 
	 
	 for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
		 System.out.println(list.get(1).kind+","+list.get(0).number);
	 }
	
	
	//list.remove(2);// 삭제 , 삭제하여도 뒤에있는거를 당겨옴 데이터 양이 많을 수록 느려짐
	
	//퀴즈.kind =heart 삭제하시오.
	 	// 하트 1번방 찾기 
//	 for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
//		 if(list.get(i).kind.equals("HEART")) {// list.get(i) i번째의 kind == equals("Heart) 
//			                                   // 해석 kind리스트의 i번째가 "Heart"와 같은면 
//		 list.remove(i); // 조건이 맞으면 list(i) 삭제
//	
//		 }
//	 }
	
	 // 퀴즈 2. list안에 number= 4 삭제 하시오
	 	for(int i=0;i<list.size();i++) {// 4개 Heart
	 		if(list.get(i).number ==4) {
	 			list.remove(i);
	 		}
	 	}

	System.out.println("=====================");
	for(int i=0;i<list.size();i++) {//이전 사용c.length--> list.size() size만큼 돌아라는 뜻
		 System.out.println(list.get(i).kind+","+list.get(i).number);
	 }
 
	System.out.println("개수: "+list.size());
	 System.out.println("프로그램 종료");
	 
	 
	 
	 
	 
  } //main
	
	
}// class


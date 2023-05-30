package j0530_01;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class C0530_06 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add(1);//0
		list.add(2);//1
		list.add(3);//2
		list.add(4);//3
		list.add(5);//4
		list.add(6);//5
		list.add(7);//6
		System.out.println("현재 : "+list.size());
//		list.remove(3);//list.add(4);가 지워지고 5번이 당겨져서  출력됨 
//		list.remove(4);

		//		구번전 :	Enumeration enum = new Enumeration();  
		//신버전: Iterrator 사용 출력 : 원래는 이렇게 사용 해야함  //자주 사용하지 않아요

	
//		Iterator it = list.iterator(); // 컬렉션을 읽어오는 객체 
//		
//		while(it.hasNext()) { // 데이터가 있는지 확인
//			System.out.println(it.next()); //1 개의 데이터를 가져옴.
//		}
//		Iterator it2 = list.iterator(); // 컬렉션을 읽어오는 객체 , 두번 세번 사용 하려면 객체선언을 해줘야함
//			System.out.println(it.next()); //1 개의 데이터를 가져옴.
//		}
		
		
		
		
		
		// Iterrator 대신 이렇게 
		//for 문출력
//		System.out.println(list.size());
//		for (int i=0;i<list.size();i++) {
////			System.out.println(list.get(i));
//			list.remove(i); // 삭제
//		}//for


		//전체 삭제
//		for (int i=list;i<list.size()-1;i--) {
//			list.remove(i); // 리스트 전체를 삭제하면 에러남 , 다 지워져서 리스트가 빈공간이다.
//		}//for
//		
		
		
		
	}// main

}// class

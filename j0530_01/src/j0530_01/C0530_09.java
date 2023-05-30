package j0530_01;

import java.util.*;

public class C0530_09 {

	public static void main(String[] args) {

		// map 공간 선언
		Map<String, Object> map = new HashMap<>(); // 제너릭 문자열, object:전체사용

		Colclass c = new Colclass(); // 1. 객체 선언

		// list, nowPage, stratRow, endRow
		map = c.execute(); // 2.메소드 불러오기
		// 중요!!!!!Colclass 에서 map의 리턴을 받아 불러와서 사용 가능

		// ColClass2 사용하려면 ? 객체 선언
		int nowPage = 0;
		Colclass2 c2 = new Colclass2();
		nowPage = c2.execute2();
		
		//ColClass3 사용하려면? 객체 선언
		Colclass3 c3 = new Colclass3();
		ArrayList<Student> list = new ArrayList();
		list = c3.execute3();
		
		//ColClass4
		ColClass4 c4 = new ColClass4();
		Map<String, Object> map1 = new HashMap<>(); // map 공간 선언이 두번째 변수명 map1을 불러옴
		map1 = c4.execute4();		

		System.out.println("현재페이지: " + map1.get("StartRow"));

//		int,String subMaethod() { // 이렇게 사용 불가
//		int result = 0;
//		String name = "홍길동";
//		return result,name;// 데이터를 두개 보낼 수 없음 , 파이썬은 가능
//		}

	}// main

}// class

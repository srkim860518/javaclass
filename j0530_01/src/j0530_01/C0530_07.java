package j0530_01;

import java.util.*;

public class C0530_07 {
	
	public static void main(String[] args) {
		//
		ArrayList list = new ArrayList();		
		list.add("abc");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");
		
		//list 출력 1 = Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //iterator의 it을 출력 시켜라
		}
		System.out.println("----for문 출력-----------");
		//list 출력 2 = for문
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		HashSet hs = new HashSet(); 
		hs.add("abc");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("abc");
		
		hs.add("bbb");
		hs.add("aaa");	
		
		System.out.println("---HashSet 출력-(중복제거 출력)---");
		System.out.println("[set 출력]");
		//출력 , set은 이 방법으로만 출력 가능, 
		Iterator it2 = hs.iterator();
		while(it2.hasNext()) {
		System.out.println(it2.next()); //iterator의 it을 출력 시켜라
				}
		
	}// main

}// class

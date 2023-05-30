package j0530_01;

import java.util.*;

public class C0530_08 {
	
	public static void main(String[] args) {
		//
		ArrayList list = new ArrayList<>();		
		list.add("aaa");
		list.get(0);
		System.out.println("list: "+list.get(0));
		System.out.println("-------------");
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------");
		HashMap map = new HashMap<>(); // hashmap은 순서가 없음, 키와 값으로 찾음
		map.put("id","aaa"); // key:id , value : aa
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");		
		System.out.println("map: "+map.get("id"));
		System.out.println("-------------");
		
		Iterator it = map.entrySet().iterator();
		//HashMap에는 iterator가 없어서 entrySet()으로 불러와야함.
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}// main

}// class

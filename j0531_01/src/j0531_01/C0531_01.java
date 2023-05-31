package j0531_01;

import java.util.*;
public class C0531_01 {

	public static void main(String[] args) {
		// 다형성 : 부모의 참조 변수로 자손의 객체를 다루는 것 
		List list = new ArrayList<>();
		list.add("aaa");//0 인덱스 번호 호출
		list.add("bbb");//1
		list.add("ccc");//2
		list.add("aaa");//3
		System.out.println(list.get(2));// 제로인덱스 번호 호출 2번
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		
		List list2 = new ArrayList<>();
		//Student s1 = new Student(1,"홍길동",100,100,99); //기존 두줄로 불러왔던 방식
		//list.add(s1);                                   // 기존에 불러왔던 방식
		list2.add(new Student(1,"홍길동",100,100,99));
		list2.add(new Student(2,"유관순",99,99,98));			
		Student s = (Student)list2.get(1); //list2.get(1)--> 형변환 에러--> 변경(Student)list2.get(1) 
		System.out.println(s.getName());
		//System.out.println(list2.get(1)); // 주소값으로 불러옴 j0531_01.Student@626b2d4a -> 형변환
		System.out.println(((Student)list2.get(1)).getName()); //형변환
		System.out.println("------------------");
		
		// 지네릭을 사용하면 ArrayList보다 더 짧게 불러 사용 할 수 있음 
		List<Student> list3 = new ArrayList<>();//지네릭
		list3.add(new Student(1,"홍길동",100,100,100));
		list3.add(new Student(2,"유관순",99,99,98));
		//list3.add(1);
		//list3.add("abc");
		
		Student ss = list3.get(0);
		System.out.println(ss.getName());
		System.out.println(list3.get(0).getName());
		
	}//main

}//class

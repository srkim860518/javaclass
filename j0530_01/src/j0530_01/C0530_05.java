package j0530_01;

import java.util.ArrayList;
import java.util.Scanner;

public class C0530_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 11. 컬렉션 프레임웍
		// list. 객체들의 집합, 데이터 이동 및 읽기, 저장 용도로 사용
		
		//ArrayList+  ctrl+t  객체의 조상부터 리스트 볼 수 있음 
		//list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
		ArrayList list = new ArrayList();//다항성 // 제너릭을 넣지 않아도 되나 밑줄이 됨.실행은 됨
		list.add("abc");//0
		list.add("abc");//1
		list.add("bbb");//2
		list.add("aaa");//3
		list.add("ccc");//3
		list.add(3);//Integer
		System.out.println(list); // [abc, abc, bbb, aaa, 3] 리스트는 대괄호 안에 list 목록이 들어감
		System.out.println(list.get(4)); //3 , 리스트이지만 1개의 값만 출력으로 대괄호가 없음
//		for(int i = 0;i<list.size();i++) {
//			System.out.println("list: "+list.get(i));
//		}//for
		System.out.println("--list2---------------------------------------------------");
		
//
//		ArrayList<Student> list2 = new ArrayList(); //지네릭스 // <Student> 특정 클래스만 입력 가능하게 하려고 ArrayList<Student> list2 선언
//		list2.add(new Student(1,"홍길동",100,100,99));
//		list2.add(new Student(2,"유관순",90,90,99));
//		list2.add(new Student(3,"이순신",80,80,87));
//		list2.add(2); // Integer , student타입이 다름으로 에러남: class java.lang.Integer cannot be cast to class j0530_01.Student 
//		list.add("abc"); // student 
		
//		//출력하시오
//		//list2.get(i) student.getName()
//		for(int i =0;i<list2.size();i++) {
////			Student student = (Student) list2.get(i);
//			Student s = (Student) list2.get(i);
//			System.out.println("list2: "+s.getStuNo()+" "+s.getName()+" "+s.getKor()+" "+s.getEng()+" "+s.getTotal()+" "+s.getAvg()); // 줄여쓰려고 변수명 s로 변경해서 사용

	
		
		ArrayList list2 = new ArrayList();
		list2.add(new Student(1,"홍길동",100,100,99));
		list2.add(new Student(2,"유관순",90,90,99));
		list2.add(new Student(3,"이순신",80,80,87));
//		
//		//출력하시오
//		//list2.get(i) student.getName()
		for(int i =0;i<list2.size();i++) {
			Student student = (Student) list2.get(i);
			//풀이 방법 1
			System.out.print("list2: "+student.getName()+"\t"+student.getKor()+"\t"
			                  +student.getEng()+"\t"+student.getMath()+"\t"+student.getTotal()+"\t");
			System.out.printf("%.2f\n",student.getAvg());
			//풀이 방법 2
//			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t \n",student.getStuNo(),student.getName(), //방법2
//					   student.getKor(),student.getEng(),student.getMath(),student.getTotal(),student.getAvg());
						
		}//for
		
	}// main

}// class

package j0531_01;

import java.util.*;
public class C0531_02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		StuProcess sp = new StuProcess(); // 객체선언
		List<Student> list = new ArrayList<>(); 
		int input=0; // choice할때 받으려고 만듦
		int choice=0;
		int stuCount = list.size()+1; //학번, 때문에 count 추가, 난이도를 올리기 위해 일부러 넣음
		                  //메모장에 3개의 파일이 있고, 추가는 1개 부터 //list.size()+1 삭제할 경우 마지막거 + 1
		// 인터페이스 : List<Student>로 부른 후 new 뒤에는 ArrayList<>() 꼭 써줘야함
//		list.add(new Student(1,"홍길동",100,100,99)); // Student 클래스에 this.에 있는 값을 입력하면 합계,평균도 값이 들어가 있음
//		list.add(new Student(2,"유관순",99,99,98)); // Student 클래스에 this.에 있는 값을 입력하면 합계,평균도 값이 들어가 있음
		
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1.학생입력");
			System.out.println("2.학생출력");
			System.out.println("8.파일에서 가져오기");
			System.out.println("9.파일 저장하기");
		
		
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1: 
		
//			sp.stuInput();//sp.stuInput(매개변수);
//			//메소드 호출 후 데이터 전달 받음
			Map<String, Object> map = sp.stuInput(list,stuCount); // 핵심, 매개변수 동일하게 맞춰줘야함
			list = (List<Student>) map.get("list");
			stuCount = (int)(map.get("stuCount"));
						
//---리턴타입 연습------------------------------			
//			list=sp.stuInput(list); // 핵심
			//확인차 출력
//			for(int i=0;i<list.size();i++) {
//				System.out.printf("%d %s \n",list.get(i).getName());				
//			}//for
			break;
			
		case 2: // 화면 출력
			//메소드 호출(매개변수 전달)-
			list = sp.stuOutput(list);			
			break;
			
		case 8: // 파일에서 가져오기
			list = sp.stuRead();
			System.out.println("[ 파일 읽어오기가 완료 되었습니다.]\n");
		
			break;
			
		case 9:
			sp.stuSave(list);
			System.out.println("[학생 성적이 입력되었습니다.]");
			System.out.println();
			break;
		}//switch
		}//while
		
	}//main

}//class

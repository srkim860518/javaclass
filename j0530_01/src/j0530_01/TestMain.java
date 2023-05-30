package j0530_01;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// 객체 선언
		TestFile t = new TestFile(); // 객체선언
//		t.fileSave(); // 파일 불러오기 참조변수명.메소드명

		ArrayList<Student> list = new ArrayList();
		list=t.fileRead(); // 파일 읽어오기
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}// main

}// class

package j0526_01;

import java.io.FileWriter;

public class C0526_03 {

	public static void main(String[] args) throws Exception {
		// 
		FileWriter fw = null; // 문자를 저장할 수 있는 객체
		fw =new FileWriter("c:/data/stu.txt");
		
		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		String str = ""; //""=공백, 내용입력됨
		                 // null 입력하면 null이 txt파일 내용에 첫번째 null입력됨
		for(int i=0;i<5;i++) { //for 학번 1001+i= 1001~1005번까지
			str = str + (1001+i)+","+name[i]+",100,100,99 \r\n"; // 점수는 동일하게 입력됨.
		}
		fw.write(str);
		fw.flush();
		fw.close();
		
		System.out.println();
		
		
		
		
	}//main

}//class

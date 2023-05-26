package spjt2;

import java.io.FileWriter;

public class TestFile {

	public static void main(String[] args) {
		// data에 파일 넣기
		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		
		FileWriter fw = null;
		String data = "";
		try {
			fw = new FileWriter("c:/Data/student.txt");
			for(int i=0;i<5;i++) {
				//1001,"홍길동",100,100,99;
				//1002,"유관순:,100,100,90;
				//(Math.random()*10)+91 = 100 --> 0-9까지의 숫자가 나옴, +91을 더함// 최소 : 91, 최대 100				
				int random1 = (int)(Math.random()*10)+1; // 1-100까지의 숫자 국어
				int random2 = (int)(Math.random()*10)+1; // 1-100까지의 숫자 영어
				int random3 = (int)(Math.random()*10)+1; // 1-100까지의 숫자 수학
				//data = ""+(Student.count+1)+","+name[i]; // Student의 static int count : 1000번 
				data = data+String.format("%d,%s,%d,%d,%d, \r\n", (Student.count+1),name[i],random1,random2,random3);
						Student.count++;// 1001번부터 저장
				 
			}//for
			fw.write(data);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}try {
			fw.close();
		} catch (Exception e2) {
			e2.printStackTrace();		
		}
		
		
		
		
		
	}//main

}//class










package spjt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class TestFile3 {
	public static void main(String[] args) {
		BufferedReader br = null;
	try {
		 br = new BufferedReader(new FileReader("c:/Data/student.txt"));//파일을 읽어온다
		while(true) {
			String data = br.readLine();// 한줄씩 읽어옴
			if(data==null) break;
			System.out.println(data); //1001,홍길동, 83,100,90
			String[] dataArr = data.split(",");
			
			int stuNo = Integer.parseInt(dataArr[0]);
			String name = dataArr[1];
//			String kor = dataArr[2];
//			String eng = dataArr[3];
//			String math = dataArr[4];
			//new Student(dataArr[0],dataArr[1],dataArr[2],dataArr[3],dataArr[4]); //
			
			
		}//while 
		br.close();
		
		
	}//try
		catch (Exception e) {
		e.printStackTrace();
	}//catch
  }//main
}//class

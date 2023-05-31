package j0531_01;

import java.util.*;
import java.io.*;
public class C0531_04 {
	public static void main(String[] args) {
	//OutputStream : 파일 저장하기
//		Scanner scan = new Scanner(System.in);
		
		//FileReader : 문자열 읽어오기
		File f = new File("c:/savedata/b.txt");
//		FileReader fr = null;
		BufferedReader br = null;// 1줄씩 데이터를 읽어옴.
		//Filereader - 1byte 단위로 글을 읽어옴.
		try {
			br= new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine(); //1줄을 읽어와서 String에 데이터를 넣음.
				if(line==null)break; // 더이상 데이터가 없으면 종료
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
		
//		FileWriter fw = null;
//		try {
//			 fw = new FileWriter(f);
//			 for(int i = 0 ; i<10;i++) {
//				 String data = i+"번째 줄입니다. \r\n"; // 한 줄씩 넣기
//				 fw.write(data);
//			 }	 		 
//		} catch (Exception e) {//			
//			e.printStackTrace();
//		}
//		finally {
//			
//				try {
//					fw.close();
//				} catch (Exception e) {
//					
//					e.printStackTrace();
//				}
//				 
//		}
//		
		
	}//main

}//class


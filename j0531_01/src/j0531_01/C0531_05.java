package j0531_01;

import java.util.*;
import java.io.*;
public class C0531_05 {
	public static void main(String[] args) {
	//파일쓰기 c.txt
		//FileReader : 문자열 읽어오기

	String str = "파일쓰기를 시작합니다.";
//	File f=new File();
	FileWriter fw = null;
	try {
		fw= new FileWriter("c:/savedata/c.txt");		
		fw.write(str);
		
	}catch(Exception e) {
			e.printStackTrace();
	}finally {
		try {
			fw.close();
		}catch(Exception e2) {
			e2.printStackTrace();
		}//catch
	}	//finally
		
			
		
		
//	BufferedReader br = null;
//	try {
//		br = new BufferedReader(new FileReader("c:/savedata/news.txt"));
//	while(true) {
//		String data= br.readLine(); // 한줄 읽어어와 String에 데이터 넣음
//		if(data==null)break;
//		System.out.println(data);
//	}finally {
//		
//	}try {
//		br.close();
//
//	} catch (Exception e) {		
//		e.printStackTrace();
//	}
//	}
//	
		
	}//main

}//class


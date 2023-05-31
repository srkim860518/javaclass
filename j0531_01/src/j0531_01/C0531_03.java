package j0531_01;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;
public class C0531_03 {
	public static void main(String[] args) {
	//OutputStream : 파일 저장하기
		Scanner scan = new Scanner(System.in);
 // 기본 input, output\r\n
		OutputStream os = null;
//		is=  new FileOutputStream("c:/savedata/a.txt");	
	try {
		os=  new FileOutputStream("c:/savedata/a.txt");	
	System.out.println("원하는 글자를 입력하세요");
//	String str = scan.next();
	String str = "글자를 입력합니다. 안녕하세요\r\n 반갑습니다. 줄단락 하였습니다.\r\n";
	byte[] bs = str.getBytes();
	os.write(bs);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			os.close();		
			
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	System.out.println("파일을 저장했습니다.");

	
	InputStream is = null;	
		// InputStream: 파일 읽어오기, 외부와 접속할 대 try ~catch
		try {
			is = new FileInputStream("c:/savedata/a.txt");
			int i=-1;
			while(true) {
				if((i = is.read())==-1) break; //1byte , //-1 더이상 읽어올 데이터가 없음.
				System.out.println("데이터: "+(char)i);
				
			} //while
		} catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	}//main

}//class


package j0526_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C0526_02 {

//	public static void main(String[] args)  {
		
		
	public static void main(String[] args)  throws Exception{
		// 
//		
//		//File file = new File("C:/data/test.txt"); //파일 생성
//		FileWriter writer = null;
//		File dir = new File("c:/bbb");
//		writer = new FileWriter("c:/bbb/text.txt");//파일을 생성해서 글자를 저장
//		String str = "\"로스앤젤레스=연합뉴스) 임미나 특파원 = 태평양의 섬 괌을 '슈퍼 태풍' 마와르가 강타하면서 현지 공항이 폐쇄되고 단전·단수 사태가 잇달아 한국인 관광객 3천명 이상이 큰 피해를 겪고 있다.\\r\\n\"\r\n";
//
//		writer.write(str);	
//		writer.close();
//		
//		
//		System.out.println("파일이 생성되었습니다.");
//		
//		File file = new File("C:/bbb"); // 디렉토리
//		dir.mkdirs();// 폴더 생성 메소드 
//		System.out.println("폳더를 생성했습니다.");
//		
//		
//		File f = new File("c:bbb/test.txt");
//		try {
//			f.createNewFile();//파일생성 메소드
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일을 생성했습니다.");
		
		//파일을 생성해야만 아래 내용이 진행이 됨.
		
		// try cathch문 
		FileWriter fw = null;
		String str = "";
		try {
			fw = new FileWriter("c:/bbb/test.txt"); // try 캐치문 안에 있으면 지역변수가 됨
			for(int i=0;i<10;i++) {
				str = str + "글자를 저장합니다.\r\n"; // \r\n 맨 끝에서 엔터키를 삽입하라
			}
				fw.write(str); //글자를 저장하는메소드
				fw.flush();// 버터(임시공간)에 있는 모든것을 저장
		} catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("글자가 저장되었습니다.");
		
		
		
	}//main
	
	

}//class

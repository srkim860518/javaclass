package j0530_01;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class TestFile {

	ArrayList<Student> fileRead() throws Exception {
		
		ArrayList<Student> list = new ArrayList();
		BufferedReader br = null;
		// 1줄씩 읽어오는 방식 사용
		br = new BufferedReader(new FileReader("c:/Data/Student.txt"));   
		// 버퍼 리더에 한 줄 씩 가져올 수 있는 이점이 있따.
		// 2byte , 한글자씩 불러옴, 시간 소요됨
//		//FileReader fr = new FileReader("c:Data/Student.txt");
		
		while(true) {
			String Data = br.readLine(); // 한줄씩 읽어옴
			
			if(Data==null) break;// 더이상 읽어올 데이터가 없으면 종료
			System.out.println("Data: "+Data);
			//Studnet.txt파일에서 1줄을 읽어와서 ,로 분리 한 것 : 1.홍길동,100,100,99
			String[] DataArr = Data.split(","); // split할 때 콤마 구분/특정 문자로 구분 // 여기 실수를 많이 하니 주의 하세요
			System.out.println("길이: "+DataArr.length);
			int stuNo = Integer.parseInt(DataArr[0]); //1번이 들어있긴 하나 String 배열, 형변환 해줘야함.stuNo--> int
			String name = DataArr[1];
			int kor = Integer.parseInt(DataArr[2].trim());  // 점수 trim으로 잘라냄
			int eng = Integer.parseInt(DataArr[3].trim());
			int math = Integer.parseInt(DataArr[4].trim());
			
			list.add(new Student(stuNo,name,kor,eng,math)); // list 객체 파일에 저장함.-> DB에 저장 예정

			
		}//while
		br.close(); // 닫지 않으면 
		return list;
	 
	} //arraylist
	
	//저장하기 메소드
	void fileSave() throws Exception{// 저장

		//파일 저장은 try - catch
		FileWriter fw = null; 
		fw =new FileWriter("c:/Data/Student.txt");
		String Data = "1,홍길동,100,100,99";
		 Data += "2,유관순,99,99,98";
		 Data += "3,이순신,98,98,91";
		fw.write(Data);
		fw.flush();// 메모리에 잇는 형태를 버퍼에 저장 속도가 빨라짐
		fw.close(); // 파일이 만듦어짐
		
		System.out.println("파일이 저장되었습니다.");
		
	
	}
	

}//class

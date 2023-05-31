package j0531_01;

import java.util.*;
import java.io.*;

public class C0531_06 {
	public static void main(String[] args) {
		// 파일 읽어오기 BufferedReader - student.txt
		int stuNo=0;
		String name="";
		int kor=0;int eng=0;int math=0;
		Scanner scan = new Scanner(System.in);
		// 출력
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data = "";
			while (true) {
				data = br.readLine();// data = "1,홍길동,100,100,99"; 한줄로 묶여있음
				if (data == null)
					break;
				String[] dataArr = data.split(",");// 1,홍길동, 100, 100, 99데이터를 콤마로 나눠줌
				System.out.println(data);
				stuNo=Integer.parseInt(dataArr[0]);// 정수형을 형변환Integer.parseInt			
				name=dataArr[1];
				kor=Integer.parseInt(dataArr[2]);// total,avg 구하려면 int로 형변환
				eng=Integer.parseInt(dataArr[3]);
				math=Integer.parseInt(dataArr[4]);				
//				list.add(new Student(stuNo,name,kor,eng,math));

			}
		} catch (Exception e) {

		} finally {
			try {
				br.close();
			} catch (Exception e2) {

				e2.printStackTrace();
			}
		}

	}// main

}// class

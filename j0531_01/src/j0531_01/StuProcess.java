package j0531_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor,eng,math;
	int total;
	double avg;
	int rank;
	
	//파일 저장하기
	void stuSave(List<Student> list) {
		String data="";
		for(int i=0;i<list.size();i++) {
			data += String.format("%d,%s,%d,%d,%d\r\n",list.get(i).getStuNo(),list.get(i).getName().trim(),
					list.get(i).getKor(),list.get(
							i).getEng(),list.get(i).getMath());
		}
		
		// 파일 저장하기 -write
//		String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n";
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// student.txt 파일 읽어오기
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			// data ="";
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
			br.close();
			System.out.println("파일 읽어오기 완료!!");

		} catch (Exception e) {

		}
		
	}
	
	//파일 읽어오기=불러오기
	List<Student> stuRead(){
		List<Student> list = new ArrayList<>();
		//불러오기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data = "";
			while (true) {
				data = br.readLine();// data = "1,홍길동,100,100,99"; 한줄로 묶여있음
				if (data == null)
					break;
				String[] dataArr = data.split(",");// 1,홍길동, 100, 100, 99데이터를 콤마로 나눠줌

//				System.out.println(data);
				stuNo=Integer.parseInt(dataArr[0]);// 정수형을 형변환Integer.parseInt			
				name=dataArr[1];
				kor=Integer.parseInt(dataArr[2]);// total,avg 구하려면 int로 형변환
				eng=Integer.parseInt(dataArr[3]);
				math=Integer.parseInt(dataArr[4]);
				list.add(new Student(stuNo,name,kor,eng,math));

			}
		} catch (Exception e) {

		} finally {
			try {
				br.close();
			} catch (Exception e2) {

				e2.printStackTrace();
			}
		}
		
		//읽어오기
		
		return list;
	}

	//리턴타입 메소드명
	List<Student> stuOutput(List<Student> list) {
	
		// 목차
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		//출력
		System.out.println("[ 학생성적 출력화면 ]");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);				
		
		//출력 - 값
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d\t  %s\t %d\t %d\t %d\t %d\t %.2f\t %d \n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());				
		}//for
		System.out.println();
		return list;
	}// stuOutput
	
	
	
	
	//리턴타입 메소드명
	Map<String, Object> stuInput(List<Student> list,int stuCount) {
		while(true) {
		System.out.println("[ 학생성적 입력 ]");
		System.out.println(stuCount+"번째 이름을 입력하세요.(0번을 누르면 처음으로 이동)");
		//count를 안쓰는 이유: 초기화 불러오기 사용 안함.
		name = scan.next();
		if(name.equals("0")) { // 네임이 같은지 확인 string 타입임으로 부등호 사용 불가 -> 형변환 equals("0" string 큰따옴표)
			System.out.println("이전 페이지 이동하세요");
			System.out.println();//줄바꿈
		break;
		} //if
//		System.out.println("이름을 입력하세요");
//		name =scan.next();
		System.out.println("국어점수를 입력하세요");
		kor =scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng =scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math=scan.nextInt();
//		list.add(new Student(3,"이순신",90,90,89));
		list.add(new Student(stuCount,name,kor,eng,math));
		
	stuCount++;
	}//while
		System.out.println();
		// 보내야할게 list, stuCount를 보내야함, 둘 중에 하나만 보내지니 Map으로
		Map<String, Object> map = new HashMap();

		map.put("list",list); // list = list
		map.put("stuCount",stuCount); // stuCount = 

		return map; // map 안에 list, stuCount가 있음
	}//메소드
	

//---리턴타입 연습---------------------------------------------	
	//리턴타입 메소드명
//	List<Student> stuInput(List<Student> list) {
//		System.out.println("[ stuInput 메소드가 호출 ]");
////		list.get(0);
////		System.out.println(list.get(0).getName());
//		list.add(new Student(3,"이순신",90,90,89));
//		
//		return list;
//	}
		
}//class

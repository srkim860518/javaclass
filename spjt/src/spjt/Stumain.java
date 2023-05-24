package spjt;

import java.util.ArrayList;
import java.util.Scanner;

public class Stumain {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Stumain stumain = new Stumain(); // static을 쓰면 이렇게 써야함.
		
		int choice = 0;

		String searchName="";// 학생이름검색
		String name=""; //클래스 변수 객체 선언없이 클래스명.변수명
		int chk = 0; // 검색시 없을 경우 사용
		int kor=0;int eng=0;int math=0;
		ArrayList<Student> list = new ArrayList<>();
//		Student[] s = new Student[10]; // 배열선언, 공간 10개
		//s[0] = new Student(); // 객체선언
				
		//무한반복
		while(true) {
			System.out.println("[학생성적 처리 프로그램");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 내림차순 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("======================");
			System.out.println("원하는 번호를 입력하세요.");
			System.out.println();
			choice = scan.nextInt();
			//프로그램 종료확인
			if(choice==0) {
				System.out.println("[프로그램을 종료합니다.]");
				System.out.println();
				break;
			} //if
			
			switch(choice) {
			case 1:// 성적 입력
				stuInput(list);
				break;
			case 2: //성적출력
				stuOutput(list);
				break;
			case 3: //성적수정
				System.out.println("수정할 학생 이름을 입력하세요.");
				searchName = scan.next();
				chk = 0; // 검색 초기화
				for(int i=0;i<list.size();i++) {
					Student s = list.get(i);
					if(s.getName().equals(searchName));//  object의 equals  
					System.out.println("[학생이 검색되었습니다.]");
					System.out.println("수정할 과목을 선택하세요.");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("=============");
					System.out.println("번호를 입력하세요");
					choice = scan.nextInt();
					
					switch(choice) {
					
					//title[] 학번-0, 이름-1, 국어-2, 영어-3, 수학-4, 합계-5, 평균-6 등수-7
					case 1: // 국어 수정
						System.out.printf("[현재 %s점수: %d]\n",Student.title[choice+1], s.getKor());
						System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
						s.setKor(scan.nextInt());// 국어점수 저장
						
						
						break;
					case 2:// 수학 수정
						System.out.printf("[현재 %s점수: %d]\n",Student.title[choice+1], s.getEng());
						System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
						s.setEng(scan.nextInt());// 영어점수 저장										
						break;
					case 3://영어 수정
						System.out.printf("[현재 %s점수: %d]\n",Student.title[choice+1], s.getMath());
						System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
						s.setMath(scan.nextInt());// 수학점수 저장										
						break;
						
					}//switch
					
					// 공통이라 뒤에 빼냄, 중복되는 것은 최대한 한 번만 사용하는게 좋은 프로그램
					s.setTotal(s.getKor()+s.getEng()+s.getMath());
					s.setAvg(s.getTotal()/3.0);
					System.out.printf("[점수가 수정되었습니다.]\n", Student.title[choice+1]);
					System.out.println();		
					
					 chk =1;// 1개가 1개라도 있을 경우 
					
				} //for

			} //switch
			if(chk==0) { // 
				System.out.println("[찾고자 하는 학생이 없습니다. 다시 입력하세요]");
				System.out.println();
			}

		} //while
	} //main

	//다른 메소드 선언 - case 2: 학생성적 출력
	static void stuOutput(ArrayList<Student> list) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
				Student.title[0],Student.title[1],Student.title[2],Student.title[3],
				Student.title[4],Student.title[5],Student.title[6],Student.title[7]);
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<list.size();i++) { //학생수
			//학번,이름,국어,영어,수학,합계,평균,등수
			Student s= list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					list.get(i).getStuNo(),s.getName(),s.getKor(),s.getEng(),
							s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
		
		
	}//stuOutput
	
	
	


// 다른 메소드 선언-리턴타입, 메소드명(매개변수{ }
static void stuInput(ArrayList<Student>list){ //
	//학생입력
	
	String name = "";
	int kor=0;int eng =0;int math=0;
			
	for(int i=list.size();;i++) {// 중간에 나오기위해 i=count
		System.out.println((i+1)+"번째 이름을 입력해주세요.(0.이전 페이지 이동)");
		name = scan.next();
		//이전페이지 이동확인
		if(name.equals("0")){
			System.out.println("[이전페이지로 이동합니다.]");
			System.out.println();
			break;
			
		}//if
			
		System.out.println("국어점수를 입력해주세요");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력해주세요");
		math = scan.nextInt();
		list.add(new Student(name,kor,eng,math));
//		count++;//// 중간에 나오기위해 count++
	}//for
	System.out.println();


//	return count;
}//stuinput

}//class

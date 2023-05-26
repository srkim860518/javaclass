package j0526_01;

public class C0526_10 {

	public static void main(String[] args) {
		// Student 클래스 적용
		String data1 = "1001,홍길동,100,100,99";
		//배열로 담아 출력하시오
//		String[] data2 = new String[5];
		String[] result = data1.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);
		System.out.println("--------------------");
		//String문자열을 int로 변환(integer.= 인티저 parseInt : integer로 변형해줘 .result[0] = 객체 배열 
		int stuNo = Integer.parseInt(result[0]); //inteser를 parseInt로 
		String name = result[1];
		int kor = Integer.parseInt(result[2]);  // 타입을 바꾸지 않으면 에러가남
		int eng = Integer.parseInt(result[3]);
		int math = Integer.parseInt(result[4]);
	
//		Double.praseDouble(result[2]); //객체를 인티저 타입으로 변경 
//		Long.parseLong(result[3]);
	
//			
//		for(int i = 0; i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		Student s = new Student(stuNo, name, kor,eng,math);
		//total,avg 출력
		System.out.println(s.getTotal());
		System.out.println(s.getAvg());
		
		// 체크 , 라디오 박스만들기
		String[] chk_info = new String[3]; // db는 1개의 파일만 들어갈 수있으므로 하나로 합쳐야한다.
		chk_info[0] = "HTML";
		chk_info[1] = "CSS";
		chk_info[2] = "webDesign";
		// 파일은 복수로 불가, 묶어서 보낼 수 있음 
		String info3="";
		for (int i= 0; i<chk_info.length;i++) {
			if(i==0) info3 = info3+chk_info[i];				
			else info3 = info3+","+chk_info[i];
		}//for
		
		System.out.println(info3);
		
		
		String info1 = chk_info[0]+"."+chk_info[1]+","+chk_info[2];
//		String info2 = "HTML,CSS,webDesign";

	}

}


























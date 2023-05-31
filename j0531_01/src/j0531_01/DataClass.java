package j0531_01;
import java.util.*;
public class DataClass {
	int numAdd(int num1, int num2) {
//		//변수 선언 없이는 C0531_08의 변수명은 사용 불가, 변수 선언을 하거나 값만 받으면 됨.
		System.out.println("더하기");
		int sum = num1+num2;
		
		return sum;// 리턴 sum을 쓰게 되면 void numAdd()를-> sum의 타입인 int를 맞춰 줘야함.
	
	}
	
	Student stuAdd(int kor, int eng, int math) {
		System.out.println("학생성적추가");
		int stuNo = 1;
		String name = "홍길동";
		Student s = new Student(stuNo,name,kor,eng,math); // 객체선언
		
		return s;// 리턴할때 void stuAdd()--> tyPe:Student로 변경
	
	}
	List<Student> stuList() {  // type:List<Student>  아래줄 참고
		List<Student> list = new ArrayList<>();
//		ArrayList<Student> list = new ArrayList<>();// 이렇게 사용해도 됨
	
		list.add(new Student(1,"홍길동",100,100,100));
		list.add(new Student(2,"유관순",90,90,90));
	
		return list;
	}
	
	
	
	
	
	
}//class

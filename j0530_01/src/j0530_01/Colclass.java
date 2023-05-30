package j0530_01;
import java.util.*;

public class Colclass {
	//여기 있는 데이터를 클래스에 넘겨 주려고 한다.
	
	Map<String, Object> execute(){
		Map<String, Object> map = new HashMap<>();
		
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student());
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,98,99));
		list.add(new Student(3,"이순신",90,91,90));
		list.add(new Student(4,"강감찬",90,91,90));
		list.add(new Student(5,"김구", 90,91,90));
		list.add(new Student(6,"홍길순",90,91,90));
		list.add(new Student(7,"홍길자",90,91,90));
		list.add(new Student(8,"김유신",90,91,90));
		list.add(new Student(9,"김유순",90,91,90));
		list.add(new Student(10,"김유자",90,91,90));
		

		int nowPage = 3;
		int startRow  = 21;
		int endRow = 30;
		
		// 복수개로 보낼 때 
		map.put("list", list); // 리스트 안에는 10명의 정보가 들어가 있음
		map.put("nowPage",nowPage);
		map.put("startRow",startRow);
		map.put("endRow", endRow);
		
		return map; // 중용  map의 정보(list,nowpage, stratrow, endrow)를 리턴, 다른 클래스로 보낼 수 있음 리턴 필수 
	}
	
	
}//class

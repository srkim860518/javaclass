package j0530_01;
import java.util.*;
public class ColClass4 {

	//list, nowPage=1, startRow=1, endRow=1
	//execute4()
	//map<String,Object> map
	
	//map리턴하시오.
	Map<String, Object> execute4(){
		Map<String, Object> map = new HashMap(); //map 공간 선언
		
		ArrayList<Student> list = new ArrayList();		
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

		int nowPage = 1;
		int startRow=1;
		int endRow=1;
		
		map.put("nowPaage", nowPage); // put map 공간 선언 한 것이 비어있으니 리스트를 map에 넣기
		map.put("StartRow",startRow);//map의 저장방법 (키:"nowPaage", 값:nowPage)
		map.put("endRow",endRow);
		
		return map;

	}
	
	
	
}//class

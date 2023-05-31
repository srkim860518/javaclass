package j0531_01;

import java.util.*;
import java.io.*;

public class C0531_08 {
	public static void main(String[] args) {
		//객체선언
		DataClass d = new DataClass();
		int num1 = 10;
		int num2 = 5;
		d.numAdd(num1,num2);
		int sum  = d.numAdd(num1, num2); // 리턴 받은 것
		System.out.println(sum*2);// sum의 두배를 출력
		
		int kor = 100;
		int eng = 100;
		int math= 99;
	
		
		d.stuAdd(kor,eng,math);
//		d.stuAdd(100,100,99);이렇게 보내줘도 됨, 값이 변경되면 변경 값을 직접 입력해줘야함
		
		Student s= d.stuAdd(kor, eng, math);
		System.out.println("합계: "+s.getTotal());
		
		d.stuList();
		//학번과 이름을 출력하시오
		List<Student> list = d.stuList();
		for(int i=0;i<list.size();i++) {				
			System.out.printf("%d %s %d %d %d\n",list.get(i).getStuNo(),list.get(i).getName(),
					list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath());
			
			
	
			
		}
	}// main

}// class

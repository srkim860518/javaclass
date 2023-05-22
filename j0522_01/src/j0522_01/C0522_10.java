package j0522_01;


public class C0522_10 {
	public static void main(String[] args) {
//    //Student.java class 불러와 객체 선언
//		String str = String.format("%04d", 1); // 0이들어오면 자리수 4개를 만들어라
////		String str = String.format("%,10d",1000000); // 
//		System.out.println(str);
//		 
		Student s1 = new Student();
		System.out.println("s1: "+s1.stuNo);
		
		Student s2 = new Student();
		System.out.println("s2: "+s2.stuNo);
		
		Student s3 = new Student();
		System.out.println("s3: "+s3.stuNo);
		
		Student s4 = new Student();
		System.out.println("s4: "+s4.stuNo);
		
		Student s6 = new Student("홍길동",100,100,100);
		System.out.println("s6: "+s6.stuNo);
		
		System.out.println("s6: "+s6.total);
		System.out.println("s6: "+s6.avg);
		
 }//main
}//class

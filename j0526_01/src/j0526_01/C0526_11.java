package j0526_01;

public class C0526_11 {

	public static void main(String[] args) {
		// 
		
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr/.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology/.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756";
		
		
		String result1 = lotto.substring(2); //2번부터 끝까지 잘라오기
		System.out.println("lotto : "+result1);
		
		String result2 = lotto.substring(3,6); // 3번부터 6번 앞에까지 잘라오기
		System.out.println("test : "+result2);
	
		String result3 = str2.substring(36);
//		int n1 = str2.indexOf("/d");
//		int n2 = str2.indexOf("jsp");
//		String result3 = str2.substring(n1+1,n2+3); // n1+1= n1(/d+1번째부터,n2+3(검색한 jsp+3 j인 1번째부터  3번째까지  
		System.out.println("str2: "+result3);
		
		String result4 = str3.substring(36,45);
		System.out.println("str3: "+result4);

		
	 
	}

}

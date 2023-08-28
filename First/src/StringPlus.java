
public class StringPlus {

	public static void main(String[] args) {
	
		int v1 = 10; // int v1 = 10, v2=20;
		int v2 = 20;
		
		int res = v1+v2;
		System.out.println(res);
		
		String str1 = "abc";
		String str2 = "def";
		String sres = str1+str2;
		System.out.println(sres);
		
		
		System.out.println(str1+res);

		String seven1 = "7";
		char seven2 = '7';
        int seven3 = 7;
		
        System.out.println(seven1 +seven2 +seven3);
        System.out.println(seven2+seven3+seven1);//seven1이 더해질때 seven2와3이 더해진값이 문자열로 바뀐다
	    System.out.println(7+7+"7");
	    
	    
	}

}


public class StringTest1 {

	public static void main(String[] args) {
	String a ="a";
	a = "b";
	
	int n =10;
	n=20;
	
	String s1 =null;
	String s2 = "";
	char c='a';
	
	String s3 = new String("abc");
	char[] carr= {'a','b','c'};
	String s4 = new String(carr);
	System.out.println(s3);
	System.out.println(s4);
	StringBuffer sb = new StringBuffer("abc");
	String s5 = new String(sb);
	System.out.println(s5);
	
	String bs="hello";
	String cs = bs.concat("world");
	System.out.println(bs);
	System.out.println(cs);
	System.out.println(bs);
	System.out.println(cs.contains("hello"));
	String filename ="test.txt";
	System.out.println(filename.endsWith("hwp"));
	String[]files = {"test.txt", "temp.hwp","backup.txt"};
	for(int i=0; i<files.length; i++) {
		if(files[i].endsWith("txt")) {
			System.out.println(files[i]);
		}
	}
	

	}

}

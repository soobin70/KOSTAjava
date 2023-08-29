package ex9;

public class Ex9 {
	static String delChar(String src, String delCh) {
		StringBuffer arr = new StringBuffer(src.length());
		for(int i=0; i<src.length(); i++) {
			char a=src.charAt(i);
			if(delCh.indexOf(a)==-1) {
				arr.append(a);
			}
		}return arr.toString();
	 }


	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " 
	                                        + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " 
	                                       + delChar("(1 2 3 4\t5)", " \t"));

	}

}

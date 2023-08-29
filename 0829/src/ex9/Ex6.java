package ex9;

public class Ex6 {
	public static String fillZero(String src, int length) {
		//1
		if (src == null || src.length() == length)
			return src;
		//2
		if (length <= 0)
			return "";
		//3
		if (src.length() > length)
			return src.substring(0, length);
		//4
		char[] carr = new char[length];
		//5
		for(int i=0; i<carr.length; i++) carr[i]='0';
		//6
		System.arraycopy(src.toCharArray(),0,carr,length-src.length(),src.length());
		//7
		return new String(carr);
	}
//0000000123 앞에 0이 채워짐
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));

	}

}

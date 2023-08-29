package ex9;

public class Ex10 {
	static String format (String str, int length, int alignment) {
		if(length<str.length()) {
			return str.substring(length);
		}
		else {
			char[] arr = new char[length];
			for(int i=0; i<arr.length; i++) {
				arr[i] = ' ';
			}	
			System.arraycopy(str.toCharArray(), 0, arr, alignment, str.length());
			return String.valueOf(arr);
		 }
	}

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬

	}

}

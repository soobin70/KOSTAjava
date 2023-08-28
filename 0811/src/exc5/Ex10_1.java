package exc5;

public class Ex10_1 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String result = "`~!wer";
		String src = "";

		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			//int idx=-1; 0으로 초기화 찾아냈는지 여부 확인?
			

			if (ch >= 'a' && ch <= 'z') {
				for (int j = 0; j < numCode.length; j++) {
					if (ch == numCode[j]) {
						src += j;
					}
				}

			} else {
				for (int k = 0; k < abcCode.length; k++) {
					if (ch == abcCode[k]) {
						src += (char)(k + 'a');
					}
				}
			}
		}

		System.out.println("result:" + result);
		System.out.println("src:" + src);

	}

}

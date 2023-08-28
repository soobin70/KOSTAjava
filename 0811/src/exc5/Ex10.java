package exc5;

public class Ex10 {

	public static void main(String[] args) {
		char[] abcCode = 
			 { '`','~','!','@','#','$','%','^','&','*',
			 '(',')','-','_','+','=','|','[',']','{',
			 '}',';',':',',','.','/'};
			 // 0 1 2 3 4 5 6 7 8 9 
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = "";
			 // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
			
//			'a' => '`' : abcCode['a'-'a']
//			'f' => '$' : abcCode['f'-'a']
//			'5' => 'y': numCode['5'-'0']
			
			for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			// 문자랑 숫자 암호화 방법이 달라서 if사용
			if(ch>='0'&&ch<='9') { //만약 ch가 0보다크거나 같고 9보다 작거나 같을때
				result += numCode[ch-'0']; //result를 numCode로 바꾼다 
			}else { // 그외에는 
				result += abcCode[ch-'a']; //'a'를 빼는 이유 : abcCode[0] : abcCode['a'-'a'] == avcCode[97-97]==abcCode[0]
			}                                             //abcCode[1] : abcCode['b'-'a'] == avcCode[98-97]==abcCode[1]
		}
			
			System.out.println("src:"+src);
			System.out.println("result:"+result);

	}

}

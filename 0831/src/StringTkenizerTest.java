import java.util.StringTokenizer;

public class StringTkenizerTest {

	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("apple banana orange");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		StringTokenizer st = new StringTokenizer("apple#banana$orange","#$");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());


	}

}

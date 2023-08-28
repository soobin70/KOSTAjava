import java.util.Scanner;

/*
 * 입력 데이터 수 : 5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 60 70 85 95 100
 */
public class ArrayTest14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 데이터 수:");
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();

		}

	}

}

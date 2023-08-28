import java.util.Scanner;

/*
 * 입력 데이터 수:5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 최소값 : 60
 * 최대값:100
 */
public class ArrayTest16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];
		
		for (int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
			
		}
		int min = arr[0];
		int max = arr[0];
		
		for (int i=0; i<cnt; i++) {
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
		}
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		
		

	}

}

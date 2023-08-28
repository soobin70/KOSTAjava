import java.util.Scanner;

public class ArrayTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();
		int arr[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = 0; j < arr.length-1; j++) {
				temp = arr[j];
				arr[j] =arr[j+1];
				arr[j+1]=temp;

			}

		}
	

	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}}

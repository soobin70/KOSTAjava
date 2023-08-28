package exc;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count =0;
		
		Scanner s = new Scanner(System.in);
		do {
			if(count==0) {
			System.out.print("1과 100사이의 값을 입력하세요:");
			}else {
				if(input>answer) {
					System.out.print("입력한 값보다 작습니다:");
				}
				else {
					System.out.print("입력한 값보다 큽니다:");
				}
			}
			count++;
			input = s.nextInt();
			if(answer==input) {
				System.out.println("맞췄습니다.\n 시도횟수는"+count+"입니다.");
				break;
			}
		} while(true);
	}

}

package exc5;

public class Ex9 {

	public static void main(String[] args) {
		char[][] star = {
				{'*',' ',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
				}; // 4*5
				char[][] result = new char[star[0].length][star.length]; // 열의 개수만큼 행을 잡음 5*4
				for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
				}
				System.out.println();
				}
				System.out.println();
				for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
				     result[j][3-i] = star[i][j];
				}
				}
				for(int i=0; i < result.length;i++) {
				for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
				}
				System.out.println();
				}
				 

				}
			
	}

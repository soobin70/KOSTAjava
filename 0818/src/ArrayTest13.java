
/*
 * 규칙은 첫 번째 행은 모두 1로 초기화 하고 다음 행부터는 바로 위의 값과 바로 왼쪽 값을 더한것이다
 * 1 1 1 1 1
 * 1 2 3 4 5
 * 1 3 6 10 15
 * 1 4 10 20 35
 * 1 5 15 35 70
 */
public class ArrayTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열 생성 int 5X6
		int[][] matrix = new int[5][6];
		// 2. 첫 행을 1로 초기화
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[0][i] = 1;
		}
		
		 
		for (int j = 1; j < matrix[1].length; j++) {
			matrix[1][j] = matrix[0][j] + matrix[1][j - 1];
		}
		for (int j = 1; j < matrix[2].length; j++) {
			matrix[2][j] = matrix[1][j] + matrix[2][j - 1];
		}
		for (int j = 1; j < matrix[3].length; j++) {
			matrix[3][j] = matrix[2][j] + matrix[3][j - 1];
		}
		for (int j = 1; j < matrix[4].length; j++) {
			matrix[4][j] = matrix[3][j] + matrix[4][j - 1];
		}

	}

}

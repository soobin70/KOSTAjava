import java.util.Scanner;

// 학생 3명의 국어, 영어, 수학 점수를 입력받아 학생별 총점과 과목별 합계를
//아래와 같이 출력하는 프로그램을 작성하시오.
/*입력
 * <<1번째 학생의 점수>
 * 국어:95
 * 영어:100
 * 수학 :88
 * <2번째 학생의 점수>
 * 국어:85
 * 영어 : 60
 * 수학:93
 * <3번째 학생의 점수>
 * 국어:66
 * 영어:99
 * 수학:88
 */
/*출력
 *     국어 영어 수학 총점
 * 1번  95 100  88  283
 * 2번  85  60  93  238
 * 3번  66  99  88  253
 * 평균  82  86  89 
 */
public class ArrayTest12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = {"국어", "영어","수학"};
		int[][] score = new int[4][4];
		for (int i=0; i<score.length-1; i++) {
			System.out.println("<"+(i+1)+"번째 학생 점수 입력>");
			for(int j=0; j<score[i].length-1; j++) {
				System.out.print(subject[j]+":");
				score[i][j] = sc.nextInt();
				score[i][score[i].length-1] += score[i][j];
				score[score.length-1][j] += score[i][j];
				
			}
		}
		
			for(int i=0; i<score[0].length-1; i++) {
		       score[score.length-1][i]/=3;
			
				}
		System.out.println("\t국어\t영어\t수학\t총점");
		for(int i=0; i<score.length-1; i++) {
			System.out.print(i+1+"번\t");
			for(int j=0; j<score[i].length; j++) {
				if(score[i][j]!=0) {
					System.out.print(score[i][j]);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		//내가 쓴 에러난 코딩들
		//		Scanner sc = new Scanner(System.in);
//		int[][] test = new int [3][3];
//		int num =0;
//		int[][] result = new int[test.length+1][test[0].length+1]; // 새로운 배열 늘려줌
//		for (int i=0; i<test.length; i++) { //행의 갯수만큼 반복
//			for(int j=0; j<test[i].length; j++) { //열의 갯수만큼 반복
//				num = sc.nextInt();
//				test = [num]++;
//				result[i][j] = test[i][j];
//				result[i][result[i].length-1] += test[i][j]; //마지막 열에 누적
//				result[result.length-1][j] += test[i][j]; //마지막 행에 누적
//				result[result.length-1][result[i].length-1] += test[i][j]; //마지막 행열에 누적 
//					
//			}
//						
//		}	
//		for(int i=0; i<result.length;i++) {
//			for(int j =0; j<result[i].length; j++) {
//				System.out.print(result[i][j]+"\t");
//				
//			}
//			System.out.println();
//		}
//			
//
//	}
//
//	}
	}
}

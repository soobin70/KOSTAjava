package ex6;

public class Ex6 {
	//제곱근계산 Math.sqrt
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y)); //(두 점사이의 거리)²=(두 점의 x좌표의 차)²+(y좌표의 차)²

	}

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));

	}

}

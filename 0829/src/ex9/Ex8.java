package ex9;

public class Ex8 {
	static double round(double d, int n){
		//난 바보야ㅡㅡㅡ
		double p= Math.pow(10, n);
		return Math.round(d*p)/p;
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1)); 
		// Math.round(3.1415*Math.pow(10^1))/10.0
		System.out.println(round(3.1415, 2));
		// Math.round(3.1415*Math.pow(10^2))/10.0
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}

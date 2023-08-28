
public class ArrayTest1 {

	public static void main(String[] args) {
		int [] narr1=new int[5]; //배열의 각 요소는 0으로 자동 초기화 된다
		double[] darr1 = new double[5];
		
		
		int[] narr2;
		narr2 = new int[10];
		
		
		narr1[0] =1;
		narr1[1]=2;
		narr1[2]=3;
		narr1[3]=4;
		narr1[4]=5;
		
		int sum =0;
		for(int i=0; i<narr1.length; i++) {
			sum+=narr1[i];
		}
		System.out.println(sum);
		
	}

}

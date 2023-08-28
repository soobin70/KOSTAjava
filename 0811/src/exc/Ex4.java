package exc;

public class Ex4 {

	public static void main(String[] args) {
		int sum =0, i;
		for(i=1;;i++) {
			if(i%2==0)sum+=-i;
			else sum+=i;
			if(sum>=100)break;
			
		}System.out.println("sum:"+sum+", i:"+i);

	}

}

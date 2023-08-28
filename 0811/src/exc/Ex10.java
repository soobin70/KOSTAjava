package exc;

public class Ex10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum =0;
		
	//	sum += num%10; //5
	//	num /= 10;   //1234
		
		while(true) { //반복
			
			if(num==0) break;
			sum += num%10; 
			num /= 10;   
		
	}
		
		
		
		System.out.println("sum="+sum);

	}

}

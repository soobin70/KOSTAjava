import java.io.IOException;

public class ExceptionTest6 {
	static void method1() throws IOException, Exception{//호출한 메소드한테 두 예외처리를 위임
		boolean flag = false;
		if(flag) {
		throw new IOException("입출력 예외");
	}else{
		throw new Exception("모든 예외");
	}
	}
	public static void main(String[] args) {
		try{
			method1();
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	} 

}

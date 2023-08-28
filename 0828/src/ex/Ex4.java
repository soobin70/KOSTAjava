package ex;

class NumberException extends RuntimeException {

}

class InvalidNumberException extends NumberException {

}

class NotANumberException extends NumberException {

}

public class Ex4 {

	static void method() throws InvalidNumberException, NotANumberException {
	}

	public static void main(String[] args) {

		try {
			method();
		} catch (NumberException e) {
		} catch (Exception e) {
		}
	}

}

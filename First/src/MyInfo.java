
public class MyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름을 저장할 변수 선언하여 본인이름 할당
		// 나이를 저장할 변수 선언하여 본인나이 할당
		// 키를 저장할 변수 선언하여 본인 키 소숫점까지 할당
		// 남여 구분을 저장할 변수를 선언하여 본인 성별 할당 'F
		String name = "조수빈";
		int age = 24;
		float height = 159.1f;
		double height1 = 178.1;
		char gender = 'F';
		System.out.println(String.format("%s. %d, %f, %c", name, age, height, gender));
		
		
	}

}

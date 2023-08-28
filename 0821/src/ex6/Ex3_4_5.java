package ex6;
class Student{
	String name; // 학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		float avg =  (float)getTotal()/3;
		//75.545 => 76
		//75.545*10=>755.45=> 755(round)/10.0=>75.5
		return Math.round(avg*10)/10.0f; //소숫점첫째자리까지 반올림
	}
	String info(){
		 //내가 썼는데 틀린거ㅓㅓㅓㅓ//return String.format("이름%s,반%d, 번호%d,국어점수%d, 영어점수%d, 수학점수%d", name,ban,no,kor,eng,math);
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	
	}
}
public class Ex3_4_5 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
		System.out.println(s.info());

	}

}

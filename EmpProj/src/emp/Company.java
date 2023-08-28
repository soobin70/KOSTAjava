package emp;

public class Company {
	 Employee[] emps = new Employee[100];
	 int empCnt=0;
	public void enter(Employee emp) {
		emps[empCnt++]=emp;
		
	}
	public void allEmployeeInfo() {
		for(int i=0; i<empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}
	public int getTotalPay() {
		int tot=0; 
		for(int i=0; i<empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}
	 public void reBusinessTrip(IBusinessTrip emp,int day) {
		emp.goBusinessTrip(day);
		 
	}

	

}
/*
 * 사번:1001, 이름:상부상조, 급여:5000000
 * 사번:1002, 이름:자바조, 급여:5600000
 * 사번:1003, 이름:커피조, 급여:5520000
 * 총급여액 : 1612000
*/

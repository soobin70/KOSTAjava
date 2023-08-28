class Account{
	String id;
	String name;
	int balance;
	
	Account(String id, String name, int balance){
		this.id= id; // 인스턴스변수라고 지정 this 생략 불가
		this.name=name;
		this.balance= balance;
	}
	String info() {
		return "계좌번호: "+this.id+",이름:"+this.name+",잔액"+this.balance;
		//this생략 가능
	}

}
public class ThisTest1 {

	public static void main(String[] args) {
		Account acc1 = new Account("10001","홍길동",100000);


	}

}

package acc;


public class Account {

		String id;
		String name;
		int balance;
		Account(){}
		public Account(String aid, String aname, int money){
			id=aid;
			name=aname;
			balance=money;
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public String info(){
		//틀림,,,	//return  "계좌번호 : " + id +", 이름 : " +name+", 잔액:"+balance;
		      return String.format("계좌번호:%s, 이름:%s , 잔액: %d", id, name, balance);
		}
		public void deposit(int money) {
			balance += money;
		}
		public void withdraw(int money) {
			if(balance>=money) {
				balance-=money;
			}
		}
}
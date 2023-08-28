import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];
	 int accCnt;
	Scanner sc = new Scanner(System.in);
	
	
	
	int menu() throws Exception {
		System.out.println("[코스타 은행]");
		System.out.println("1.계좌설정");
		System.out.println("2. 입금");		
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.println("선택>>");			
		int sel =0;
//		try {
			return Integer.parseInt(sc.nextLine());
//		}catch(NumberFormatException e){}
//		return sel;
	}
	void selAccMEnu() {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel==1) makeAccount();
		else makeSpecialAccount();
	}
	void makeAccount() {
		System.out.println("[일반계좌 개설]");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc!=null) {
			System.out.println("계좌번호가 중복됩니다");
			return;
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("입금액:");
		
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++]= new Account(id, name, money);
		
	}
	void makeSpecialAccount() {
		System.out.println("[특수계좌 개설]");
		System.out.println("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc!=null) {
			System.out.println("계좌번호가 중복됩니다");
			return;
		}
		System.out.print("이름");
		String name = sc.nextLine();
		System.out.print("입금액");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,  Gold-G, Silver-S,Normal-N):");
		String grade = sc.nextLine();
		
		accs[accCnt++]=new SpecialAccount(id, name, money, grade);
	}
	 Account searchAccById(String id) {
		 for(int i=0; i<accCnt; i++) {
			 if(accs[i].getId().equals(id) ) {
				 return accs[i];
			 }
		 }
		 return null;
	 }
	void deposit() {
		System.out.println("[입금]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		System.out.print("입금액");
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다");
			return;
		}
		System.out.print("입금액");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}
	void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다");
			return;
		}
		System.out.print("출금액");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}
	void accountInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다");
			return;
		}
		System.out.println(acc.info());
		
	}
	void allAccountInfo() {
		for (int i=0; i<accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		int sel;
		while(true) {
			try {
			sel = bank.menu();
			if(sel==0)break;
			switch(sel) {
			
			case 1: bank.selAccMEnu(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.accountInfo(); break;
			case 5: bank.allAccountInfo(); break;
			
		
			}
		}catch(Exception e) {
			System.out.println("입력 형식이 맞지 않습니다. 다시 선택하세요.");
		}

		}}

}

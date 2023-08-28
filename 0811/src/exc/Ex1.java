package exc;

public class Ex1 {
//1.
	public static void main(String[] args) {
	int x = 10;
	if(x>10&&x<20) {}
//2.
	char ch = 'A';
	if(ch!=' '&&ch!='\t') {}
//3.
	if(ch=='x'||ch=='X') {}
//4.
	if('0'<=ch&&ch<='9') {}
//5.
	if(ch>='A'&&ch<='Z'|| ch>='a'&&ch<='z') {}
//6.
	int year = 2023;
	if(year%400==0||year%4==0&&year%100!=0){}
//7.
	boolean powerOn = false;
	if(powerOn==false) {}
	if(!powerOn) {}
//8.
	String str = "no";
	if(str .equals("yes")) {}
	if(str=="yes") {}
	}
}

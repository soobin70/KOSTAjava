package emp;

public class PartTime extends Employee implements IBusinessTrip{
	int time;
	int payPerTime;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	public PartTime() {}
	public PartTime(int id, String name, int time,int payPerTime) {
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}
	public int getPay() {
		return getTime()*getPayPerTime();
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"급여:"+getPay();
	}
	@Override
	public void goBusinessTrip(int day) {
		setTime(getTime()+(day*24));
	}

}

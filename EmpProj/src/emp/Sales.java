package emp;

public class Sales extends Permanent implements IBusinessTrip {
	int incentive;
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	public Sales() {}
	public Sales(int id, String name, int salary,int bonus) {
		super(id, name, salary);
		this.incentive = incentive;
	}
	@Override
	public int getPay() {
		return super.getPay()+getIncentive();
	}

	@Override
	public void goBusinessTrip(int day) {
		setIncentive(getIncentive()+300000*day);
		
	}

}

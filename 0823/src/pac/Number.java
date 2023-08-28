package pac;

public class Number{
	private int pnum;
	private void pmethod() {
		pnum =10;
	}
	int dnum;//default
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum=dnum;
	}
	public void dmethod() {
		System.out.println(pnum);
	} //default
	public int punum;
	public void pumethod() {
		System.out.println(pnum);
	}
	
	protected int prnum;
	public void premethod() {}
}
package dto;

public class Team {
	//컬럼명이랑 같아야 좋음
	private Integer num;
	private String name;
	private String local;
	public Team() {}
	public Team(Integer num, String local) {
		this.num=num;
		this.name = name;
		this.local=local;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return String.format("팀번호:%d, 팀명:%s, 연고지:%s", num,name,local);
	}
}

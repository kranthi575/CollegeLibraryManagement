package in.kp.model;

public class Managment {
	
	private String mid;
	private String mname;
	private String memail;
	private String mpwd;
	
	public Managment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMpwd() {
		return mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	@Override
	public String toString() {
		return "Managment [mid=" + mid + ", mname=" + mname + ", memail=" + memail + ", mpwd=" + mpwd + "]";
	}
	
	
	
	

}

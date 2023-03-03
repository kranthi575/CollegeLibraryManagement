package in.kp.model;

public class Student {

	private String sid;
	private String sname;
	private String smail;
	private String spwd;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smail=" + smail + ", spwd=" + spwd + "]";
	}
	
	
	
}

package entity;

public class Students {
	private int stuNo;//学生编号
	private String sname;//学生姓名
	private String sgender;//学生性别
	private int sage;//学生年龄
	private String saddress;//学生地址
	private String semail;//学生邮箱
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public Students(int stuNo, String sname, String sgender, int sage, String saddress, String semail) {
		super();
		this.stuNo = stuNo;
		this.sname = sname;
		this.sgender = sgender;
		this.sage = sage;
		this.saddress = saddress;
		this.semail = semail;
	}
	public Students() {
		super();
	}
	
}

package entity;

public class Students {
	private int stuNo;//ѧ�����
	private String sname;//ѧ������
	private String sgender;//ѧ���Ա�
	private int sage;//ѧ������
	private String saddress;//ѧ����ַ
	private String semail;//ѧ������
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

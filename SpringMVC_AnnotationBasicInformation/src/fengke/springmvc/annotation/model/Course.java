/**
 * 
 */
package fengke.springmvc.annotation.model;

/**
 * @author ���
 *
 */
public class Course {
	//�γ�ID
	private int cid;
	//�γ�����
	private String cname;
	//�γ�������
	private String cteacher;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCteacher() {
		return cteacher;
	}

	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}
	
	
	
	
}

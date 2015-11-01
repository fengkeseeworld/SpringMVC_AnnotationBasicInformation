/**
 * 
 */
package fengke.springmvc.annotation.model;

/**
 * @author 锋客
 *
 */
public class Course {
	//课程ID
	private int cid;
	//课程名字
	private String cname;
	//课程主讲人
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

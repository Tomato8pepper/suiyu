package 物品管理系统;

public class User {
	private String uId;
	private String uName;
	private String uPw;
	private String Gender;
	private String uAge;

	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getuAge() {
		return uAge;
	}
	public void setuAge(String uAge) {
		this.uAge = uAge;
	}
	public User() {	}
	public User(String uId, String uName, String uPw, String Gender, String uAge) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPw = uPw;
		this.Gender = Gender;
		this.uAge = uAge;
	}
	
	

}

package GMS;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class User {
	private int id;
	private String name;
	private String sex;
	private Date birthDate;
	private String tel;
	private String Email;
	private String userPassword;
	public User() {
		
	}
	public User( String name, String sex, String birthDate, String tel, String email,String userPassword) {
		super();
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/goodssystem";
		String dbuser="root";
		String dbpassword="2798645458";
		Connection conn=null;
		PreparedStatement ps=null;
		
		String insertSql="INSERT INTO user(name,sex,birthDate,tel,email,password) VALUES(?,?,?,?,?,?);";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, dbuser, dbpassword);
			
			this.name = name;
			this.sex = sex;
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			try {
				this.birthDate = sf.parse(birthDate);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			this.tel = tel;
			this.Email = email;
			this.userPassword=userPassword;
			
			//将信息写入数据库中
			ps=conn.prepareStatement(insertSql);
			ps.setString(1, this.name);
			ps.setString(2, this.sex);
			ps.setDate(3, new java.sql.Date(this.birthDate.getTime()));
			ps.setString(4, this.tel);
			ps.setString(5, this.Email);
			ps.setString(6, this.userPassword);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)
					ps.close();
				
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String userPassword() {
		return userPassword;
	}
	public void userPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}

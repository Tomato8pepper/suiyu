package 物品管理系统;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private Connection conn=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	public int addUser(User ue) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "insert into User(uId,uName,uPw,uAge,Gender) values(?,?,?,?,?)";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, ue.getuId());
			pst.setString(2, ue.getuName());
			pst.setString(3, ue.getuPw());
			pst.setString(4, ue.getGender());
			pst.setString(5, ue.getuAge());

			int i=pst.executeUpdate();
			return i;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection();
		}
		return 0;
	}

	public List<User> getAllUser(String name) {
		List<User> list=new ArrayList<User>();
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from User where uName like '%" + name+"%'";
			System.out.println(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				//每循环一次得到 员工的信息，加入集合；
				User d=new User(
						rs.getString("uId") ,
						rs.getString("uName"),
						rs.getString("uPw"),						
					    rs.getString("Gender"),
					    rs.getString("uAge"));
				list.add(d);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection();
		}
		return list;
	}
	public int updateUser(User ue) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "update User set uName=?,uPw=?,Gender=?,uAge=? where uId=?";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, ue.getuId());
			pst.setString(2, ue.getuName());
			pst.setString(3, ue.getuPw());
			pst.setString(4, ue.getGender());
			pst.setString(5, ue.getuAge());
			int i=pst.executeUpdate();
			return i;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection();
		}
		return 0;
	}
	public int deleteUser(String uId) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "delete from User where uId=?";		// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, uId);
			int i=pst.executeUpdate();
			return i;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection();
		}
		return 0;
	}

	public User getUserById(String uId) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from User where uId ='" + uId+"'";// ?参数
			System.out.println(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				//每循环一次得到 员工的信息，加入集合；
				User ue=new User(
						rs.getString("uId"),
						rs.getString("uName"),
						rs.getString("uPw"),
						rs.getString("uAge"),
						rs.getString("Gender"));
				return ue;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeConnection();
		}		return null;
	}
	
	
}

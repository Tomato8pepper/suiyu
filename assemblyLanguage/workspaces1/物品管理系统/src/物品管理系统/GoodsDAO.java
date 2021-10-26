package 物品管理系统;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDAO {
		private Connection conn=null;
		private PreparedStatement pst=null;
		private ResultSet rs=null;
		public boolean login(String uId, String uPw) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from user where uId=? and uPw=?";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, uId);
			pst.setString(2, uPw);
			rs = pst.executeQuery();

			while (rs.next()) {
				return true;
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
		return false;
	}


		
		public int addGoods(Goods gds) {
			try {
				conn=	DBUtil.getConnection();
				String sql = "insert into Goods(gId,gName,gPrice,Stock) values(?,?,?,?)";// ?参数

				pst = conn.prepareStatement(sql);
				pst.setString(1, gds.getgId());
				pst.setString(2, gds.getgName());
				pst.setString(3, gds.getgPrice());
				pst.setString(4, gds.getStock());
				
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
		public int updateGoods(Goods gds) {
			try {
				conn=	DBUtil.getConnection();
				String sql = "update Goods set gName=?,gPrice=?,Stock=? where gId=?";// ?参数

				pst = conn.prepareStatement(sql);
				pst.setString(1, gds.getgId());
				pst.setString(2, gds.getgName());
				pst.setString(3, gds.getgPrice());
				pst.setString(4, gds.getStock());
				
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
		
		public int deleteGoods(String gId) {
			try {
				conn=	DBUtil.getConnection();
				String sql = "delete from Goods where gId=?";		// ?参数

				pst = conn.prepareStatement(sql);
				pst.setString(1, gId);
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
		public List<Goods> getAllGoods(String name) {
			List<Goods> list=new ArrayList<Goods>();
			try {
				conn=	DBUtil.getConnection();
				String sql = "select * from Goods where gName like '%" + name+"%'";// ?参数
	System.out.println(sql);
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					//每循环一次得到 员工的信息，加入集合；
					Goods gds=new Goods(
							rs.getString("gId") ,
							rs.getString("gName") ,
							rs.getString("gPrice"),
							rs.getString("Stock")    );
					list.add(gds);
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
		public Goods getGoodsById(String gId) {
			try {
				conn=	DBUtil.getConnection();
				String sql = "select * from Goods where gId ='" + gId+"'";// ?参数
				System.out.println(sql);
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					//每循环一次得到 员工的信息，加入集合；
					Goods gds=new Goods(rs.getString("gId") ,
							 rs.getString("gName") ,
							rs.getString("gPrice") ,
							rs.getString("Stock"));
					return gds;
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
			return null;
		}
		
		
	}


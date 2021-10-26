package com.gem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.model.Dept;
import com.gem.util.DBUtil;

public class DeptDAO {
	private Connection conn=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	public List<Dept> getAllDept() {
		List<Dept> list=new ArrayList<Dept>();
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from Dept";
			System.out.println(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				//每循环一次得到 员工的信息，加入集合；
				Dept d=new Dept(rs.getInt("deptId") ,
						 rs.getString("deptName") );
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
	
	
}

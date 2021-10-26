package com.gem.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.model.Employee;
import com.gem.util.DBUtil;

public class EmployeeDAO {
	private Connection conn=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	/**
	 * 登录
	 * @param empId
	 * @param empPassword
	 * @return
	 */
	public boolean login(String empId, String empPassword) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from Employee where empId=? and empPassword=?";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, empId);
			pst.setString(2, empPassword);
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
	
	/**
	 * 添加员工
	 * @param empId
	 * @param empPassword
	 * @return
	 */
	public int addEmployee(Employee emp,Blob photo) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "insert into Employee(empId,empName,empPassword,gender,birthDate,pic,deptId,nativePlace) values(?,?,?,?,?,?,?,?)";// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, emp.getEmpId());
			pst.setString(2, emp.getEmpName());
			pst.setString(3, emp.getEmpPassword());
			pst.setString(4, emp.getGender());
			pst.setString(5, emp.getBirthDate());
			pst.setBlob(6, photo);
			pst.setInt(7, emp.getDeptId());
			pst.setString(8, emp.getNativePlace());
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
	public int deleteEmployee(String empId) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "delete from Employee where empId=?";		// ?参数

			pst = conn.prepareStatement(sql);
			pst.setString(1, empId);
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
	//得到所有员工(String name)
	public List<Employee> getAllEmployee(String name) {
		List<Employee> list=new ArrayList<Employee>();
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from Employee where empname like '%" + name+"%'";// ?参数
			System.out.println(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				//每循环一次得到 员工的信息，加入集合；
				Employee emp=new Employee(rs.getString("empId") ,
						 rs.getString("empName") ,"",
						rs.getString("gender") ,
						rs.getString("birthDate"), 
						rs.getBlob("pic"),
						rs.getInt("deptId"),
						rs.getString("nativePlace"));
				list.add(emp);
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
	
	public Employee getEmployeeById(String empId) {
		try {
			conn=	DBUtil.getConnection();
			String sql = "select * from Employee where empId ='" + empId+"'";// ?参数
			System.out.println(sql);
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				//每循环一次得到 员工的信息，加入集合；
				Employee emp=new Employee(rs.getString("empId") ,
						 rs.getString("empName") ,"",
						rs.getString("gender") ,
						rs.getString("birthDate"), 
						rs.getBlob("pic"),
						rs.getInt("deptId"),
						rs.getString("nativePlace"));
				return emp;
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

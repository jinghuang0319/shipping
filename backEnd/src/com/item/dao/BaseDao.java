package com.item.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//this is BaseDao
public class BaseDao {

	
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet res;

	
	private final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/huangjing";
	private final String USER_NAME = "root";
	private final String PASSWORD = "1234";

	
	public void getConnection() {

		try {
			Class.forName(DRIVER_CLASS);
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void close() {

		try {
			if (res != null)
				res.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

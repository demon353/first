package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	// 书写一个静态代码块来加载数据库驱动
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		private static Connection conn = null;
		// 获得连接
		public static Connection createConnection() {
			try {
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/studentdb?useUnicode=true&characterEncoding=UTF-8", 
						"root", "1234");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		// 释放资源
		public static void closeAll(ResultSet rs,PreparedStatement pst,Connection conn) {
			try {
				if(rs != null)
					rs.close();
				if(pst != null)
					pst.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
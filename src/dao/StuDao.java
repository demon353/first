package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Students;
import utils.BaseDao;

public class StuDao extends BaseDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<Students> showInfo() {
		List<Students> list = new ArrayList<Students>();
		try {
			conn=createConnection();
			String sql="select * from studentinfo";
			pst=conn.prepareStatement(sql);rs=pst.executeQuery();
			while(rs.next()) {
				list.add(new Students(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			closeAll(rs, pst, conn);
		}
		return list;
	}
	
}

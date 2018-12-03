package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import bean.DepBean;


public class DepDAO extends DAO{

	public int getDep_No(String dep_name) throws NamingException, SQLException{

		DepBean d=null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("select * from goods.department where dep_name=? ");
		st.setString(1, dep_name);

		ResultSet rs = st.executeQuery();

		while(rs.next()){
			d = new DepBean();
			d.setDep_no(rs.getInt("dep_no"));
			d.setDep_name(rs.getString("dep_name"));
		}

		st.close();
		con.close();
		return d.getDep_no();
	}

}
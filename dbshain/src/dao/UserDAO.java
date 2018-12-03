package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import bean.UserBean;

public class UserDAO extends DAO{

	public UserBean search(String user_id, String password) throws NamingException, SQLException{

		UserBean user = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("select * from goods.user where user_id=? and password=?");
		st.setString(1, user_id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		while(rs.next()){
			user = new UserBean();
			user.setUser_id(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return user;
	}

}

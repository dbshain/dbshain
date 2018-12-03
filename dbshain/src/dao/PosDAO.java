package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import bean.PosBean;


public class PosDAO extends DAO{

	public int getPos_No(String pos_name) throws NamingException, SQLException{

		PosBean p=null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("select * from goods.post where pos_name=? ");
		st.setString(1, pos_name);

		ResultSet rs = st.executeQuery();

		while(rs.next()){
			p = new PosBean();
			p.setPos_no(rs.getInt("pos_no"));
			p.setPos_name(rs.getString("pos_name"));

		}

		st.close();
		con.close();
		return p.getPos_no();
	}

	public int getPos_Name(int pos_no) throws NamingException, SQLException{

		PosBean p=null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("select * from goods.post where pos_no=? ");
		st.setInt(1, pos_no);

		ResultSet rs = st.executeQuery();

		while(rs.next()){
			p = new PosBean();
			p.setPos_no(rs.getInt("pos_no"));
			p.setPos_name(rs.getString("pos_name"));

		}

		st.close();
		con.close();
		return p.getPos_no();
	}

}

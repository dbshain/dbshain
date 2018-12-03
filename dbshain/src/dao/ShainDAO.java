package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import bean.ShainBean;


public class ShainDAO extends DAO {

	@SuppressWarnings("resource")
	public int insert(ShainBean s)throws SQLException, NamingException{
		Connection con=null;//プロダクトインスタンスにあらかじめ新商品の情報をつめておき、それからインサートしている

		PreparedStatement st=null;

		int line;
		try {
			con = getConnection();
			st = con.prepareStatement("INSERT INTO `goods`.`meibo` (`NO`, `NAME`, `ADDRESS`, `POS_NO`, `DEP_NO`) VALUES (null,?, ?, ?, ?)");
			// "insert into goods.meibo values(?,?,?,?)"
			st.setString(1, s.getName());
			st.setString(2, s.getAddress());
			st.setInt(3,s.getPos_no());
			st.setInt(4, s.getDep_no());
			line = st.executeUpdate();



		} finally {

			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}


		}
		return line;
	}

	public int update(ShainBean s)throws SQLException, NamingException{
		Connection con=null;//プロダクトインスタンスにあらかじめ新商品の情報をつめておき、それからインサートしている

		PreparedStatement st=null;
		int no = s.getNo();
		int line;
		try {
			con = getConnection();
			st = con.prepareStatement("update goods.meibo set name=?,address=?,pos_no=?,dep_no=? where no=?");

			st.setString(1, s.getName());
			st.setString(2, s.getAddress());
			st.setInt(3, s.getPos_no());

			st.setInt(4, s.getDep_no());
			st.setInt(5, s.getNo());
			line = st.executeUpdate();

		} finally {

			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}


		}
		return line;
	}


	public List<ShainBean> nameSearch(String name) throws SQLException, NamingException {
		List<ShainBean> list;

		Connection con=null;

		PreparedStatement st=null;
		try {
			list = new ArrayList<>();
			con = getConnection();

			st = con.prepareStatement("select * from goods.meibo where  name like ?");
			ResultSet rs=null;
			st.setString(1, "%"+name+"%" );

			rs = st.executeQuery();
			while (rs.next()) {
				ShainBean s = new ShainBean();
				s.setNo(rs.getInt("no"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setPos_no(rs.getInt("pos_no"));
				s.setDep_no(rs.getInt("dep_no"));
				list.add(s);
			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}

		return list;
	}
	public List<ShainBean> addressSearch(String address) throws SQLException, NamingException {
		List<ShainBean> list;

		Connection con=null;

		PreparedStatement st=null;
		try {
			list = new ArrayList<>();
			con = getConnection();

			st = con.prepareStatement("select * from goods.meibo where  address like ?");
			ResultSet rs=null;
			st.setString(1, "%"+address+"%" );

			rs = st.executeQuery();
			while (rs.next()) {
				ShainBean s = new ShainBean();
				s.setNo(rs.getInt("no"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setPos_no(rs.getInt("pos_no"));
				s.setDep_no(rs.getInt("dep_no"));
				list.add(s);
			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}

		return list;
	}

	public List<ShainBean> pos_noSearch(int pos_no) throws SQLException, NamingException {
		List<ShainBean> list;

		Connection con=null;

		PreparedStatement st=null;
		try {
			list = new ArrayList<>();
			con = getConnection();

			st = con.prepareStatement("select * from goods.meibo where pos_no = ?");
			ResultSet rs=null;




			st.setInt(1, pos_no );
			 rs = st.executeQuery();
			while (rs.next()) {
				ShainBean s = new ShainBean();
				s.setNo(rs.getInt("no"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setPos_no(rs.getInt("pos_no"));
				s.setDep_no(rs.getInt("dep_no"));

				list.add(s);
			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}
		return list;
	}
	public List<ShainBean> dep_noSearch(int dep_no) throws SQLException, NamingException {
		List<ShainBean> list;

		Connection con=null;

		PreparedStatement st=null;
		try {
			list = new ArrayList<>();
			con = getConnection();

			st = con.prepareStatement("select * from goods.meibo where dep_no = ?");
			ResultSet rs=null;




			st.setInt(1, dep_no );
			 rs = st.executeQuery();
			while (rs.next()) {
				ShainBean s = new ShainBean();
				s.setNo(rs.getInt("no"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setPos_no(rs.getInt("pos_no"));
				s.setDep_no(rs.getInt("dep_no"));

				list.add(s);
			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}
		return list;
	}
	public List<ShainBean> noSearch(int no) throws SQLException, NamingException {
		List<ShainBean> list;

		Connection con=null;

		PreparedStatement st=null;
		try {
			list = new ArrayList<>();
			con = getConnection();

			st = con.prepareStatement("select * from goods.meibo where no = ?");
			ResultSet rs=null;




			st.setInt(1, no );
			 rs = st.executeQuery();
			while (rs.next()) {
				ShainBean s = new ShainBean();
				s.setNo(rs.getInt("no"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setPos_no(rs.getInt("pos_no"));
				s.setDep_no(rs.getInt("dep_no"));

				list.add(s);
			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}

		return list;
	}
	public int getLastNo() throws SQLException, NamingException {


		Connection con=null;
		int result=0;
		PreparedStatement st=null;
		try {

			con = getConnection();

			st = con.prepareStatement("SELECT LAST_INSERT_ID() as last");
			ResultSet rs=null;

			 rs = st.executeQuery();
			while (rs.next()) {

			result	 = rs.getInt("LAST");


			}
		} finally {
			if (st!=null) {
				st.close();
			}
			if (con!=null) {
				con.close();
			}

		}

		return result;
	}

}
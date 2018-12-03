package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAO {

	static DataSource ds;

	public Connection getConnection() throws NamingException, SQLException {
		if(ds==null){
			InitialContext ic=new InitialContext();
			ds=(DataSource)ic.lookup("java:/comp/env/jdbc/mysql");
		}
		return ds.getConnection();
	}

}

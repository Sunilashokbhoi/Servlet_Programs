package task02;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con = null;
	private DBConnection(){}
	
	static {
		try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUName,DBInfo.dbUPass);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}
}

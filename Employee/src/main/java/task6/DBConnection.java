package task6;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con = null;
	private DBConnection() {}
	static 
	{
		try {
			
			Class.forName(DBInfo.driver);
			Connection con = DriverManager.getConnection(DBInfo.bdURL,DBInfo.bdUName,DBInfo.dbPass);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public static Connection getCon() {
			return con;
	}
}

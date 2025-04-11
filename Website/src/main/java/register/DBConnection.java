package register;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con = null;
	private DBConnection() {}
	static
	{
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbName,DBInfo.dbPWord);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end of static block
	public static Connection getCon() {
		return con;
	}
}

package jpa01;
import java.sql.*;
public class DBConnection {
	private static Connection con = null;
	private DBConnection() {}
	
	static
	{
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbPWord,DBInfo.dbPWord);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end of static block
	public static Connection getCon() {
		return con;
	}
}

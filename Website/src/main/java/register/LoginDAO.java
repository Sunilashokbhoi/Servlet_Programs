package register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public AdminBean ab = null;
	public AdminBean checking(String an ,String ps) {
		{
			try {
				Connection con = DBConnection.getCon();
				PreparedStatement psmt = con.prepareStatement("select * from where name=? and password =?");
				psmt.setString(1,an);
				psmt.setString(2,ps);
				ResultSet rs = psmt.executeQuery();
				
				if(rs.next()) {
					ab = new AdminBean();
					ab.setFname(rs.getString(1));
					ab.setEmail(rs.getString(2));
					ab.setPhno(rs.getLong(3));
					ab.setPass(rs.getString(4));
					ab.setCpass(rs.getString(5));
					
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return ab;
	}
}

package register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewDAO {
	public RegistrationBean rb = null;
	public RegistrationBean retrieve(String email) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement(" select * from userregister where email=?");
			
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				rb = new RegistrationBean();
				rb.setName(rs.getString(1));
				rb.setEmail(rs.getString(2));
				rb.setPassword(rs.getString(3));
				rb.setPhno(rs.getLong(4));
	
			}
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rb;
	}
}

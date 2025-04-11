package register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewAllDAO {
	//public RegistrationBean rb = null;
	public RegistrationBean retrieveAll(RegistrationBean rb) {
		try{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from userregister");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				rb = new RegistrationBean();
				rb.getName();
				rb.getEmail();
				rb.getPassword();
				rb.getPhno();
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rb;
	}
}

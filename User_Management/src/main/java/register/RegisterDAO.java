package register;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
	public int k = 0;
	public int insert(RegistrationBean rb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into UserRegister values(?,?,?,?)");
			ps.setString(1, rb.getName());
			ps.setString(2,rb.getEmail());
			ps.setString(3,rb.getPassword());
			ps.setLong(4,rb.getPhno());
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}

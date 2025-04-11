package register;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
	public int k = 0;
	public int insert(AdminBean ab) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into admin values(?,?,?,?,?)");
			ps.setString(1,ab.getFname());
			ps.setString(2,ab.getEmail());
			ps.setLong(3,ab.getPhno());
			ps.setString(4,ab.getPass());
			ps.setString(5,ab.getCpass());
			
		   k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}

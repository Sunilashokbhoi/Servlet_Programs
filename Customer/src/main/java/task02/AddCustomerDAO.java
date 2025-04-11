package task02;
import java.sql.*;

public class AddCustomerDAO {
	public int k=0;
	public int insert(CustomerBean cb){
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("insert into customer values(?,?,?,?,?)");
			ps.setString(1,cb.getId());
			ps.setString(2, cb.getName());
			ps.setString(3, cb.getCity());
			ps.setString(4, cb.getMid());
			ps.setLong(5, cb.getPhno());
			k = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}

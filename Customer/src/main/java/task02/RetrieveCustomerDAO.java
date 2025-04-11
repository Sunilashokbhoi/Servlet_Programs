package task02;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class RetrieveCustomerDAO {
	public CustomerBean cb = null;
	public CustomerBean retrieve(String ci) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from customer where id=?");
			ps.setString(1, ci);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				cb = new CustomerBean();
				cb.setId(rs.getString(1));
				cb.setName(rs.getString(2));
				cb.setCity(rs.getString(3));
				cb.setMid(rs.getString(4));
				cb.setPhno(rs.getLong(5));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}

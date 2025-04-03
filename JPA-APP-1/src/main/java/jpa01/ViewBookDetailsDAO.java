package jpa01;
import java.sql.*;
public class ViewBookDetailsDAO {
	public BookBean bb = null;
	public BookBean retrieve(String bc)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from BookDetails72 where code=?");
			ps.setString(1, bc);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				bb = new BookBean();
				bb.setCode(rs.getString(1));
				bb.setName(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getFloat(4));
				bb.setQty(rs.getInt(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bb;
	}
}

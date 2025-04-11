package task05;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentViewDAO {
	public StudentBean sb = null;
	public StudentBean retrieve(String id) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from student7 where id=?");
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				sb = new StudentBean();
				sb.setId(rs.getString(1));
				sb.setName(rs.getString(2));
				sb.setCourse(rs.getString(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sb;
		
	}
}

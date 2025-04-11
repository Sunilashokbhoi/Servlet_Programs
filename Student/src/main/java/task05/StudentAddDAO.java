package task05;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class StudentAddDAO {
	public int k = 0;
	public int insert(StudentBean sb) {
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into student7 values(?,?,?)");
			
			ps.setString(1,sb.getId());
			ps.setString(2,sb.getName());
			ps.setString(3,sb.getCourse());
			
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}

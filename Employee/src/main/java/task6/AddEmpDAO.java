package task6;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class AddEmpDAO {
	public int k = 0;
	public int insert(EmployeeBean eb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into employee7 values(?,?,?)");
			
			ps.setString(1,eb.getId());
			ps.setString(2,eb.getName());
			ps.setFloat(3,eb.getSalary());
			
			k=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
	
}

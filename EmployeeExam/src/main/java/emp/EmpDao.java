package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpDao {
	public int k = 0;
	public int insert(EmployeeBean eb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into employeedata values(?,?,?,?,?)");
			ps.setInt(1,eb.getId());
			ps.setString(2,eb.getName());
			ps.setString(3,eb.getEmail());
			ps.setString(4,eb.getDept());
			ps.setDouble(5,eb.getSalary());
			
			k = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return k;
	}
}

package task02;
import java.io.*;
public class CustomerBean implements Serializable {
	private String id ,name ,city ,mid;
	private long phno;
	
	public CustomerBean() {
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMid() {
		return mid;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public long getPhno() {
		return phno;
	}
	
}

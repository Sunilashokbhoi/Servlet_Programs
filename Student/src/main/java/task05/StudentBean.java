package task05;
import java.io.*;
public class StudentBean implements Serializable{
	private String id ,name , course;
	public StudentBean() {}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

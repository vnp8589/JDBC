package in.ac.adit.JDBCDemo;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
	
	public final String Driver = "com.mysql.jdbc.Driver";
	
	public final String url = "jdbc:mysql://localhost:3306/student_details";
	
	public final String username = "root";
	
	public final String password = "";
	
	public boolean CreateStudent(Student student);
	
	public int updateStudent(String Student_id,int age);
	
	public List<Student> getAllStudents();
	
	public boolean deleteStudent(String Student_id);
	
	public Student getStudent(String Student_id);

}

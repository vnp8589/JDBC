package in.ac.adit.JDBCDemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOimplementation implements StudentDAO {
	private Connection connection;
	
	private Statement statement;
	
	private ResultSet rs;
	
	private String query;
	
	public StudentDAOimplementation() throws Exception {
		
		Class.forName(Driver);
		
		connection = DriverManager.getConnection(url, username, password);
		
		statement = connection.createStatement();
	}
	
	public boolean CreateStudent(Student student) {
		query = "insert into student_info values ('"+student.getStudent_id()+"','"+student.getFirstName()+"','"+student.getLastName()+"','"+student.getAge()+"')";
		
		try {
			statement.execute(query);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Student created");
		return true;
	}
	
	public int updateStudent(String Student_id,int age) {
		int count=0;
		query = "update student_info set Age='"+age+"' where Student_id='"+Student_id+"'" ;
		
		try {
			statement.executeUpdate(query);
			
			System.out.println("Students updated : "+(++count));
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		return 0;
		
	}
	
	public boolean deleteStudent(String Student_id) {
		
		query = "Delete from student_info where Student_id = '"+Student_id+"'";
		
		try {
			statement.executeUpdate(query);
			System.out.println("Student deleted.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return true;
	}
	
	public Student getStudent(String Student_id) {
		
		query = "select * from student_info where Student_id = '"+Student_id+"'";
		try {
			rs = statement.executeQuery(query);
			if(rs.next()) {
				
				return new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
			else {
				return null;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Student("","","",Integer.parseInt("0"));
		}
		
	}
	
	public List<Student> getAllStudents(){
			List<Student> s = new ArrayList<Student>();
			
			query = "select * from student_info";
			try {
				rs = statement.executeQuery(query);
				
				while(rs.next()) {
					Student st = new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
					
					s.add(st);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return s;
	}
}

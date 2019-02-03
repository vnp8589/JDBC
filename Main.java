package in.ac.adit.JDBCDemo;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("160010116048","Vatsal","Patel",20);
		
		Student student1 = new Student("160010116026","Raj","Mrug",21);
		
		StudentDAOimplementation sdi;
		try {
			sdi = new StudentDAOimplementation();
			
			//Create Student
			//sdi.CreateStudent(student1);
			
			//Update Student
			//sdi.updateStudent("160010116048",21);
			
			//Delete Student
			//sdi.deleteStudent("160010116026");
			
			sdi.getStudent("160010116048").Display();
			
			/*for(int i =0;i<sdi.getAllStudents().size();i++) {
				sdi.getAllStudents().get(i).Display();
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

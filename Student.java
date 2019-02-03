package in.ac.adit.JDBCDemo;

public class Student {

		 public String Student_id;
		 public String FirstName;
		 public String LastName;
		 public int Age;
		 
		public Student(String Student_id,String FirstName,String LastName,int Age) {
			this.Student_id = Student_id;
			this.FirstName = FirstName;
			this.LastName= LastName;
			this.Age = Age;
		}
		
		public String getStudent_id() {
			return Student_id;
		}
		public String getFirstName() {
			return FirstName;
		}
		public String getLastName() {
			return LastName;
		}
		public int getAge() {
			return Age;
		}
		
		public void Display() {
			System.out.println(Student_id+" "+FirstName+" "+LastName+" "+Age);
		}
}

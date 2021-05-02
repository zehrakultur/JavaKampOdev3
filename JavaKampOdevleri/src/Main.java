
public class Main {
	public static void main(String[] args) {
		
		  Instructor instructor=new Instructor();
		  instructor.setAge("30");
		  instructor.setEmail("engindemirog@gmail.com");
		  instructor.setFirstName("Engin");
		  instructor.setLastName("Demirog");
		  instructor.setPassword("123");
		  instructor.setUserName("engindemirog");
		  
		  Student student =new Student();
		  student.setAge("22");
		  student.setEmail("kltrzehra@gmail.com");
		  student.setFirstName("Zehra");
		  student.setLastName("Kultur");
		  student.setPassword("12345");
		  student.setUserName("zehrakultur");
		  
		  
		
		   InstructorManager instructorManager=new InstructorManager();
		   instructorManager.add(instructor);
		   
		   StudentManager studentManager =new StudentManager();
		   studentManager.add(student);

	}
}

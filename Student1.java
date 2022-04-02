package week3.day1;

public class Student1 {
	//by id & name, by email & phoneNumber
 public void getStudentInfo(int id) {
	 System.out.println("Printing the ID--" +id );
 }
public void getStudentInfo(long id ,String name) {
	 System.out.println("Printing the id "  +id  );
	 System.out.println("Printing the name "  +name  );
 }
public void getStudentInfo(String email , long phoneNumber) {
	 System.out.println("Printing the id "  +email  );
	 System.out.println("Printing the name "  +phoneNumber  );
	 
}
	public static void main(String[] args) {
		Student1 obj3=new Student1();
		
		obj3.getStudentInfo(111);
      obj3.getStudentInfo(222 ,"Divya");
		obj3.getStudentInfo("divyaswetha@gmail.com", 1234567891);
		
	}

}

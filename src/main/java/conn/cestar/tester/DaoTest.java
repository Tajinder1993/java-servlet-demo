package conn.cestar.tester;

import conn.cestar.modal.Student;

public class DaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Dao obj = new Student_Dao();
		obj.setUpConnection();
		
//        Student stu_insert_db = new Student(101,"tajinder","12-may-1993","23 tillbrook court","Scarborough"
//        		,"on","M1B1N5","Canada","647-878-0752","tajinder@gmail.com","1234Taj","CSAT","i enjoy this course");
//		
//		int status = obj.insertRec(stu_insert_db);
//		
//		if(status>0) {
//			System.out.println("record inserted successfully");
//		}
//		else {
//			System.out.println("some problem encountered");
//		}
		
	 Student status = obj.getData("tajinder@gmail.com","1234");
	 
	 if(status == null) {
		 System.out.println("email id and password is not match");
	 }
		 else
		 {
		 System.out.println("user login successfully");
	 }

	}

}

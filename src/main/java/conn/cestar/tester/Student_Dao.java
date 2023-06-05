package conn.cestar.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.cestar.modal.Student;

public class Student_Dao {
	
	public static Connection con ;
	
	// create a connection with the database
	public static Connection setUpConnection() {
		
		String user="root";
		
		String pwd="";
		
		String url="jdbc:mysql://localhost:3306/Student_registration";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("connection successful!!!!!!!!!!");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	
	}
	
	
	// create a insertRec method to insert the data in the database
public int insertRec(Student stu_servlet) {
		
		int status=0;
		
		Connection con = setUpConnection();
		
		
		String sql = "INSERT into registration_table(stu_id,name,dob,address,city,province,zip,country,phone,email,password,course,comment) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    
	    try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, stu_servlet.getStu_id());
			
			ps.setString(2,stu_servlet.getName());
			
			ps.setString(3,  stu_servlet.getDob());
			
			ps.setString(4,  stu_servlet.getAddress());
			
			ps.setString(5,  stu_servlet.getCity());
			
			ps.setString(6,  stu_servlet.getProvince());
			
			ps.setString(7,  stu_servlet.getZip());
			
			ps.setString(8,  stu_servlet.getCountry());
			
		    ps.setString(9,  stu_servlet.getPhone());
		    
		    ps.setString(10,  stu_servlet.getEmail());
		    
		    ps.setString(11,  stu_servlet.getPassword());
		    
		    ps.setString(12,  stu_servlet.getCourse());
		    
		    ps.setString(13,  stu_servlet.getComment());
			
			status = ps.executeUpdate();
			
			if(status>0) {
				System.out.println("Record is inserted");
			}
			else {
				System.out.println("Sorry there is some problem");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return status;
		
	}
	
// create a getData method to fetch the data from the database according to email and password entered by the user 
	public Student getData(String stu_email, String stu_pass ) {
		
		Student stu = null;
		
		Connection con = setUpConnection();
		
		
		String sql = "Select * from registration_table where email=? AND Password=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, stu_email);
			
			pstmt.setString(2, stu_pass);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
			stu = new Student(rs.getInt("stu_id"),rs.getString("name"),rs.getString("dob"),rs.getString("address"),
						rs.getString("city"),rs.getString("province"),rs.getString("zip"),rs.getString("country"),rs.getString("phone"),
						rs.getString("email"),rs.getString("password"),rs.getString("course"),rs.getString("comment"));
			}System.out.print(stu);
		}
			
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stu;
	}
}

package conn.cestar.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.cestar.modal.Student;
import conn.cestar.tester.Student_Dao;

/**
 * Servlet implementation class myservelet
 */
@WebServlet("/myservelet")
public class myservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		 int id = Integer.parseInt(request.getParameter("stu_id"));
		 
		 String name = request.getParameter("name");
		 
		 String dob = request.getParameter("dob");
		 
		 String address = request.getParameter("address");
		 
		 String city = request.getParameter("city");
		 
		 String province = request.getParameter("province");
		 
		 String zip = request.getParameter("zip");
		 
		 String country = request.getParameter("country");
		 
		 String phone = request.getParameter("phone");
		 
		 String email = request.getParameter("email");
		 
		 String password = request.getParameter("password");
		 
		 String course = request.getParameter("course");
		 
		 String comment = request.getParameter("comment");
		
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Student Login Servlet</title>");
		 out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\' rel=\'stylesheet\'>");
		 out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\'></script>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<div class='container'>");
		 out.print("<h1 class='p-5 my-5 bg-dark text-white'>Student Portal</h1>");
		
		Student_Dao obj = new Student_Dao();

        Student stu_insert_db = new Student(id,name,dob,address,city,province,zip,country,phone,email,password,course,comment);
		
		int status = obj.insertRec(stu_insert_db);
		
		if(status>0) {
			
			out.print("<h2 class='p-3 bg-info bg-opacity-10 border border-info border-start-0 rounded-end'>welcome in the online student portal services..............</h2>");

			out.print("<h2 class='text-success p-3 bg-info bg-opacity-10 border border-success border-start-0 rounded-end'>Student Registration Successfull with the following Information</h2>");
			
			out.print("<p class='text-bg-success'>Id is :"+id+"</p>");
			
			out.print("<p class='text-bg-success'>Name is :"+name+"</p>");
			
			out.print("<p class='text-bg-success'>Date of birth is :"+dob+"</p>");
			
			out.print("<p class='text-bg-success'>Address is :"+address+"</p>");
			
			out.print("<p class='text-bg-success'>City is :"+city+"</p>");
			
			out.print("<p class='text-bg-success'>Province is :"+province+"</p>");
			
			out.print("<p class='text-bg-success'>Zip code is :"+zip+"</p>");
			
			out.print("<p class='text-bg-success'>Country is :"+country+"</p>");
			
			out.print("<p class='text-bg-success'>Phone is :"+phone+"</p>");
			
			out.print("<p class='text-bg-success'>Email is :"+email+"</p>");
			
			out.print("<p class='text-bg-success'>Password is :"+password+"</p>");
			
			out.print("<p class='text-bg-success'>Course is :"+course+"</p>");
			
			out.print("<p class='text-bg-success'>Comment is :"+comment+"</p>");
		}
		else {
			out.print("<h2 class='h4 pb-2 mb-4 text-danger border-bottom border-danger'>Some problem encountered try again........</h2>");
		}
		
		 out.println("<a href='Student_portal.html' class='text-warning'>Click here</a> to visit student Portal Services...");
		  
		  out.println("</div>");
		  out.println("</body>");
		  out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

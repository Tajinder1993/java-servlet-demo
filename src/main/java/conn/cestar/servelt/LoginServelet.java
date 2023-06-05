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
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
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
	
		 String email = request.getParameter("email");
		 
		 String pass = request.getParameter("password");
		 
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

		// get data function is called 
		Student status = obj.getData(email,pass);
		
		if(status == null) {
			out.print("<h2 class='h4 pb-2 mb-4 text-danger border-bottom border-danger'>Try again as either your password is wrong.. or you are not registered user..</h2>");
		}
		else {
			out.print("<h2 class='p-3 bg-info bg-opacity-10 border border-info border-start-0 rounded-end'>welcome in the online student portal services..............</h2>");
			out.print("<h2 class='text-success p-3 bg-info bg-opacity-10 border border-success border-start-0 rounded-end'>Student login successfully</h2>");
			out.print("<p class='text-bg-success'>Email id is :"+email+" and Password is :"+pass+"</p>");
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

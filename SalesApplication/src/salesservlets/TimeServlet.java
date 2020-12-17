package salesservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimeServlet
 */

public class TimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("user");
		
		if(user == null)
			user = "Visitor";
		PrintWriter out = response.getWriter();
		//Response Header
		response.setContentType("text/html");
		//Response Body
		out.println("<html>");
		out.println("<head><title>Test - SalesApp</title></head>");
		out.println("<body>");
		out.printf("<h1>Welcome to Web Application %s</h1>", user);
		out.printf("<b>Current time on server: </b>%s%n", new Date().toString());
		out.println("</body>");
		out.println("</html>");
		
		
	}

}

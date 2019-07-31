package niit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Interest
 */
public class Interest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Interest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double amount = Double.parseDouble(request.getParameter("t1"));
		double rate = Double.parseDouble(request.getParameter("t2"));
		int time = Integer.parseInt(request.getParameter("t3"));
		double res= (amount*rate*time)/100;
		
		PrintWriter  out = response.getWriter();
		out.println("<body bgcolor='yellow'");
		out.printf("Your interest is %.2f",res);
		
	}

}












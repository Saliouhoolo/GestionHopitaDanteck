package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RendezVous extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Patient.jsp").forward(request,response);
        PrintWriter out=response.getWriter();
        String Libelle=request.getParameter("Libelle");
        String date=request.getParameter("date");
        out.println("Method POST !!!<br />");
        out.println("Bienvenue:" + Libelle + ", date:"+ date);
	}
		
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("Patient.jsp").forward(request,response);
        PrintWriter out=response.getWriter();
        String Libelle=request.getParameter("Libelle");
        String date=request.getParameter("date");
        out.println("Method POST !!!<br />");
        out.println("Bienvenue:" + Libelle + ", date:"+ date);
        
		}
}
package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Patient extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("Patient.jsp").forward(request,response);
	        PrintWriter out=response.getWriter();
	        String nom=request.getParameter("nom");
	        String prenom=request.getParameter("prenom");
	        String Age =request.getParameter("Age");
	        String Sexe=request.getParameter("Sexe");
	        String telephonne=request.getParameter("telephonne");

	        out.println("Bienvenue:" + nom + ", prenom:"+ prenom +", telephonne:"+ telephonne+",Sexe:"+Sexe+",Age:"+Age);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Patient.jsp").forward(request,response);
        PrintWriter out=response.getWriter();
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String Age =request.getParameter("Age");
        String Sexe=request.getParameter("Sexe");
        String telephonne=request.getParameter("telephonne");
        out.println("Method POST !!!<br />");
        out.println("Bienvenue:" + nom + ", prenom:"+ prenom +", telephonne:"+ telephonne+",Sexe:"+Sexe+",Age:"+Age);
	}

}

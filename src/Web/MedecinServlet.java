package Web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cs",urlPatterns = {"*.do"})
public class MedecinServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("Medecin.jsp").forward(request,response);
	PrintWriter out=response.getWriter();
	String nom=request.getParameter("nom");
	String prenom=request.getParameter("prenom");
	String telephonne=request.getParameter("telephonne");
	String Service=request.getParameter("Service");
	
	out.println("Bienvenue:" + nom + ", prenom:"+ prenom +", telephonne:"+ telephonne+",Service:"+Service);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Medecin.jsp").forward(request,response);
		PrintWriter out=response.getWriter();
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String telephonne=request.getParameter("telephonne");
		String Service=request.getParameter("Service");
		out.println("Method POST !!!<br />");
		out.println("Bienvenue:" + nom + ", prenom:"+ prenom +", telephonne:"+ telephonne+",Service:"+Service);

	}
	
}

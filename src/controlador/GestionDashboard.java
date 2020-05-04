package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionDashboard
 */
@WebServlet("/GestionDashboard")
public class GestionDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionDashboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usu = null;
		usu = (Usuario) request.getSession().getAttribute("usuario");
		
		System.out.println("usuario dentro del dashboard " + usu.getNombre());
		
		// request.getSession().setAttribute("usuario", usu);
		

		switch (request.getParameter("option")) {

		case "dash":

			if (usu != null) {
				request.getSession().setAttribute("cu", usu);
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			}

			break;

			
		case "nombre":
			
			request.getRequestDispatcher("cambiarNombre.jsp").forward(request, response);
			
			break;
			
			
		case "pwd":
			
			
			break;
			
		case "name-change":
			
			
			
			break;

		}
	}

}

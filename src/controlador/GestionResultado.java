package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionTest
 */
@WebServlet("/GestionTest")
public class GestionResultado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionResultado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
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

		switch (request.getParameter("option")) {

		case "validar":

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			} else if (usu.getEneagrama() == null) {
				request.getRequestDispatcher("test.jsp").forward(request, response);
			} else if(usu.getEneagrama() != null) {
				request.getRequestDispatcher("anuncios.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			System.out.println("aqui");
			System.out.println(usu);

			/*
			 * System.out.println(usu.getNombre());
			 * System.out.println(usu.getTipoEneagrama());
			 */

			// request.getRequestDispatcher("index.jsp").forward(request, response);

			break;
		}

	}

}

package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.AnuncioDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Anuncio;
import modelo.beans.Eneagrama;
import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionTest
 */
@WebServlet("/GestionTest")
public class GestionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionTest() {
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

		Usuario usu;
		usu = (Usuario) request.getSession().getAttribute("usuario");
		UsuarioDAOImpl udao = new UsuarioDAOImpl();		
		Eneagrama userValues = usu.getEneagrama();
			
		Anuncio anuncio = null;
		AnuncioDAOImpl anundao = new AnuncioDAOImpl();

		switch (request.getParameter("option")) {

		case "validar":

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			} else if (usu.getTipoEneagrama() == null) {
				request.getRequestDispatcher("pantallaTests.jsp").forward(request, response);
			} else if (usu.getEneagrama() != null) {
				request.getSession().setAttribute("anuncio", anundao.findByID(userValues.getIdEneagrama()));
				request.getRequestDispatcher("anuncios.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			System.out.println("aqui");
			System.out.println(usu);

			break;
		}

	}

}
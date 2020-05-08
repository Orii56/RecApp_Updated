package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.EneagramaDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Eneagrama;
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
		UsuarioDAOImpl udao = new UsuarioDAOImpl();

		System.out.println("usuario dentro del dashboard " + usu.getNombre());
		
		
		//Dashboard eneagrama
		Eneagrama ene = null;
		EneagramaDAOImpl edao = new EneagramaDAOImpl();
		
		// request.getSession().setAttribute("usuario", usu);

		switch (request.getParameter("option")) {

		case "dash":

			if (usu != null) {
				
				request.getSession().setAttribute("cu", usu);
				
				if(usu.getTipoEneagrama() != null) {
					System.out.println("entre en el if");
					ene = usu.getEneagrama();
				
					System.out.println(ene.getTipo());
				
					request.getSession().setAttribute("eu", ene);			
				
				}
				
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);	
			
			}

			break;

		case "nombre":

			request.getRequestDispatcher("cambiarNombre.jsp").forward(request, response);

			break;

		case "pwd":

			request.getRequestDispatcher("cambiarPwd.jsp").forward(request, response);

			break;

		case "name-change":

			request.getParameter("name");
			System.out.println("nuevo nombre: " + request.getParameter("name"));
			usu.setNombre(request.getParameter("name"));
			udao.insert(usu);

			request.getRequestDispatcher("dashboard.jsp").forward(request, response);

			break;

		case "pwd-change":

			request.getParameter("pwd");
			System.out.println("nueva contrasena: " + request.getParameter("pwd"));
			usu.setPassword(request.getParameter("pwd"));
			udao.insert(usu);

			request.getRequestDispatcher("dashboard.jsp").forward(request, response);

			break;

		case "test":
			
			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			} else if (usu.getEneagrama() == null) {
				request.setAttribute("mensaje_error", "Primero, realice el test y despues podra repetirlo.");
				request.getRequestDispatcher("pantallaTests.jsp").forward(request, response);
			} else {
				
				usu.setEneagrama(null);
				usu.setResultadoRapido(null);
				usu.setResultadoTest(0);
				usu.setTipoEneagrama(null);
				usu.setTipoRapido(null);
				
				udao.insert(usu);
				
				request.getSession().removeAttribute("idEneag");
				request.getSession().removeAttribute("id");
				request.getSession().removeAttribute("mapa");
				request.getSession().removeAttribute("letra1");
				request.getSession().removeAttribute("idRapido");
				
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			break;
			
		case "delete":
			
			System.out.println(usu.getEmail());
			udao.deleteUser(usu.getEmail());
			
			request.getSession().removeAttribute("usuario");
			request.getSession().removeAttribute("idEneag");
			request.getSession().removeAttribute("id");
			request.getSession().removeAttribute("mapa");

			request.getSession().invalidate();

			request.getRequestDispatcher("index.jsp").forward(request, response);

			
			break;

		}
	}

}

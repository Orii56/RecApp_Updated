package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.DAOS.EneagramaDAOImpl;
import modelo.DAOS.PreguntaDAOImpl;
import modelo.DAOS.ResultadoRapidoDAO;
import modelo.DAOS.ResultadoRapidoDAOImpl;
import modelo.DAOS.TestRapidoDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Eneagrama;
import modelo.beans.Pregunta;
import modelo.beans.Resultadorapido;
import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionPreguntas
 */
@WebServlet("/GestionPreguntas")
public class GestionPreguntas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionPreguntas() {
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

		// Logica Test Completo //

		EneagramaDAOImpl edao = new EneagramaDAOImpl();
		PreguntaDAOImpl pdao = new PreguntaDAOImpl();

		Usuario usu;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");

		HttpSession sesionQuestion = request.getSession();
		Integer tipoEneagrama = (Integer) sesionQuestion.getAttribute("id");
		Integer idEneagrama = (Integer) sesionQuestion.getAttribute("idEneag");

		List<Integer> arrayResultadoPreguntas = null;

		HashMap<Integer, Integer> cantidadPreguntas = (HashMap<Integer, Integer>) sesionQuestion.getAttribute("mapa");

		if (cantidadPreguntas == null) {
			cantidadPreguntas = new HashMap<Integer, Integer>();
		}

		// Logica Test Rapido //

		TestRapidoDAOImpl tdao = new TestRapidoDAOImpl();
		Integer grupoRapido = (Integer) sesionQuestion.getAttribute("idRapido");

		ResultadoRapidoDAOImpl rdao = new ResultadoRapidoDAOImpl();

		List<String> combi = null;

		String letra1 = (String) sesionQuestion.getAttribute("letra1");
		String grupos;

		if (combi == null) {
			combi = new ArrayList<String>();
		}

		///////////////////////

		switch (request.getParameter("option")) {

		case "question":

			//L�gica del Test Completo
			
			if (tipoEneagrama == null || idEneagrama == null) {
				
				//Si a�n no tienen valores, los asignamos
				
				tipoEneagrama = 1;

				idEneagrama = 1;

		
				if (request.getParameterValues("isbn") != null) {

					//Guarda los valores de la primera pantalla de preguntas

					if (arrayResultadoPreguntas == null) {
						arrayResultadoPreguntas = new ArrayList<Integer>();
					}

					for (String ele : request.getParameterValues("isbn")) {
						arrayResultadoPreguntas.add(Integer.valueOf(request.getParameter("cantidad" + ele)));
					}

				}

			} else {

				//Si ya existen tipoEneagrama e idEneagrama, los aumentamos
				//Mostramos as� las preguntas del siguiente eneagrama
				tipoEneagrama++;

				idEneagrama++;

				if (arrayResultadoPreguntas == null) {
					arrayResultadoPreguntas = new ArrayList<Integer>();
				}

				String[] isbns = request.getParameterValues("isbn");

				//Guardamos los valores de cada pantalla de preguntas


				if (isbns != null) {
					
					for (String ele : request.getParameterValues("isbn")) {
						arrayResultadoPreguntas.add(Integer.valueOf(request.getParameter("cantidad" + ele)));
					}
					
					
					int num = 0;

					for (Integer l : arrayResultadoPreguntas) {
						num += l;
					}

					//Creamos un mapa con el idEneagrama y el valor que obtuvo de las preguntas
					
					cantidadPreguntas.put(idEneagrama, num);
					
					sesionQuestion.setAttribute("mapa", cantidadPreguntas);
				}

			}

			// Es aqu� donde se imprimen las preguntas para cada Eneagrama
			
			request.setAttribute("tipoEne", edao.findEneagrama(idEneagrama));

			List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama);

			request.setAttribute("preguntas", lista);

			sesionQuestion.setAttribute("idEneag", idEneagrama);

			sesionQuestion.setAttribute("id", tipoEneagrama);

			if (tipoEneagrama > 9) {
				
				//Ya hemos recorrido todos los Eneagramas

				boolean mayor20 = false;
				Integer numID = null;
				int max = 19;

				List<Integer> t = new ArrayList<>();
				List<Integer> z = new ArrayList<>();

				for (Integer en : cantidadPreguntas.keySet()) {

					t.add(cantidadPreguntas.get(en));

				}

				for (int i = 0; i < t.size(); i++) {

					if (t.get(i) > max) {
						max = t.get(i);
						numID = (i + 1);
						mayor20 = true;
						
						// Como max empieza en 19, ya estas controlando que sea mayor/igual a 20
					}
				}

				for (int i = 0; i < t.size(); i++) {

					if (t.get(i) == max) {

						numID = (i + 1);
						z.add(numID);

						// volvemos a recorrer para ver si hay mas de uno con esa cantidad

					}
				}

				if (z.size() > 1) {

					//Si tenemos 2 Eneagramas con el mismo valor hacemos un desempate
					
					if (z.size() > 2) {
						
						//Si tenemos m�s de 2 Eneagramas con el mismo valor, damos el test por invalido

						mayor20 = false;

						sesionQuestion.removeAttribute("idEneag");
						sesionQuestion.removeAttribute("id");
						sesionQuestion.removeAttribute("mapa");
						sesionQuestion.removeAttribute("descTipo");

						usu = (Usuario) request.getSession().getAttribute("usuario");

						request.getRequestDispatcher("testIncorrecto.jsp").forward(request, response);

					}

					//L�gica del Desempate
					
					List<Pregunta> listaA = pdao.findByTipoEneg(z.get(0));
					List<Pregunta> listaB = pdao.findByTipoEneg(z.get(1));

					sesionQuestion.setAttribute("tipoEneA", edao.findEneagrama(z.get(0)));

					sesionQuestion.setAttribute("tipoEneB", edao.findEneagrama(z.get(1)));

					request.setAttribute("preguntaA", listaA);
					request.setAttribute("preguntaB", listaB);

					//Nos lleva a las preguntas extra
					request.getRequestDispatcher("preguntaExtra.jsp").forward(request, response);

				}

				if (mayor20) {

					//Tenemos un eneagrama valido /o/

					sesionQuestion.setAttribute("descTipo", edao.findEneagrama(numID));

					Eneagrama userValues = (Eneagrama) sesionQuestion.getAttribute("descTipo");

					usu.setEneagrama(userValues);
					usu.setTipoEneagrama(userValues.getTipo());
					usu.setResultadoTest(max);

					udao.insert(usu);

					//Le enviamos la informaci�n del Eneagrama a la pantalla resultado
					request.getRequestDispatcher("resultado.jsp").forward(request, response);

				} else {

					//Si no tenemos ningun Eneagrama con un valor 
					//lo suficientemente alto para ser escogido
					//terminamos en testIncorrecto
					
					sesionQuestion.removeAttribute("idEneag");
					sesionQuestion.removeAttribute("id");
					sesionQuestion.removeAttribute("mapa");
					sesionQuestion.removeAttribute("descTipo");
				

					usu = (Usuario) request.getSession().getAttribute("usuario");

					request.getRequestDispatcher("testIncorrecto.jsp").forward(request, response);
				}

			} else {

				//Mientras no se hayan superado las 9 pantallas de preguntas, 
				//Seguimos trabajando en question.jsp
				request.getRequestDispatcher("question.jsp").forward(request, response);
			}

			break;

		case "extra":

			
			//En caso de un empate

			int a = 0;
			int b = 0;

			//Sacamos las preguntas extras
			for (int i = 6; i <= 7; i++) {
				request.getParameterValues("isbn");
				a += Integer.valueOf(request.getParameter("cantidadA" + i));

				b += Integer.valueOf(request.getParameter("cantidadB" + i));

			}

			int numID = 0;

			if (a != b) {
				if (a > b) {

					//Eneagrama A es mayor
					Eneagrama res = (Eneagrama) sesionQuestion.getAttribute("tipoEneA");
					numID = res.getIdEneagrama();
						}
				if (a < b) {

					//Eneagrama B es mayor
					Eneagrama res = (Eneagrama) sesionQuestion.getAttribute("tipoEneB");
					numID = res.getIdEneagrama();

				}

			} else {
				
				//Vuelven a empatar, llevamos a testIncorrecto.

				sesionQuestion.removeAttribute("idEneag");
				sesionQuestion.removeAttribute("id");
				sesionQuestion.removeAttribute("mapa");
				sesionQuestion.removeAttribute("descTipo");

				usu = (Usuario) request.getSession().getAttribute("usuario");

				request.getRequestDispatcher("testIncorrecto.jsp").forward(request, response);
			}

			//Establecemos max a 20 por conveniencia. 
			//Es un dato que a priori no tiene una funci�n pero se guarda en la BD
			
			int max = 20;

			sesionQuestion.setAttribute("descTipo", edao.findEneagrama(numID));

			Eneagrama userValues = (Eneagrama) sesionQuestion.getAttribute("descTipo");

			usu.setEneagrama(userValues);
			usu.setTipoEneagrama(userValues.getTipo());
			usu.setResultadoTest(max);

			udao.insert(usu);

			//Insertamos el usuario y le pasamos la informacion a la pantalla de resultados
			request.getRequestDispatcher("resultado.jsp").forward(request, response);

		case "rapido":

			if (grupoRapido == null) {

				grupoRapido = 1;

			} else {

				grupoRapido++;

				sesionQuestion.setAttribute("letra1", request.getParameter("letra"));

				combi.add((String) sesionQuestion.getAttribute("letra1"));

			}

			request.setAttribute("preguntas", tdao.findByID(grupoRapido));
			sesionQuestion.setAttribute("idRapido", grupoRapido);

			if (grupoRapido > 2) {

				grupos = letra1 + combi.get(0).toString();

				Resultadorapido rdo = rdao.findByCombinacion(grupos);

				sesionQuestion.setAttribute("descTipo", edao.findEneagrama(rdo.getIdEneatipo()));

				usu.setResultadoRapido(grupos);
				usu.setTipoRapido(rdo.getEneatiporapido());
				usu.setTipoEneagrama(rdo.getEneatiporapido());
				usu.setEneagrama(edao.findEneagrama(rdo.getIdEneatipo()));
				
				udao.insert(usu);

				request.getRequestDispatcher("resultado.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("questionRapido.jsp").forward(request, response);
			}

			break;

		}
	}
}

package modelo.DAOS;

import modelo.beans.Resultadorapido;

public interface ResultadoRapidoDAO {
	
	public Resultadorapido findByCombinacion(String letras);
}

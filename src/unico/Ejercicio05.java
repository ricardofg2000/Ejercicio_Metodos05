package unico;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que, mediante un booleano, indique si el carácter que
		 * se pasa como parámetro de entrada corresponde con una vocal.
		 */
		final String VOCAL = "El caracter es una vocal";
		final String NO_VOCAL = "El caracter no es una vocal o has introducido mal la entrada";

		String entrada;
		String mensaje;
		boolean respuesta;

		entrada = Util.leerString("Introduzca un caracter: ");

		respuesta = esVocal(entrada);
		mensaje = respuesta ? VOCAL : NO_VOCAL;
		
		Util.escribir(mensaje);
	}

	public static boolean esVocal(String entrada) {
		boolean resultado = false;
		if (entrada.equalsIgnoreCase("a") | entrada.equalsIgnoreCase("e") | entrada.equalsIgnoreCase("i")
				| entrada.equalsIgnoreCase("o") | entrada.equalsIgnoreCase("u")) {
			resultado = true;
		}
		return resultado;

	}

}

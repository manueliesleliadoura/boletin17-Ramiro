package boletin17junit;

public class DNI {

	/* Generar número aleatorio del DNI */
	int numeroAleatorio = (int) (Math.random() * 99999999 + 1);

	/* Cálculo de letra del DNI */
	char calculaLetra(String dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (dni.length() != 9) {
			return 0;
		}

		int num = 0;

		return juegoCaracteres.charAt(num % 23);
	}

	public boolean eValido(String dni) {

		if (dni.length() != 9)
			return false;

	}

	public boolean eValido(ArrayList<Integer> dni) {
		
		if (dni.size() != 9);
		return false;
	
		int num = 0;
		
	
	}

}

package boletin17junit;

public class DNI {

	/* Generar número aleatorio del DNI */
	int numeroAleatorio = (int) (Math.random() * 99999999 + 1);

	/* Cálculo de letra del DNI */
	char calculaLetra(String dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (dni.length() != 8) {
			return 0;
		}

		int num = 0;

		return juegoCaracteres.charAt(num % 23);
	}
}

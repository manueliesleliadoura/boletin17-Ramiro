package boletin17junit;

public class DNI {

	/* Generar n�mero aleatorio del DNI */
	int numeroAleatorio = (int) (Math.random() * 99999999 + 1);

	/* C�lculo de letra del DNI */
	char calculaLetra(String dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (dni.length() != 8) {
			return 0;
		}

		int num = 0;

		return juegoCaracteres.charAt(num % 23);
	}
}

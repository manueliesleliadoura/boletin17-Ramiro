package boletin17junit;

public class DNI {

	/* Genrar número aleatorio del DNI */
	int numeroAleatorio = (int) (Math.random() * 25 + 1);

	/* Cálculo de letra del DNI */
	char calculaLetra(int dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		return letra;
	}
}

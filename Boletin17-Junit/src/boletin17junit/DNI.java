package boletin17junit;

public class DNI {
/**
 * Recibe un numero DNI y comprueba
 * @param dniletra
 * @return boolean
 */
	boolean eValido(String dniletra) {

		String Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (dniletra.length() != 8) {

		}
		if (dniletra.length() == 9) {

			for (int i = 0; i < 7; i++) {

				char dni = dniletra.charAt(i);
				if (dni >= 0 || dni == 9)
					return true;

				int dniL = Integer.parseInt(dniletra);
				int letrares = dni % 23;
				char letra = Caracteres.charAt(letrares);

			}
			return true;
		}
		return false;
	}
/**
 * Calcula la letra para el DNI
 * @param numdni
 * @return 
 */
	/* Cálculo de letra del DNI */
	int calculaLetra(String numdni) {

		if (numdni.length() != 8) {
			return -1;
		}

		int num = Integer.parseInt(numdni);
		int letrares = num % 23;

		String CaracteresC = "TRWAGMYFPDXBNJZSQVHLCKE";

		char Letra = CaracteresC.charAt(letrares);

		int numint = Integer.parseInt(numdni);

		int Caracter = numint % 23;

		char letra = CaracteresC.charAt(Caracter);
		return Letra;
	}

	/*
	 * public boolean eValido(ArrayList<Integer> dni) {
	 * 
	 * String Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
	 * 
	 * if (dni.size() != 9) return false;
	 * 
	 * int num = 0; for (int i = 0; i < 8; i++) { num += dni.get(i) *
	 * Math.pow(10, 7 - i); }
	 * 
	 * char validChar = Caracteres[num % 23];
	 * 
	 * if (dni.get(8) == validChar || dni.get(8) ==
	 * Character.toLowerCase(validChar)) { return true; } else { return false; }
	 * }
	 * 
	 * public int calculaLetra(ArrayList<Integer> numero_dni) { String
	 * Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
	 * 
	 * if (numero_dni.size() != 8) return 0;
	 * 
	 * int num = 0; for (int i = 0; i < 8; i++) { num += numero_dni.get(i) *
	 * Math.pow(10, 7 - i); } return Caracteres[num % 23]; }
	 */
}

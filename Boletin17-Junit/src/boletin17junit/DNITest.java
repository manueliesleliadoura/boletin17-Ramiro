package boletin17junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class DNITest {

	DNI dni = new DNI();

	@Test
	public void testeValido() {

		equals(dni.eValido("53486688G"));
		equals(dni.eValido("00000000k"));
		equals(dni.eValido("000000007K"));
		equals(dni.eValido("00000000kK"));

	}

	@Test
	public void testcalculaLetra() {

		equals(dni.eValido("53486688"));
		equals(dni.eValido("00000000"));
		equals(dni.eValido("000000007"));
		equals(dni.eValido("00000000k"));

	}

}

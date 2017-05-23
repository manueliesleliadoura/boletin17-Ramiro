package boletin17junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class XeometriaTest {

	Xeometria xeometria = new Xeometria();

	@Test
	public void testperimetroCadrado() {
		assertEquals(xeometria.perimetroCadrado(1), 4);
		assertEquals(xeometria.perimetroCadrado(10), 40);

	}

	@Test
	public void testareaCadrado() {
		assertEquals(xeometria.perimetroCadrado(2), 4);
		assertEquals(xeometria.perimetroCadrado(10), 100);

	}

}

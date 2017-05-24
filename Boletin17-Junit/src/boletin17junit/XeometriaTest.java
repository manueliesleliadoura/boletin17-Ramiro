package boletin17junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class XeometriaTest {

	Xeometria xeometria = new Xeometria();

	@Test
	public void testperimetroCadrado() {
		assertEquals(xeometria.perimetroCadrado(1), 4);
		assertEquals(xeometria.perimetroCadrado(10), 40);
		assertEquals(xeometria.perimetroCadrado(-1), -1);

	}

	@Test
	public void testareaCadrado() {
		assertEquals(xeometria.areaCadrado(2), 4);
		assertEquals(xeometria.areaCadrado(10), 100);
		assertEquals(xeometria.areaCadrado(-1), -1);

	}

	@Test
	public void testteoremaPitagoras() {
		equals(xeometria.teoremaPitagoras(1, 1));
		equals(xeometria.teoremaPitagoras(10, 10));
		equals(xeometria.teoremaPitagoras(-10, -10));

	}

	@Test
	public void testteoremaPitagorashp() {
		equals(xeometria.teoremaPitagorashp(1, 1));
		equals(xeometria.teoremaPitagorashp(10, 10));
		equals(xeometria.teoremaPitagoras(-10, -10));

	}

}

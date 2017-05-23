package boletin17junit;

import java.lang.Math;

public class Xeometria {

	/**
	 * Recibe un valor para lado y devuelve perimetro
	 * 
	 * @param lado
	 * @return perimetro
	 */
	public int perimetroCadrado(int lado) {
		int perimetro;

		// esta hipotetica operacion la tendremos en cuenta para dar un
		// resultado negativo
		if (lado <= 0)
			return -1;

		perimetro = lado * 4;

		return perimetro;
	}

	/**
	 * Recibe un valor para lado y devuelve area
	 * 
	 * @param lado
	 * @return area
	 */
	public int areaCadrado(int lado) {
		int area;

		// mismo caso de arriba
		if (lado <= 0)
			return -1;

		area = ( lado * lado);

		return area;

	}

	/**
	 * Recibe valores para los catetos y devuelve la hipotenusa
	 * 
	 * @param catetoA
	 * @param catetoB
	 * @return hipotenusa
	 */

	public double teoremaPitagoras(int catetoA, int catetoB) {

		// mismo procedimiento que arriba, desechar aquellas operaciones que
		// no se puedan hacer
		if (catetoA <= 0 || catetoB <= 0) {
			return -1;
		}

		/* Me ahorro poner la variable hipotenusa */
		return Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
	}

	/**
	 * Recibe valores para la hipotenusa y uno de los catetos
	 * 
	 * @param catetoA
	 * @param hipotenusaC
	 * @return catetoB
	 */

	public double teoremaPitagorashp(double catetoA, double hipotenusaC) {

		// desechar las operaciones que no tienen sentido
		if (catetoA <= 0 || hipotenusaC <= 0) {
			return -1;
		}
		/*
		 * Lo mismo que arriba, pero en este caso me ahorro la variable cateto
		 */
		return Math.sqrt((hipotenusaC * hipotenusaC) - (catetoA * catetoA));

	}
}

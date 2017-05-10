package boletin17junit;

import java.lang.Math;

public class Xeometria {

	public int perimetroCadrado(int lado) {
		int perimetro;

		perimetro = lado * 4;

		return perimetro;
	}

	public int areaCadrado(int lado) {
		int area;

		area = lado * lado;

		return area;

	}

	public double teoremaPitagoras(int catetoA, int catetoB) {

		/* Me ahorro poner la variable hipotenusa */
		return Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
	}

	public double teoremaPitagoras(double catetoA, double hipotenusaC) {

		/*
		 * Lo mismo que arriba, pero en este caso me ahorro la variable cateto
		 */
		return Math.sqrt((hipotenusaC * hipotenusaC) - (catetoA * catetoA));

	}
}

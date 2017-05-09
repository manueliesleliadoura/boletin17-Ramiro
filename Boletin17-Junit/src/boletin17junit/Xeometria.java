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
		double hipotenusaC;

		hipotenusaC = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

		return hipotenusaC;
	}

	public double teoremaPitagoras(double catetoA, double hipotenusaC) {
		double catetoB;

		catetoB = Math.sqrt((hipotenusaC * hipotenusaC) - (catetoA * catetoA));

		return catetoB;

	}
}

package Boletin17;

public class Xeometr�a {

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

		hipotenusaC = ((catetoA * catetoA) + (catetoB * catetoB));

		return hipotenusaC;
	}
}
package model.entities;

public class Circle implements Shape {

	private static final double PI = 3.14;
	private double raio;

	public Circle() {

	}

	public Circle(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Circunferencia - ");
		sb.append("Area: ");
		sb.append(Area());
		return sb.toString();
	}

	@Override
	public Double Area() {
		return 2 * PI * raio;
	}

}

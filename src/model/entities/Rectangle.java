package model.entities;

public class Rectangle implements Shape {
	private double base;
	private double altura;

	public Rectangle() {

	}

	public Rectangle(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Retangulo - ");
		sb.append("Area: ");
		sb.append(Area());
		return sb.toString();
	}

	@Override
	public Double Area() {
		return base * altura;
	}

}

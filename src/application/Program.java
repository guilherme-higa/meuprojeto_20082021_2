package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho do arquivo:");
		String file = sc.next();
		String[] vet;

		List<Shape> shapes = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				vet = line.split(",");
				if (vet[0].contentEquals("Circulo")) {
					shapes.add(new Circle(Double.parseDouble(vet[1])));

				} else {
					shapes.add(new Rectangle(Double.parseDouble(vet[1]), Double.parseDouble(vet[2])));
				}
				line = br.readLine();
			}
			System.out.println();
			for (Shape x : shapes) {
				System.out.println(x);
			}
			System.out.println();
			System.out.print("SOMATORIA DAS ÁREAS:");
			System.out.print(areaTotal(shapes));

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}
	
	public static double areaTotal(List<Shape> list) {
		double sum = 0;
		for(Shape x : list) {
			 sum += x.Area();
		}
		return sum;
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circle;
import entities.Rectangle02;
import entities.Shape;
import entities.enums.Color;

public class Program30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i +" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (resp == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape shape = new Rectangle02(color, width, height);
				list.add(shape);
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape shape = new Circle(color, radius);
				list.add(shape);
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangleX: ");
		xA = sc.nextDouble();
		xB= sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangleY: ");
		yA = sc.nextDouble();
		yB= sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) /2.0;
		double areaX = Math.sqrt(p* (p - xA) * (p - xB) * (p-xC));
		
		p = (yA + yB + yC) /2.0;
		double areaY = Math.sqrt(p* (p - yA) * (p - yB) * (p-yC));
		
		System.out.printf("Triangle X area: %4f%n", areaX);
		System.out.printf("Triangle X area: %4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X: " + areaX);
		} else {
			System.out.println("Larger area: Y: " + areaY);
		}
		sc.close();
	}

}

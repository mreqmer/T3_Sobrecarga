package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Var
		Scanner sc = new Scanner(System.in);
		int n1E, n2E;
		double n1D, n2D;
		
		System.out.println("Introduce el primer número entero: ");
		n1E = sc.nextInt();
		System.out.println("Introduce el segundo número entero: ");
		n2E = sc.nextInt();
		int mediaE = Media.calcMedia(n1E, n2E);
		System.out.println("La media es: " + mediaE);
		
		System.out.println("Introduce el primer número decimal: ");
		n1D = sc.nextDouble();
		System.out.println("Introduce el segundo número decimal: ");
		n2D = sc.nextDouble();
		
		double mediaD = Media.calcMedia(n1D, n2D);
		System.out.println("La media es: " + mediaD);
		n2D = sc.nextDouble();
		
		
	}

}

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n1E, n2E;
		double n1D, n2D;
		
		//Pide dos números enteros
		System.out.println("Introduce un número entero: ");
		n1E = sc.nextInt();
		System.out.println("Introduce otro número entero: ");
		n2E = sc.nextInt();
		//Llama la funciónde suma entera y la muestra
		int sumaEnt = Suma.suma(n1E, n2E);
		System.out.println("La suma de los números enteros es " + sumaEnt);
		//Pide dos números decimales
		System.out.println("Introduce un número decimal: ");
		n1D = sc.nextDouble();
		System.out.println("Introduce otro número decimal: ");
		n2D = sc.nextDouble();
		//Llama a la función de suma de decimales y la muestra
		double sumaDec = Suma.suma(n1D, n2D);
		System.out.println("La suma de los números decimales es: " + sumaDec);

		sc.close();
	}

}

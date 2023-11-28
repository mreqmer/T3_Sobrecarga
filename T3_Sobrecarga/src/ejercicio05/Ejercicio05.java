package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Var
		Scanner sc = new Scanner(System.in);
		// guarda la cantidad de números random a generar
		int nA;
		// guarda la cantidad de números random a generar y el máximo de cada número
		int nB, vMaxB;
		// guarda la cantidad de números random a generar y el máximo y mínimo de cada número
		int nC, vMaxC, vMinC;
		// Pide la cantidad de números aleatorios al usuario
		System.out.print("Introduce una cantidad de números aleatios a generar: ");
		nA = sc.nextInt();
		// llama a la función para generar n números aleatorios y lo muestra

		GeneraAleatorio.generaAleatorio(nA);

		// pide los datos
		System.out.println("\nIntroduce una cantidad de números aleatios a generar: ");
		nB = sc.nextInt();
		System.out.println("Introduce el máximo del número random: ");
		vMaxB = sc.nextInt();
		// llama a la función para generar n números aleatorios con un máximo y lo
		// muestra
		GeneraAleatorio.generaAleatorio(nB, vMaxB);
		// pide los datos
		System.out.println("\nIntroduce una cantidad de números aleatios a generar: ");
		nB = sc.nextInt();
		System.out.println("Introduce el máximo del número random: ");
		vMaxB = sc.nextInt();
		// llama a la función para generar n números aleatorios con un máximo y lo
		// muestra
		GeneraAleatorio.generaAleatorio(nB, vMaxB);
		
		
		//// pide los datos
		System.out.println("\nIntroduce una cantidad de números aleatios a generar: ");
		nC = sc.nextInt();
		System.out.println("Introduce el máximo del número random: ");
		vMaxC = sc.nextInt();
		System.out.println("Introduce el mínimo del número random: ");
		vMinC = sc.nextInt();
		GeneraAleatorio.generaAleatorio(nC, vMaxC, vMinC);
	}

}

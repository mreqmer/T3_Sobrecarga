package ejercicio05;

import java.util.Random;

public class GeneraAleatorio {

	public static void generaAleatorio(int nA) {
		// Var
		Random rand = new Random();
		int randomA = 0;
		// genera n números aleatorios
		for (int i = 1; i <= nA; i++) {

			randomA = rand.nextInt(0, 2);
			System.out.print(randomA + " ");
		}
	}

	public static void generaAleatorio(int nB, int vMaxB) {
		Random rand = new Random();
		int randomB = 0;
		for (int i = 1; i <= nB; i++) {

			randomB = rand.nextInt(0, (vMaxB + 1));
			System.out.print(randomB + " ");
		}
	}

	public static void generaAleatorio(int nC, int vMaxC, int vMinC) {
		Random rand = new Random();
		int randomC = 0;
		for (int i = 1; i <= nC; i++) {

			randomC = rand.nextInt(0, (vMaxC + vMinC));
			System.out.print(randomC + " ");
		}

	}
}

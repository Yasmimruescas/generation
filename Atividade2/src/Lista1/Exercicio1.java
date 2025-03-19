package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		float nA, nB, nC;

		System.out.println("Digite o número A: ");
		nA = lerScanner.nextFloat();

		System.out.println("Digite o número B: ");
		nB = lerScanner.nextFloat();

		System.out.println("Digite o número C: ");
		nC = lerScanner.nextFloat();

		float nS = nA + nB;

		if (nS > nC) {
			System.out.printf("%.1f + %.1f = %.1f > %.1f \nA Soma de A + B é Maior do que C ", nA, nB, nS, nC);
		}

		else if (nS < nC) {
			System.out.printf("%.1f + %.1f = %.1f < %.1f \nA Soma de A + B é Menor do que C ", nA, nB, nS, nC);
		} else {
			System.out.printf("%.1f + %.1f = %.1f = %.1f \nA Soma de A + B é Igual a C ", nA, nB, nS, nC);
		}

		lerScanner.close();
	}
}

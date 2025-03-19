package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número: ");
		numero = lerScanner.nextInt();

		if (numero % 2 == 0 && numero != 0) {
			System.out.printf("O número %d é par e %s !", numero, (numero < 0) ? "negativo" : "positivo");
		} else if (numero % 2 != 0) {
			System.out.printf("O número %d é impar e %s !", numero, (numero < 0) ? "negativo" : "positivo");
		} else {
			System.out.printf("O número %d ele é par e neutro!", numero);
		}

		lerScanner.close();
	}
}
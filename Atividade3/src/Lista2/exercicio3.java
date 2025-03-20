package Lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero, menor21 = 0, idadeMeio = 0, maiorIdade = 0;

		while (true) {
			System.out.println("Escreva sua idade: ");
			numero = leitor.nextInt();

			if (numero <= 21 && numero >= 1) {
				menor21++;
			} else if (numero > 21 && numero < 50) {
				idadeMeio++;
			} else if (numero >= 50) {
				maiorIdade++;
			} else if ((numero < 0)) {
				break;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas entre 21 e 50 anos: " + idadeMeio);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);

	}
}

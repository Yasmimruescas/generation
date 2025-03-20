package Lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite o primeiro número: ");
		numero1 = leitor.nextInt();

		System.out.println("Digite o segundo número: ");
		numero2 = leitor.nextInt();

		if (numero1 < numero2) {
			
		System.out.printf("\nNo intervalo entre %d e %d", numero1, numero2);
		boolean encontrouMultiplo = false;
			
		for (int i = numero1; i <= numero2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d é múltiplo de 3 e 5%n", i);
				encontrouMultiplo = true;
			}
		}

		if (encontrouMultiplo == false) {
			System.out.println("\nNenhum múltiplo de 3 e 5 encontrado.");
			}
		}
		else if(numero1 > numero2) {
			System.out.println("Intervalo inválido");
	 }
		leitor.close();
	}
}

package ListaVetores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		int[] listaNumeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");

		int numeroDigitado = leitor.nextInt();
		boolean numeroEncontrado = false;

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] == numeroDigitado) {
				System.out.println("O número " + numeroDigitado + " está localizado na posição: " + i);
				numeroEncontrado = true;
			}
		}

		if (!numeroEncontrado) {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		leitor.close();
	}
}

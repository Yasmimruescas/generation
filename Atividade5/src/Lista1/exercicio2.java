package Lista1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> setNumeros = new ArrayList<>();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("Lista de números: " + setNumeros);
		System.out.println("Digite qual número você quer encontrar: ");

		try (Scanner scanner = new Scanner(System.in)) {
			int numero = scanner.nextInt();

			if (setNumeros.contains(numero)) {
				int posicao = setNumeros.indexOf(numero);
				System.out.println("O número " + numero + " está na posição: " + posicao);
			} else {
				System.out.println("O número " + numero + " não foi encontrado.");
			}

		} catch (InputMismatchException e) {
			System.out.println("Error: " + e);
		}
	}
}
package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;

		do {
			System.out.println("***********************");
			System.out.println("Menu:");
			System.out.println("1: Colocar um novo livro à pilha!");
			System.out.println("2: Listar todos os livros da pilha!");
			System.out.println("3: Retirar um livro da pilha!");
			System.out.println("0: Finalizar o programa!");
			System.out.println("***********************");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nomeLivro = scanner.nextLine();
				livros.push(nomeLivro);
				System.out.println(nomeLivro + " foi adicionado!.");
				break;

			case 2:
				if (livros.isEmpty()) {
					System.out.println("Não há livros na pilha!");
				} else {
					System.out.println("Livros na pilha: ");
					for (String item : livros) {
						System.out.println(item);
					}
				}
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("Nenhum há livros para retirar.");
				} else {
					String livroRetirado = livros.pop();
					System.out.println("Livro \"" + livroRetirado + "\" retirado da pilha.");
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
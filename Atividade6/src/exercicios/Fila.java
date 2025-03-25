package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("***********************");
			System.out.println("Menu:");
			System.out.println("1- Adicionar um cliente na fila!");
			System.out.println("2- Listar todos os clientes da fila!");
			System.out.println("3- Chamar cliente da fila!");
			System.out.println("0- Sair");
			System.out.println("***********************");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println(nome + " foi adicionado à fila.");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("Fila vazia!");
				} else {
					System.out.println("Clientes na fila: ");
					for (String item : fila) {
						System.out.println(item);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("Nenhum cliente aguarda atendimento!");
				} else {
					String cliente = fila.poll();
					System.out.println(cliente + " foi chamado!");
				}
				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
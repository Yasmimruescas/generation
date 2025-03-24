package Lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor:");
			cores.add(scanner.nextLine());
		}
		System.out.println("\nCores selecionadas: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		System.out.println("\nCores selecionadas em ordem:");
		cores.sort(null);
		for (String cor : cores) {
			System.out.println(cor);
		}
		scanner.close();
	}
}
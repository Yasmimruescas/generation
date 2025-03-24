package Lista2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {

	public static void main(String[] args) {
		Set<Integer> setNumero = new HashSet<>();

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite 10 numeros");
			while (setNumero.size() < 10) {
				System.out.print("Digite um número: ");
				Integer numero = Integer.parseInt(scanner.nextLine());
				setNumero.add(numero);
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e);
		}
		Iterator<Integer> iterator = setNumero.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
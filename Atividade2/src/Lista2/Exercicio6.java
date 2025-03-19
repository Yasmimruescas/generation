package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int cargo;
		float salario;
		String nome;

		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(Locale.US);

		System.out.println("Digite seu nome:");
		nome = leitor.nextLine();

		System.out.println("Digite seu cargo:");
		cargo = leitor.nextInt();

		System.out.println("Digite seu sálario:");
		salario = leitor.nextFloat();

		switch (cargo) {
		case 1:
			System.out.printf("\nNome: %s \nCargo: Gerente \nSalário: R$ %.2f", nome, salario + (salario * 10 / 100));
			break;
		case 2:
			System.out.printf("\nNome: %s \nCargo: Vendedor \nSalário: R$ %.2f", nome, salario + (salario * 7 / 100));
			break;
		case 3:
			System.out.printf("\nNome: %s \nCargo: Supervisor \nSalário: R$ %.2f", nome, salario + (salario * 9 / 100));
			break;
		case 4:
			System.out.printf("\nNome: %s \nCargo: Motorista \nSalário: R$ %.2f", nome, salario + (salario * 6 / 100));
			break;
		case 5:
			System.out.printf("\nNome: %s \nCargo: Estoquista \nSalário: R$ %.2f", nome, salario + (salario * 5 / 100));
			break;
		case 6:
			System.out.printf("\nNome: %s \nCargo: Tecnico de T.I \nSalário: R$ %.2f", nome, salario + (salario * 8 / 100));
			break;
		default:
			System.out.printf("\nOlá %s , infelizmente o codigo digitado não existe!", nome);
			break;
		}

		leitor.close();
	}

}

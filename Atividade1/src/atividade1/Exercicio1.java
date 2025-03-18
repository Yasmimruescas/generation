package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		float salario, abono;
	
		System.out.println("Digite o salario: ");
        salario = scanner.nextFloat();
		
		
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
		scanner.close();
	}
}

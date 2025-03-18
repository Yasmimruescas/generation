package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		float nota1, nota2, nota3, nota4;
	
		System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		nota4 = scanner.nextFloat();
		
		
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String resultado = String.format("%.1f", media);
		
		System.out.println("Media final: " + resultado);
		
		scanner.close();
	}

}

package ListaVetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		    Scanner leitor = new Scanner(System.in);

		    int[] lista = new int[10];
		    double soma = 0;
		    double media;

		    for (int i = 0; i < 10; i++) {
		        System.out.print("Digite o número: ");
		        lista[i] = leitor.nextInt();
		    }

		    System.out.print("\nOs números ímpares são: ");
		    for (int i = 0; i < 10; i++) {
		        if (lista[i] % 2 != 0) {
		            System.out.print(lista[i] + " ");
		        }
		    }

		    System.out.print("\nOs números pares são: ");
		    for (int i = 0; i < 10; i++) {
		        if (lista[i] % 2 == 0) {
		            System.out.print(lista[i] + " ");
		        }
		    }

		    for (int i = 0; i < 10; i++) {
		        soma += lista[i];
		    }

		    System.out.println("\nA soma é: " + soma);

		    media = soma / 10;

		    System.out.println("\nA média é: " + media);

		    leitor.close();
		}
	}

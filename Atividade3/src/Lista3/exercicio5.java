package Lista3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

	        Scanner leitor = new Scanner(System.in);

	        int numero, total = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = leitor.nextInt();

	            if(numero > 0){
	                total += numero;
	            }
	        } while (numero != 0);

	        System.out.println("A soma dos números positivos é: " + total);

	        leitor.close();
	    }
}

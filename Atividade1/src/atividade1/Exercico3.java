package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			scanner.useLocale(Locale.US);

			float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
			System.out.println("Digite o salario bruto: ");
	        salarioBruto = scanner.nextFloat();
			
			
			System.out.println("Digite o adicional noturno: ");
			adicionalNoturno = scanner.nextFloat();
			
			System.out.println("Digite as horas extras: ");
	        horasExtras = scanner.nextFloat();
			
			
			System.out.println("Digite os descontos: ");
			descontos = scanner.nextFloat();
			
			
			float novoSalario = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
			
			System.out.println("Seu salário liquido é : " + novoSalario);
			
			scanner.close();
	}

}

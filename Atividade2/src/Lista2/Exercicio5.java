package Lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int codigoProduto, quantidade;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o codigo do produto que deseja: ");
		codigoProduto = leitor.nextInt();

		System.out.print("Quantidade do produto: ");
		quantidade = leitor.nextInt();

		switch (codigoProduto) {

		case 1:
			System.out.printf("Produto:Cachorro Quente \nValor total: R$ %.1f", quantidade * 10.0f);
			break;

		case 2:
			System.out.printf("Produto:X-Salada \nValor total: R$ %.1f", quantidade * 15.0f);
			break;

		case 3:
			System.out.printf("Produto:X-Bacon \nValor total: R$ %.1f", quantidade * 18.0f);
			break;

		case 4:
			System.out.printf("Produto:Bauru \nValor total: R$ %f", quantidade * 12.0f);
			break;

		case 5:
			System.out.printf("Produto:Refrigerante \nValor total: R$ %f", quantidade * 8.0f);
			break;

		case 6:
			System.out.printf("Produto:Suco de laranja \nValor total: R$ %f", quantidade * 13.0f);
			break;

		default:
			System.out.printf("Não possuimos produto com o codigo %d", codigoProduto);
			break;
		}

		leitor.close();
	}
}

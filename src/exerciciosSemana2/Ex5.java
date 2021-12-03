package exerciciosSemana2;

import java.util.Scanner;

public class Ex5 {
	
	/* Com base em uma tabela, escreva um programa que leia o código
	 * de um item, a quantidade, e mostre o valor da conta a pagar.
	 * 
	 * 1 - Cachorro Quente - 4,00	|	2 - X-Salada - 4,50
	 * 3 - X-Bacon - 5,00			|   4 - Torrada Simples - 1,00
	 * 5 - Regrigerante - 1,50		|	6 - Suco Natural - 1,50		
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto e a quantidade: ");
		int codigoProduto = sc.nextInt();
		int quantidade = sc.nextInt();
		double valorTotal = 0;
		
		switch(codigoProduto) {
			case 1:
				valorTotal = 4.00 * quantidade; 
				break;
			case 2:
				valorTotal = 4.50 * quantidade;
				break;
			case 3:
				valorTotal = 5.00 * quantidade;
				break;
			case 4:
				valorTotal = 1.00 * quantidade;
				break;
			case 5:
				valorTotal = 1.50 * quantidade;
				break;
			case 6:
				valorTotal = 1.50 * quantidade;
				break;
		}
		
		System.out.printf("O valor total foi de: %2.2f.", valorTotal);

		sc.close();
	}

}

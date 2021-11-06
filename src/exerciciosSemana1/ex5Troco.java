package exerciciosSemana1;

import java.util.Scanner;

public class ex5Troco {
	
	/*Problema "troco"
	 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
	 * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
	 * e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
	 * mostrar o valor do troco a ser devolvido ao cliente.
	 * 
	 */

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		float preco;
		float dinheiroRecebido;
		int quantidade;
		float troco;
		
		System.out.println("Preco unitario do produto: ");
		preco = input.nextFloat();
		
		System.out.println("Quantidade comprada: ");
		quantidade = input.nextInt();
		
		System.out.println("Dinheiro recebido: ");
		dinheiroRecebido = input.nextFloat();
		
		troco = dinheiroRecebido - (preco * quantidade);
		System.out.printf("TROCO = %2.2f", troco);
		
		
	}
}

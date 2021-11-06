package exerciciosSemana1;

import java.util.Scanner;

public class ex6Pagamento {

	/* Problema "pagamento"
	 * Escreva um programa que leia o nome de ume funcionarie, o valor que elu
	 * recebe por hora e a quantidade de horas trabalhadas.
	 * Ao final, imprima o valor do pagamento com uma mensagem explicativa, conforme exemplo.
	 */
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		float valorHora = sc.nextFloat();
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		float pagamento = horasTrabalhadas * valorHora;
		System.out.format("O pagamento para " + nome + " deve ser %2.2f", pagamento);
	}
}

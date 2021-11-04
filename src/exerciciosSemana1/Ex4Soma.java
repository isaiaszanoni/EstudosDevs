package exerciciosSemana1;

import java.util.Scanner;

public class Ex4Soma {
	
	/*	Problema "soma"
	 * Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
	 * números.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = input.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = input.nextInt();
		
		int soma = x + y;
		System.out.println("SOMA = " + soma);
	}

}

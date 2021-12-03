package exerciciosSemana2;

import java.util.Scanner;

/* Escreva um programa capaz de ler um número inteiro e dizer se é par ou ímpar.
 * Write a code capable of reading an integer and showing it is "even" or "odd".
 */

public class Ex2 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println((number % 2 == 0) ? "Par" : "Impar");
		
		sc.close();
	}
}

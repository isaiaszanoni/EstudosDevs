package exerciciosSemana2;

import java.util.Scanner;

/* Leia 2 valores inteiros (A e B) em uma mesma linha. Depois mostre se
 * estes números são múltiplos entre si ou não.
 * Os números podem ser digitados em ordem crescente ou decrescente.
 */

public class Ex3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos.");
		} else {
			System.out.println("Nao sao Multiplos.");
		}
	}

}

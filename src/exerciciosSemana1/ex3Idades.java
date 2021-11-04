package exerciciosSemana1;

import java.util.Scanner;

public class ex3Idades {
	
	/* Problema "idades"
	 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
	 * nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nomePessoa1;
		String nomePessoa2;
		int idadePessoa1;
		int idadePessoa2;
		float media;

		System.out.print("Dados da primeira pessoa:\nNome:");
		nomePessoa1 = sc.nextLine();
		System.out.print("Idade:");
		idadePessoa1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: \nNome");
		nomePessoa2 = sc.nextLine();
		nomePessoa2 = sc.nextLine(); // repeti a entrada porque o programa estava com bug no scanner
		System.out.println("idade: ");
		idadePessoa2 = sc.nextInt();
		
		media = (float)(idadePessoa1 + idadePessoa2) / 2; 
		System.out.print("A média de idade entre " + nomePessoa1 + " e " + nomePessoa2 + " é de ");
		System.out.printf("%2.1f anos.", media);		
		
	}

}

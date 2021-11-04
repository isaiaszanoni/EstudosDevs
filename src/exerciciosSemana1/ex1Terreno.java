package exerciciosSemana1;

import java.util.Scanner;

public class ex1Terreno {
	
	/*
	 *  Problema "terreno"
	 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
	 * casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
	 * o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
	 * duas casas decimais, conforme exemplo.
	 * 
	 */
	
	public static void main(String[] args) {
	
		float largura;
		float comprimento;
		float area;
		float valorTerreno;
		float precoTerreno;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextFloat();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextFloat();
		
		System.out.println("Digite o valor do metro quadrado: ");
		valorTerreno = sc.nextFloat();
		
		area = largura * comprimento;
		
		precoTerreno = valorTerreno * area;
		
		System.out.printf("Area do terreno = %2.2f", area);
		
		System.out.printf("\nPreco do terreno = %2.2f", precoTerreno);
	}
}

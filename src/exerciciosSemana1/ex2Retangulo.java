package exerciciosSemana1;

import java.util.Scanner;
import java.lang.Math;

public class ex2Retangulo {
	
	/* Problema "retangulo"
	 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
	 * da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
	 * 
	 */
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float base;
		float altura;
		float area;
		float perimetro;
		float diagonal;
		
		System.out.println("Base do retangulo: ");
		base = sc.nextFloat();
		
		System.out.println("Altura do retangulo: ");
		altura = sc.nextFloat();
		
		area = base * altura;
		perimetro = (base + altura) * 2;
		diagonal = (float) Math.sqrt((base * base) + (altura * altura)) ;
				
		System.out.printf("AREA: %2.4f", area);
		System.out.printf("\nPERIMETRO: %2.4f",perimetro);
		System.out.printf("\nDIAGONAL: %2.4f", diagonal);
		
		
	}

}

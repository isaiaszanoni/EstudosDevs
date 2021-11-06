package exerciciosSemana1;

import java.util.Scanner;

public class ex8Medidas {
	
	/* Medidas
	 * Escreva um programa que leia três medidas A, B e C. Em seguida, 
	 * calcule e mostre os dados com 4 casas decimais.
	 * 
	 * a) A área do quadrado que tem lado A;
	 * b) A área do triângulo retângulo que base A e altura B;
	 * c) A área do trapézio que tem bases A e B, e altura C
	 */
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float a;
		float b;
		float c;
		
		float areaQuadrado;
		float areaTriangulo;
		float areaTrapezio;
		
		System.out.print("Digite a medida A: ");
		a = input.nextFloat();
		System.out.print("Digite a medida B: ");
		b = input.nextFloat();
		System.out.print("Digite a medida C: ");
		c = input.nextFloat();
		
		areaQuadrado = a * 4;
		areaTriangulo = (a * b) / 2;
		areaTrapezio = (a + b) * c / 2;
		
		System.out.printf("AREA DO QUADRADO = %2.4f", areaQuadrado);
		System.out.printf("\nAREA DO TRIANGULO = %2.4f", areaTriangulo);
		System.out.printf("\nAREA DO TRAPEZIO = %2.4f", areaTrapezio);
	}
}

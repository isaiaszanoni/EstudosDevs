package exerciciosSemana1;

import java.util.Scanner;

public class ex7Consumo {
	
	/*Problema "consumo"
	 * Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro, 
	 * bem como o total de combust�vel gasto por este carro ao percorrer tal dist�ncia.
	 * Seu programa deve mostrar o consumo
	 * m�dio do carro, com tr�s casas decimais.
	 * 
	 */
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dist�ncia percorrida: ");
		int distancia = sc.nextInt();
		
		System.out.print("Combust�vel gasto: ");
		float combustivelGasto = sc.nextFloat();
		
		float consumoMedio = distancia / combustivelGasto;
		System.out.format("Consumo medio = %2.3f", consumoMedio);
	}

}

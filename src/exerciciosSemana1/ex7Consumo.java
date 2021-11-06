package exerciciosSemana1;

import java.util.Scanner;

public class ex7Consumo {
	
	/*Problema "consumo"
	 * Fazer um programa para ler a distância total (em km) percorrida por um carro, 
	 * bem como o total de combustível gasto por este carro ao percorrer tal distância.
	 * Seu programa deve mostrar o consumo
	 * médio do carro, com três casas decimais.
	 * 
	 */
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		int distancia = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		float combustivelGasto = sc.nextFloat();
		
		float consumoMedio = distancia / combustivelGasto;
		System.out.format("Consumo medio = %2.3f", consumoMedio);
	}

}

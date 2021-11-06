package exerciciosSemana1;

import java.util.Scanner;

public class ex9Duracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		
		System.out.print("Digite a duração em segundos: ");
		entrada = sc.nextInt();
		
		int horas = entrada / 3600;
		int minutos = (entrada % 3600) / 60;
		int segundos = (entrada % 60) % 60;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
	}

}

/* 
 * 
 * 
 * 
 */

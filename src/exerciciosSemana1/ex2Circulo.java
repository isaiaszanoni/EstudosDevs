package exerciciosSemana1;

import java.util.Scanner;

import java.lang.Math.*;



public class ex2Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor o raio do circulo:");
		double r = input.nextFloat();
		
		double area = Math.PI * r * r;
		
		System.out.printf("AREA = %2.3f", area);

	}

}

package exerciciosSemana2;

import java.util.Scanner;

/* 
 * Escreva um programa que leia um número inteiro e depois diga se este é negativo ou não.
 * Write a program for read a integer and then, says if this integer is positive or not.
 */
public class Ex1 {
	
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	
	System.out.println((number <= 0) ? "NEGATIVO" : "NAO NEGATIVO");
	
	sc.close();
	
	}
}

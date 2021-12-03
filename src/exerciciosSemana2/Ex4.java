package exerciciosSemana2;

import java.util.Scanner;

public class Ex4 {
	
	/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, 
	 * sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma 
	 * dura��o m�nima de 1 hora e m�xima de 24 horas.
	 */
	
	private static int calculaDuracao(int horaInicio, int horaFim) {
		
		int duracao = 24;
		if(horaInicio < horaFim) {
			System.out.println(duracao = horaFim - horaInicio);
			return duracao;
		} else {
			System.out.println(duracao = 24 - (horaInicio - horaFim));
			return duracao;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
	
		calculaDuracao(horaInicio, horaFim);
		
		
	}

}

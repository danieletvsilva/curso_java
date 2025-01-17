package curso_programacao_nelio;
import java.lang.Math;


import java.util.Scanner;

public class aula_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double kmPercorrido = tempo * velocidade;
		double combustivel = kmPercorrido / 12;
		
		System.out.printf("%.3f%n", combustivel);
		
		
		
		
		sc.close();
		
	}
}

package curso_programacao_nelio_ex1;

import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.heigh = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", retangulo.area(), retangulo.perimeter(), retangulo.diagonal());

		sc.close();

	}

}

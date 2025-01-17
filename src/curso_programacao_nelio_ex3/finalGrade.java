package curso_programacao_nelio_ex3;

import java.util.Scanner;

public class finalGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE " + student.finalGrade());
		student.checkApproval();
	}

}

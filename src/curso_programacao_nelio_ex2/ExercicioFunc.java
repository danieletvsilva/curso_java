package curso_programacao_nelio_ex2;

import java.util.Scanner;

public class ExercicioFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data :" + employee);
	}

}

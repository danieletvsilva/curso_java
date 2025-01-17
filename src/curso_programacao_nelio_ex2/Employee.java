package curso_programacao_nelio_ex2;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	//Salário líquido
	public double netSalary() {
		return grossSalary - tax;
	}
	
	//Salário com a porcentagem
	public void increaseSalary(double percentage) {
		this.grossSalary = grossSalary + (grossSalary * (percentage / 100));			
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f%n", netSalary());
	}
	
}

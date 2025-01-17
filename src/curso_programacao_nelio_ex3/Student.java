package curso_programacao_nelio_ex3;

public class Student {
	public String name;
	public double n1, n2, n3, nFinal;
	
	public double finalGrade() {
		nFinal = n1 + n2 + n3;
		return nFinal;			
	}
	
	public void checkApproval() {
		double cuttoffScore = 60.00;
		if (nFinal >= 60.00) {
			System.out.println("PASS");
		}else {
			double missingGrade = cuttoffScore - nFinal;
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingGrade);			
		}
	}
}

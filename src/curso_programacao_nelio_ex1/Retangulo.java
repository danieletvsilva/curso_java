package curso_programacao_nelio_ex1;

public class Retangulo {
	public double width;
	public double heigh;
	
	public double area() {
		return width * heigh;
	}
	
	public double perimeter() {
		return 2 * (width + heigh);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + (Math.pow(heigh, 2))));
	}
	
	

}

package curso_programacao_nelio;

import java.util.Locale;
import java.util.Scanner;

public class aula_4 {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			
		 	double n = 3.14159;
	        double raio, A;
	        
	        
	        raio = sc.nextDouble();
	        
	        System.out.printf("A=%.4f%n", raio);
		
	}


	public static void saidaDados() {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, wich price is $ %.2f%n%s, wich price is $%.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasure with eigh decimal places: %.8f%nRouded (three decimal places): %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f", measure);
	}

	public static void casting() {

		//resultado sai inteiro se não converter explicitamente (CASTING)
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double)a/b;
		
		System.out.println(resultado);
		
	}
	
	public static void entradaDados() {

		//criar objeto
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();				
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		//Nesse caso, será aceito a virgula somente. Se necessario com ponto, utilizar Locale antes do Scanner
		double d;
		d = sc.nextDouble();
		System.out.println("Você digitou: " + d);
		
		char c;
		
		c= sc.next().charAt(0);
		System.out.println("Você digitou: " + c);
		
		//Escrever na mesma linha
		int a;
		double s;
		String k;
		
		a = sc.nextInt();
		s = sc.nextDouble();
		k = sc.next();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(s);
		System.out.println(k);
		
		
		//2
		

		
		//int x;
		String s1, s2, s3;
		
		//Utilizado para ler a linha inteira
		
		//x = sc.nextInt();//Quando usa comando diferente de nextLine, existe uma quebra de linha e essa quebra fica pendente, sendo consumida pelo prox comando
		sc.nextLine(); //utiliza-se esse comando para consumir a quebra pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		
		//Necessário declarar para encerrar 
		sc.close();
		
	}
	
	public static void funcoesMatematicas() {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//Raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + "= " + A);
		System.out.println("Raiz quadrada de " + y + "= " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Potência
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		System.out.println("Potência de " + x + " por " + y + " = " + A);
		System.out.println("Potência de " + x + " por 2.0 = " + B);
		
		//Numero absoluto sem negativo
		A = Math.abs(z);
		System.out.println("Número absoluto " + z + " = " + A);
		
	}
}
package curso_programacao_nelio_poo;

import java.util.Scanner;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void remoteProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + " $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f",totalValueInStock()); 
	}
}

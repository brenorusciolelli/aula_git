package exercicios_dev_1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vetor = new Product[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vetor[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vetor.length; i++) {
			sum += vetor[i].getPrice();
		}
		
		double avg = sum / vetor.length;
		
		System.out.println(avg);
		
		
		
		
		sc.close();
		
	}

}

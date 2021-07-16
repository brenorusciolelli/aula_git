package exercicios_dev_2;

import java.util.Locale;
import java.util.Scanner;

import exercicios_dev_1.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quartosPensao = sc.nextInt();
		Pensao[] vetor = new Pensao[quartosPensao];
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int quarto = sc.nextInt();
			vetor[i] = new Pensao(quarto, nome, email);
		}
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		

	}

}

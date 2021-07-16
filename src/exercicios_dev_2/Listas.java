package exercicios_dev_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Breno");
		list.add("Leticia");
		list.add("Cecilia");
		list.add("Blendo");
		list.add("Daiane");
		list.add("Rosa");
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Index of Daiane: " + list.indexOf("Daiane"));
		System.out.println("----------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		

	}

}

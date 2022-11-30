package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FinalTeste {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		String nome = "Gabriel";

		nomes.add("naninha brooksfield");
		nomes.add("felipão das chamas");
		nomes.add("repha");

		//nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		nomes.sort(Comparator.comparing(s -> s.length()));
		//Nomes, ordene comparando o length do String
		nomes.sort(Comparator.comparing(String::length));
		
		
		//Equivalente ao de cima
		Function<String, Integer> funcao = String::length;
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		nomes.sort(comparador);
		
		
		
		Consumer <String>impresso2 = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		Consumer<String>impressor1 = (t) -> {
				System.out.println(t);
				
			}
		;
		Consumer<String>impressor = System.out::println;
//		nomes.forEach(impressor1);
		
		
		
		
		
		nomes.forEach(System.out::println);
		
		
		
		

	}

}

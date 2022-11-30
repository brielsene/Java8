package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MaisTestes {

	public static void main(String[] args) {
		List<String> carros = new ArrayList<>();

		carros.add("Jetta");
		carros.add("Gol");
		carros.add("Corsa");
		
		System.out.println(carros);
		
		System.out.println();

//		carros.sort((s1, s2) -> s1.compareTo(s2));
		
		carros.sort(String::compareTo);
		
//		carros.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
		
		carros.forEach(System.out::println);
		
//		System.out.println(carros);

	}

}

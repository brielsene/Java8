package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLamba2 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();

		words.add("Aoba!");
		words.add("bom?");
		words.add("legal");

		words.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return 0;
			}

		});

		words.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);

			}

		});

		words.sort((String s1, String s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		}

		);

		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println();

		words.forEach(s -> {
			System.out.println(s);
		});

		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

	}

}

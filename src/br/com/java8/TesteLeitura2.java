package br.com.java8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		List<String> lista = new ArrayList<>();

		lista.add("Gabigol");
		lista.add("Juarez");
		lista.add("Ana");

		System.out.println(lista);
		lista.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
	

		lista.forEach(System.out::println);

	}

}

package br.com.java8;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TesteDoAlmoco {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<String>lista = new ArrayList<String>();
		
		lista.add("Macarrão");
		lista.add("Feijão");
		lista.add("Arroz");
		lista.add("bife");
		
List<String>lista2 = new ArrayList<String>();
		
		lista2.add("Macarrão");
		lista2.add("Feijão");
		lista2.add("Arroz");
		lista2.add("bife");
		
//		lista.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
//		
		
//		System.out.println(lista);
		
		lista.forEach(System.out::println);
		
		lista.sort(String::compareTo);
		System.out.println();
		
		lista.forEach(System.out::println);
		BufferedWriter bw = new BufferedWriter(new FileWriter("teste2.csv"));
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teste.csv"));
//		oos.writeObject(lista);
		
		bw.write("vix");
		bw.newLine();
		
		
		

	}

}

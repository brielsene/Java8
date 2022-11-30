package br.com.java8;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TesteLeitura {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.csv"));
		List<String>lista = new ArrayList<>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("11.csv"));
		lista.add("Feijão");
		lista.add("Arroz");
		
		
//		lista.sort(String::compareTo);
//		
		System.out.println(lista);
		
		oos.writeObject(lista);
		bw.newLine();
		
		
		
		
	
		
		
		
//		lista.forEach(System.out::println);
		
		
//		System.out.println(lista);
		
		

	}

}

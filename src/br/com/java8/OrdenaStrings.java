package br.com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String>palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Casa do código");
		palavras.add("caelum");
		
		Comparator<String>comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
		
		Consumer<String>consumidor = new ImprimePorLinha();
		palavras.forEach(consumidor);
		
	
	}

}

class ImprimePorLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}



class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length())
			return -1;
		if(s1.length()>s2.length())
			return 1;
			
		
		return 0;
	}

	
}
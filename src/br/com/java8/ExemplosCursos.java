package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
		
	}
	
	public int getAlunos() {
		return alunos;
	}
	
	public String getNome() {
		return nome;
	}
}











public class ExemplosCursos {
	private static int sum;

	public static void main(String[] args) {
		List<Curso>cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("JavaScript",150));
		cursos.add(new Curso("Java",113));
		cursos.add(new Curso(".NET",55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		int sum = cursos.stream().filter(c -> c.getAlunos()>=100)
		.mapToInt(c -> c.getAlunos())
		.sum();
		
		System.out.println(sum);
		
		cursos.stream().filter(c -> c.getNome().contains("Java")).map(c -> c.getNome()).forEach(System.out::println);
		
//		
		

		
	}
	
	

}

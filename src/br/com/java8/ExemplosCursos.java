package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
		
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos()>=100)
		.mapToInt(c -> c.getAlunos())
		.average();
		
//		System.out.println(sum);
		
//		cursos.stream().filter(c -> c.getNome().contains("Java")).map(c -> c.getNome()).forEach(System.out::println);
		
//		
//				cursos.stream()
//				.filter(c -> c.getAlunos()>=100).findAny()
//				.ifPresent(c -> System.out.println(c.getNome()));
		
//		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
				
				
		//toMap recebe 2 funções
//		cursos.stream().filter(c -> c.getAlunos()>=100)
//				.collect(Collectors.toMap(
//						c-> c.getNome(),
//						c-> c.getAlunos()
//						)).forEach((nome,alunos)->System.out.println(nome+" tem "+alunos + " Alunos"));
		
		cursos.stream().filter(c -> c.getAlunos()>50).collect(Collectors.toMap(c-> c.getNome(), c ->c.getAlunos())).forEach((nomes,alunos)->System.out.println(nomes+" Tem "+alunos +" Alunos"));
		
		Optional<Curso> findFirst = cursos.stream().filter(c -> c.getAlunos()>100).findFirst();
		
		System.out.println(findFirst.get().getNome());
		
		
	
				
				
		
		

		
	}
	
	

}

package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Curso: " + this.nome + " Alunos: " + alunos;
	}
}

public class ExemplosCursos {
	private static int sum;

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java", 113));
		cursos.add(new Curso(".NET", 55));

//		cursos.sort(Comparator.comparing(Curso::getAlunos));

//		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos()>=100)
//		.mapToInt(c -> c.getAlunos())
//		.average();

//		System.out.println(sum);

//		cursos.stream().filter(c -> c.getNome().contains("Java")).map(c -> c.getNome()).forEach(System.out::println);

//		
//				cursos.stream()
//				.filter(c -> c.getAlunos()>=100).findAny()
//				.ifPresent(c -> System.out.println(c.getNome()));

//		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

		// toMap recebe 2 funções
//		cursos.stream().filter(c -> c.getAlunos()>=100)
//				.collect(Collectors.toMap(
//						c-> c.getNome(),
//						c-> c.getAlunos()
//						)).forEach((nome,alunos)->System.out.println(nome+" tem "+alunos + " Alunos"));

//		cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
//				.forEach((nomes, alunos) -> System.out.println(nomes + " Tem " + alunos + " Alunos"));
//		
//		Optional<Curso> findFirst = cursos.stream().filter(c -> c.getAlunos()>100).findFirst();
//		
//		System.out.println(findFirst.get().getNome());

		// Calculando a média de alunos de curso

//		System.out.println(cursos);

//		cursos.stream().filter(c -> c.getAlunos() > 50)
//				.sorted((c1, c2) -> Integer.compare(c1.getAlunos(), c2.getAlunos())).forEach(System.out::println);
//		;
//		
//		List<Curso>cursos2 = cursos.stream().filter(c -> c.getAlunos()>50).collect(Collectors.toList());
//		
//		 cursos.stream().mapToDouble(c ->c.getAlunos()).average().ifPresent(c -> System.out.println("Média de alunos: "+c));
//		 
//		 cursos2.stream().mapToInt(c-> c.getAlunos()).forEach(System.out::println);
//		 
//		 System.out.println();
//		 cursos2.stream().map(c-> c.getNome()).forEach(System.out::println);
//		 
//		 System.out.println();
//		 
//		 cursos.stream().map(c -> c.getNome()).forEach(System.out::println);
		System.out.println(cursos);
		System.out.println();
		
		 int sum2 = cursos.stream().filter(c -> c.getNome().contains("Java")).mapToInt(c -> c.getAlunos()).sum();
		 System.out.println(sum2);

		

//		 System.out.println();
//		 cursos.stream().filter(c -> c.getAlunos()>30).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos())).forEach((nomes, alunos)->System.out.println(nomes+" Tem "+alunos+" Alunos"));
//		 
//		 int sum = cursos.stream().mapToInt(c -> c.getAlunos()).sum();
//		 
//		 System.out.println(sum+" Horas de curso");
//		 
//		 List<Curso> collect = cursos.stream().filter(c -> c.getAlunos()>50).collect(Collectors.toList());
//		 
//		 (collect.stream().map(c -> c.getNome())).forEach(c -> System.out.println(c.toString()));
//		 System.out.println(collect.get(0));
//		 
	}

}

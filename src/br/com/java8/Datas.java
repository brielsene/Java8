package br.com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate copaDoMundo = LocalDate.of(2022, Month.NOVEMBER, 19 );
		
		System.out.println("Faz quantos dias que começou a copa?");
		int ano = hoje.getYear();
		int mes = hoje.getMonthValue();
		
		Period periodo = Period.between(copaDoMundo, hoje);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximaCopa = copaDoMundo.plusYears(4);
		
		System.out.println(proximaCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
		
		String valorFormatado = proximaCopa.format(formatador);
		
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHoras));
		
		YearMonth anoMes = YearMonth.now();
		
		LocalTime intervalo = LocalTime.of(15, 30);
		
		
		
		System.out.println(intervalo.getHour());
		
		
		
	
		
		
		
//		System.out.println(anoMes);
		
		
		
		

	}

}

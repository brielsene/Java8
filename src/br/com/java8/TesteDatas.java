package br.com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class TesteDatas {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		
		System.out.println(agora);
		
		LocalDate data = LocalDate.of(2023, Month.MARCH, 30);
		
		System.out.println(data);
		
		Period periodo = Period.between(data, agora);
		
		//formatar
		
//		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		
		
		
		System.out.println(periodo);
		

	}

}

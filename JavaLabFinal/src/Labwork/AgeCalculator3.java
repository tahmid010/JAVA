package Labwork;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class AgeCalculator3
{
	public static void main(String[] args)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");    
		Scanner sc = new Scanner(System.in);
			

		LocalDate today = LocalDate.now();
		System.out.println("Enter your birthday(DD/MM/YY)  : ");
		LocalDate birthday = LocalDate.parse(sc.nextLine(), formatter);


		Period p = Period.between(birthday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days old.");
	}
}
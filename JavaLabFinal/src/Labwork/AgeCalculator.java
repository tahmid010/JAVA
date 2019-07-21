package Labwork;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
 
public class AgeCalculator{
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? >>>");
		String name = sc.next();
        System.out.println("Year of birth? >>>");
        int year = sc.nextInt();
        System.out.println("Month of birth? >>>");
        int month = sc.nextInt();
        System.out.println("Day of birth? >>>");
        int day = sc.nextInt();
        
        LocalDate current = LocalDate.now();
        LocalDate born = LocalDate.of(year, month, day);
        LocalDate cur = LocalDate.of(2018, month, day);
        long years = ChronoUnit.YEARS.between(born, current);
        long months = ChronoUnit.MONTHS.between(born, current);
        long days= ChronoUnit.DAYS.between(born, current);
        long days1 = ChronoUnit.DAYS.between(cur, current);
        
        long n = months%12;
        int mon = (int)n;
        if(days1<0)
        	days1 = days1+365;
        long days2 = days1%30;
        
        
        
        System.out.printf("%s is %d years %d months %d days old", name, years,mon,days2);
    }
}

package Labwork;

import java.util.Scanner;
/**
   This class converts between two units.
*/
public class ConversionCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("From what unit do you want to convert?");
      String from = in.nextLine();
      System.out.println("Into what unit do you want to convert?");
      String to = in.nextLine();
      System.out.println("Enter the value that you want to convert : ");
      double value = in.nextDouble();
      double result = convert(value,from,to);
      System.out.println("After conversion : " + result + " " + to);
    
   }
   
   static double convert(double value, String from, String to) {
	    switch (from) {
	        case "Kilometre":
	            value *= 1000;
	            break;
	        case "Centimetre":
	            value /= 100;
	            break;
	        case "Mile":
	            value *= 1609.344;
	            break;
	        case "Foot":
	            value /= 3.281;
	            break;
	        case "Inch":
	            value /= 39.37;
	            break;
	        case "Gram":
	            value /= 1000;
	            break;
	        case "Pound":
	            value /= 2.205;
	            break;
	        case "Tonne":
	            value *= 1000;
	            break;
	        case "Fahrenheit":
	            value = (value - 32) * 5 / 9;
	            break;
	        case "Kelvin":
	            value -= 273.15;
	            break;
	        case "Second":
	            value /= 60;
	            break;
	        case "Hour":
	            value *= 60;
	            break;
	        case "Day":
	            value *= 1440;
	        default :
	        	System.out.println("Invalid Input");
	    }
	    switch (to) {
	        case "Kilometre":
	            return value / 1000;
	        case "Centimetre":
	            return value * 100;
	        case "Mile":
	            return value / 1609.344;
	        case "Foot":
	            return value * 3.281;
	        case "Inch":
	            return value * 39.37;
	        case "Gram":
	            return value * 1000;
	        case "Pound":
	            return value * 2.205;
	        case "Tonne":
	            return value / 1000;
	        case "Fahrenheit":
	            return (value * 9 / 5) + 32;
	        case "Kelvin":
	            return value + 273.15;
	        case "Second":
	            return value * 60;
	        case "Hour":
	            return value / 60;
	        case "Day":
	            return value / 1440;
	    }
	    return value;
	}
}



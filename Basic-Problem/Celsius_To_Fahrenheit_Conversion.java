import java.util.Scanner;
public class Celsius_To_Fahrenheit_Conversion{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Temperature in Celsius:");
	float Celsius = scanner.nextFloat();
	float Conversion = (Celsius * (9/5)) + 32;
	System.out.println("Temperature in Fahrenheit : "+ Conversion);
	scanner.close();
}
}
	
	
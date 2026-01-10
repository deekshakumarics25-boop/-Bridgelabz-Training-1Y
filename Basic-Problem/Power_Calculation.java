import java.util.Scanner;
public class Power_Calculation{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter base:");
	System.out.println("Enter exponent:");
	int base = scanner.nextInt();
	int exponent = scanner.nextInt();
	double result = Math.pow(base,exponent);
	System.out.println("Power Calculation:" +result);
	}
}
import java.util.Scanner;
public class Calculate_Average_Of_Three_Numbers{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a:");
	System.out.println("Enter b:");
	System.out.println("Enter c:");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	double Average = (a+b+c)/3;
	System.out.println("Calculate Average of Three Numbers:" +Average);
	}
}
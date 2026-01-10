import java.util.Scanner;
public class Calculate_Simple_interest{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Principal:");
	System.out.println("Enter Rate:");
	System.out.println("Enter Time:");
	int Principal= scanner.nextInt();
	int Rate= scanner.nextInt();
	int Time= scanner.nextInt();
	double Simple_Interest = (Principal*Rate*Time) / (100);
	System.out.println("Calculate Simple_Interest:" +Simple_Interest);
	}
}
	
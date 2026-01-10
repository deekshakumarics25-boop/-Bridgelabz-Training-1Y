import java.util.Scanner;
public class Perimeter_Of_Rectangle{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter length:");
	System.out.println("Enter width:");
	int length = scanner.nextInt();
	int width = scanner.nextInt();
	double Perimeter = 2*(length+width);
	System.out.println("Perimeter of Rectangle:" +Perimeter);
	}
}
	
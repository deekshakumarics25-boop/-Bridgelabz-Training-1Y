import java.util.Scanner;
public class Area_Of_A_Circle{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter radius :");
	int radius = scanner.nextInt();
	double Area = (3.14) *(radius*radius);
	System.out.println("Area of circle :" +Area);
	}
}
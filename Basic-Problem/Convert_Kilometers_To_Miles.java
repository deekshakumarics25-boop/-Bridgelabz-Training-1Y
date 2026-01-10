import java.util.Scanner;
public class Convert_Kilometers_To_Miles{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Kilometers:");
	float Kilometers = scanner.nextFloat();
	double Miles = (Kilometers) * (0.621371);
	System.out.println("Convert Kilometers to Miles:" +Miles);
	}
}	
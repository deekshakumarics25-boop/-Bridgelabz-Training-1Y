import java.util.Scanner;
public class Volume_Of_A_Cylinder{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Radius:");
	System.out.println("Enter Height:");
	int radius = scanner.nextInt();
	int height = scanner.nextInt();
	double Volume = (3.14)*(radius*radius)*(height);
	System.out.println("Volume of a cylinder :" +Volume);
	}
}
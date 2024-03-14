import java.util.Scanner;

public class Third{
	public static void main(String[] S){
	System.out.println("Name: Hiral Hirenkumar Shah\nEnrollment No.: 220410107028");
	System.out.print("Enter a number in meters: ");
	Scanner obj = new Scanner(System.in);
	double meter = obj.nextDouble();
	double feet = meter * 3.28;
	System.out.println("The number in feet is: " + feet);
	}
}

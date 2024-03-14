import java.util.Scanner;

public class Fourth{
	public static void main(String[] S){
	System.out.println("Name: Hiral Hirenkumar Shah\nEnrollment No.: 220410107028");
	System.out.print("Enter weight: ");
	Scanner obj = new Scanner(System.in);
	double weight = obj.nextDouble();
	System.out.print("Enter height: ");
	double height = obj.nextDouble();
	double wei = weight * 0.45359237;
	double hei = height * 0.254;
	double BMI = (wei / (hei * hei)) * 100;
	System.out.println("BMI of the person is: " + BMI);
	}
}

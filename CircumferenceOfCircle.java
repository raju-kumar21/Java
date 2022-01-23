import java.util.Scanner;
public class CircumferenceOfCircle
{
	public static void main(String args[])
	{
		System.out.println("\t\t\tCalculate Circumference of a Circle\n");
		double r,C;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle =");
		r = sc.nextDouble();
		System.out.println();
		C = 2*3.14*r;
		System.out.println("Circumference of a Circle ="+C);
	}
}
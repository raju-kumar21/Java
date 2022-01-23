import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String args[])
	{
		System.out.println("\t\t\tCalculate Area of Circle\n");
		double r,area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle =");
		r = sc.nextDouble();
		System.out.println();
		area = 3.14*r*r;
		System.out.println("Area of Circle ="+area);
	}
}
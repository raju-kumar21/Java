import java.util.Scanner;
public class AreaOfRectangle{
		public static void main(String args[])
		{
			System.out.println("\t\t\t\tCatculate Area of Rectangle\n");
			double l,w,area;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter length of Rectangle:");
			l = sc.nextDouble();
			System.out.println();
			System.out.print("Enter width of Rectangle:");
			w = sc.nextDouble();
			area = l*w;
			System.out.println();
			System.out.println("Area of Rectangle ="+area);
		}
}
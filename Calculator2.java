import java.util.Scanner;
public class Calculator2
{
	public static void main(String args[])
	{
		double b,h,area,l,w,r,C;
		int ch;
		System.out.println("\t\t\t\tCalculator\n\n");
		do{
			Scanner sc = new Scanner(System.in);
					System.out.print("press 1\tFor Calculate Area of Rectangle\n"+"press 2\tFor Calculate Area of Circle\n"+"press 3\tFor Calculate Circumference of a Circle\n"+"press 4\tFor Calculate Area of a Tringle\n"+"press 5\tFor Exit\n");
					System.out.println("Enter your Chooise");
					ch =sc.nextInt();
					switch(ch){
						case 1:
								System.out.println("\t\t\t\tCalculate Area of Rectangle\n");
								System.out.print("Enter length of Rectangle:");
								l = sc.nextDouble();
								System.out.println();
								System.out.print("Enter width of  Rectangle:");
								w = sc.nextDouble();
								area = l*w;
								System.out.println();
								System.out.println("Area of  Rectangle ="+area);
								System.out.println();
								break;
						case 2:
								System.out.println("\t\t\tCalculate Area of  Circle\n");
								System.out.print("Enter radius of Circle =");
								r = sc.nextDouble();
								System.out.println();
								area = 3.14*r*r;
								System.out.println("Area of Circle ="+area);
								System.out.println();
								break;
						case 3:
								System.out.println("\t\t\tCalculate Circumference of  Circle\n");
								System.out.print("Enter radius of Circle =");
								r = sc.nextDouble();
								System.out.println();
								C = 2*3.14*r;
								System.out.println("Circumference of  Circle ="+C);
								System.out.println();
								break;
						case 4:
								System.out.println("\t\t\t\tCalculate Area of  Tringle\n");
								System.out.print("Enter Base of Tringle =");
								b = sc.nextDouble();
								System.out.println();
								System.out.print("Enter Height of Tringle =");
								h = sc.nextDouble();
								area = b*h/2;
								System.out.println();
								System.out.println("Area of  Tringle ="+area);
								System.out.println();
								break;
					}
		}while(ch!=5);
	}
}
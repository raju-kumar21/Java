import java.util.Scanner;
public class AreaOfTriangle
{
	public static void main(String args[])
	{	
		/*System.out.println("\t\t\t\tCalculate Area of a Tringle\n");
		double b,h,area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base of Tringle =");
		b = sc.nextDouble();
		System.out.println();
		System.out.print("Enter Height of Tringle =");
		h = sc.nextDouble();
		area = b*h/2;
		System.out.println();
		System.out.println("Area of a Tringle ="+area);*/
		  System.out.println("\t\t\tPrograme For Chack Number is Even or odd");
        int a;
        do{
                System.out.println("Enter Any number:");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                if(a==0)
                {
                    System.out.println("please Enter number grater than zero");
                }
                else if((a%2)==0)
                {
                    System.out.print("Enter Number is Even");
                  }
                else{
                    System.out.print("Enter Number is Odd");
                }
        }while(a==0);
        
	}
}
		
		
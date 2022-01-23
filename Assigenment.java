import java.lang.*;
import java.util.Scanner;
 class Test 
{
	public static void main(String args[])
	{
		
				int a,b,result,ch;
				do{
					Scanner sc = new Scanner(System.in);
					System.out.print("press 1\tFor Addition\n"+"press 2\tFor Subtraction\n"+"press 3\tFor Multiplication\n"+"press 4\tFor Division\n"+"press 5\tFor Exit\n");
					ch =sc.nextInt();
						switch(ch){
							case 1:
								System.out.println("Enter first number:");
								a = sc.nextInt();
								System.out.println("Enter Scound number:");
								b = sc.nextInt();
								result=a+b;
								System.out.println(" Addition ="+result);
								break;
							case 2:
								System.out.println("Enter first number:");
								a = sc.nextInt();
								System.out.println("Enter Scound number:");
								b = sc.nextInt();
								result=a-b;
								System.out.println(" Subtraction ="+result);
								break;
							case 3:
								System.out.println("Enter first number:");
								a = sc.nextInt();
								System.out.println("Enter Scound number:");
								b = sc.nextInt();
								result=a*b;
								System.out.println(" Multiplication ="+result);
								break;
							case 4:
								System.out.println("Enter first number:");
								a = sc.nextInt();
								System.out.println("Enter Scound number:");
								b = sc.nextInt();
								result=a/b;
								System.out.println(" Division ="+result);
								break;
								/*default:
								System.out.println("please enter right option");
								break;*/
								
						}
				}while(ch!=5);
				
			
	}	
			
		
		
	
}
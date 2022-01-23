
import java.util.Scanner;
 class Cal
{
	public static void main(String args[])
	{
		
            int a,b,result,ch;
		do{
                	Scanner sc = new Scanner(System.in);
			System.out.print("press 1\tFor Addition\n"+"press 2\tFor Subtraction\n"+"press 3\tFor Multiplication\n"+"press 4\tFor Division\n"+"press 5\tFor Exit\n");
                        ch =sc.nextInt();
			if(ch==1){
                                    System.out.println("Enter first number:");
                                    a = sc.nextInt();
                                     System.out.println("Enter Scound number:");
                                    b = sc.nextInt();
                                    result=a+b;
                                    System.out.println(" Addition ="+result);
                        }
                        else if(ch==2){
                                    System.out.println("Enter first number:");
                                    a = sc.nextInt();
                                    System.out.println("Enter Scound number:");
                                    b = sc.nextInt();
                                    result=a-b;
                                    System.out.println(" Subtraction ="+result);
                        }else if(ch==3)
                        {
                                    System.out.println("Enter first number:");
                                    a = sc.nextInt();
                                    System.out.println("Enter Scound number:");
                                    b = sc.nextInt();
                                    result=a*b;
                                    System.out.println(" Multiplication ="+result);
                        }
                        else if(ch==4){
                          
                                    System.out.println("Enter first number:");
                                    a = sc.nextInt();
                                    System.out.println("Enter Scound number:");
                                    b = sc.nextInt();
                                    result=a/b;
                                    System.out.println(" Division ="+result);			
				}
			}while(ch!=5);
												
			
	}	
			
		
		
	
}
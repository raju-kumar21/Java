import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("\t\t\tPrograme For Chack Number is Even or odd");
        int a;
                System.out.println("Enter A Integer number:");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
//                b=a%2;
//                System.out.println("value of b ="+b);
                if(a==0)
                {
                    System.out.println("please Enter number grater than zero");
                }
                else 
               if((a%2)==0)
                {
                    System.out.print("Enter Number is Even");
                  }
                else{
                    System.out.print("Enter Number is Odd");
                }
        
    }
}

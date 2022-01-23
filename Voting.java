import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        System.out.println("\t\tProgframe for chack You are eligible for voting or not\n");
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for viting");
        }
        else
        {
            System.out.println("you are not eligible for viting. Bcause your age is less than 18");
        }
    }
    
}

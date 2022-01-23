import java.util.*;
public class Par {
    public static void main(String[] args) {
        int pre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your parcentage");
        pre = sc.nextInt();
        if(pre <= 0 || pre >= 101)
            System.out.println("invialed");
        else if(pre<=44)
            System.out.println("third");
        else if(pre<=59)
            System.out.println("second");
        else if(pre>=60)
            System.out.println("first");
        else
            System.out.println("fail");
    
    }
}

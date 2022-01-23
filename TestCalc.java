
import java.util.Scanner;

class CalculatorPojo{
    private int a,b; //Data members
    
/*    public CalculatorPojo()
   {
   }
   */
//    public void setDATA(int x,int y)
//    {
//        this.a=x;
//        this.b=y;
//    }
    public int getA()
    {
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
//    public double getB()
//    {
//        return b;
//    }
//       public void setB( int b)
//    {
//        this.b = b;
//    }
    public void display()
    {
//          if(this.a==0)
//                {
//                    System.out.println("please Enter number grater than zero");
//                }
//                else 
               if((this.a%2)==0)
                {
                    System.out.print("Enter Number is Even");
                  }
                else{
                    System.out.print("Enter Number is Odd");
                }
//        System.out.println("A= "+this.a+" B= "+this.b);
    }
}
public class TestCalc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
//        double m =sc.nextDouble();
        CalculatorPojo ob2=new CalculatorPojo();
//         ob2.display();
//        ob.setData();
//        ob.display();
        ob2.setA(n);
//        ob2.setB(m);
         ob2.display();
//        System.out.println("A ="+ob2.getA()+"B ="+ob2.getB());
    
    
    }
    
}

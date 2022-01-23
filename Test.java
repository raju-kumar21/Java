
package matrix.com;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//        int i,j,k,m;
//        for(i=1;i<10;i++)
//        {
//            for(j=1;j<10;j++)
//            {
//                for(k=1;k<10;k++)
//                {
//                    for(m=1;m<10;m++)
//                    {
//                    System.out.println(m);
//                    if(m>=1)
//                        break;
//                    }
//                    System.out.println(k);
//                    if(k>=2)
//                      break;
//                }
//                System.out.println(j);
//                if(j>=3)
//                   break;
//            }
//            System.out.println(i);
//            if(i>=4)
//                break;
//            
//        }

		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<10;i++)
		{
		System.out.println("Enter a number ");
			sum = sum+sc.nextInt();
		}
		System.out.println("Sum is "+sum);	
    }
    
}

public class Test1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i,j=0;
        try
        {
            for(i=0;i<args.length;i++)
            {
                a[i]=Integer.parseInt(args[i]);
            j++;}
        }
        catch(ArrayIndexOutOfBoundsException ref)
        {
            System.out.println("the value should be <=5 ...");
            ref.printStackTrace();
        }
       for(i=0;i<j;i++)
       {
           System.out.println("value ="+a[i]);
       }
    }
}


package matrix.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File F = new File("f3.txt");
        FileOutputStream fos = new FileOutputStream(F,true);
//        byte arr[]={65,66,67,68,69,70,71,97,98,99,100,101,72,73,75,49,52,76};
        String name ="Raju Kumar\n";
        String s = "parveen";
        byte arr[] = name.getBytes();
        byte ar[]=s.getBytes();
        fos.write(arr);
        fos.write(ar);
        fos.flush();
        fos.close();
    }
}

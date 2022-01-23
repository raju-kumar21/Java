
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raju
 */
public class Add {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String s; 
    char[] s1=new char[10];
    System.out.println("Enter your name");
     s=sc.next();
     char c='r';
    for(int i=0; i<s.length(); i++){
        if(s1[i]==c)
        {
            System.out.println(""+s1[i]);
        }
    }
    
}
       
    }
}

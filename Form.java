
package newguis;

package com.cybrom;
import java.awt.*;
import java.awt.event.*;
import java.awt.Window;

class Login1 extends Frame implements WindowListener,ActionListener       
{
    
     Label lb1,lb2,lb3,lb4,lb5,lb6;
    TextField tf1,tf2;
    Button btn1,btn2,btn3,btn4,btn5;
    Login1()
    {
        
        Font f = new Font("serif",Font.BOLD,35);
        Font f2 = new Font("serif",Font.BOLD,22);
        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"___________________Login__Form_____________________");
        setBackground(Color.pink);
        setLayout(null);
        
        
        
        
        lb1= new Label("Register No");
        lb1.setBounds(10,50,170,30);
        lb1.setForeground(Color.black);
        lb1.setFont(f2);
        add(lb1);
        
        tf1 =new TextField();
        tf1.setBounds(190,50,150,30);
        tf1.setForeground(Color.red);
        tf1.setFont(f2);
        add(tf1);
        
        lb2= new Label("Password");
        lb2.setBounds(10,90,170,30);
        lb2.setForeground(Color.black);
        lb2.setFont(f2);
        add(lb2);
        
        tf2 =new TextField();
        tf2.setBounds(190,90,150,30);
        tf2.setForeground(Color.red);
        tf2.setFont(f2);
        add(tf2);
        
        
        btn1 = new Button("Login");
        btn1.setBounds(40,250,100,50);
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.red);
        btn1.setFont(f);
        add(btn1);
        
        btn2 = new Button("New User");
        btn2.setBounds(150,250,100,50);
        btn2.setBackground(Color.white);
        btn2.setForeground(Color.blue);
        btn2.setFont(f2);
        add(btn2);
        
        lb3= new Label();
        lb3.setBounds(50,310,350,50);
        lb3.setForeground(Color.RED);
        lb3.setFont(f);
        add(lb3);
        
        
        addWindowListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);}
    

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void actionPerformed(ActionEvent e) {
            Register1 r = new Register1();
            String n1=tf1.getText();
            String n2 =tf2.getText();
            
             long x = Long.parseLong(n1);
             long  y =Integer.parseInt(n2);
             
             if(e.getSource()==btn1)
             {
                 if( x == 1810512400 && y ==1234)
                 {
                     lb3.setText("You Are Login ");
                     
                 }
                 else{
                     lb3.setText("Invalid");
                 }
                 
             }
             if(e.getSource()==btn1)
             {
                 tf1.setText("");
                 tf2.setText("");
             }
             
             if(e.getSource()==btn2)
             {
                 r.register1();
                r.setVisible(true);
//              login1.dispose();
                
             }
    
    
    
    
    }


             
             
        
}


class Register1 extends Frame implements WindowListener,ActionListener
{
    
    Label lb1,lb2,lb3,lb4,lb5,lb6;
    TextField tf1,tf2,tf3,tf4,tf5;
    Button btn1,btn2,btn3,btn4,btn5;
    Object register1;
    
    
    public void register1()
    { 
         Font f2 = new Font("serif",Font.BOLD,25);
//        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"___________________Registration__Form______________________");
        setBackground(Color.blue);
        setLayout(null);
       
   
        addWindowListener(this);
        
        lb1= new Label("Name");
        lb1.setBounds(10,50,170,30);
        lb1.setForeground(Color.white);
        lb1.setFont(f2);
        add(lb1);
        
        tf1 =new TextField();
        tf1.setBounds(190,50,150,30);
        tf1.setForeground(Color.red);
        tf1.setFont(f2);
        add(tf1);
        
        lb2= new Label("Email");
        lb2.setBounds(10,90,170,30);
        lb2.setForeground(Color.white);
        lb2.setFont(f2);
        add(lb2);
        
        tf2 =new TextField();
        tf2.setBounds(190,90,150,30);
        tf2.setForeground(Color.red);
        tf2.setFont(f2);
        add(tf2);
        
        lb3= new Label("Password");
        lb3.setBounds(10,130,170,30);
        lb3.setForeground(Color.white);
        lb3.setFont(f2);
        add(lb3);
        
        tf3 =new TextField();
        tf3.setBounds(190,130,150,30);
        tf3.setForeground(Color.red);
        tf3.setFont(f2);
        add(tf3);
        
        lb4= new Label("Confrim Pass");
        lb4.setBounds(10,170,170,30);
        lb4.setForeground(Color.white);
        lb4.setFont(f2);
        add(lb4);
        
        tf4 =new TextField();
        tf4.setBounds(190,170,150,30);
        tf4.setForeground(Color.red);
        tf4.setFont(f2);
        add(tf4);
        
        lb5= new Label("Mobile");
        lb5.setBounds(10,210,170,30);
        lb5.setForeground(Color.white);
        lb5.setFont(f2);
        add(lb5);
        
        tf5 =new TextField();
        tf5.setBounds(190,210,150,30);
        tf5.setForeground(Color.red);
        tf5.setFont(f2);
        add(tf5);
        
        btn1 = new Button("Register");
        btn1.setBounds(40,300,120,70);
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.green);
        btn1.setFont(f2);
        add(btn1);
        
       lb6 = new Label();
       lb6.setBounds(250,310,550,30);
       lb6.setForeground(Color.red);
       lb6.setFont(f2);
       add(lb6);
       
       addWindowListener(this);
        btn1.addActionListener(this);
        
    }
    
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);}
    

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String n3 = tf3.getText();
        String n4 = tf4.getText();
        String n5 = tf5.getText();


        
        long x = Long.parseLong(n3);
        long  y =Long.parseLong(n4);
        long z = Long.parseLong(n5);
         
             if(e.getSource()==btn1)
             {
                 if( x != y)
                 {
                     lb6.setText("Invalid");   
                 }
                 else
                 {
                     lb6.setText("");
                 }
                 
             }
             if(e.getSource()==btn1)
                 {
                      tf3.setText("");
                      tf4.setText("");
                 }
        
        
    }
    
    
    
}








public class Form {
    public static void main(String[] args) {
        
        new Login1();
         
    }
    
}

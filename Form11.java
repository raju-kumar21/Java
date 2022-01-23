/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cybrom.f;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

class Login extends Frame implements WindowListener,ActionListener       
{
     Label lb1,lb2,lb3,lb4,lb5,lb6;
    TextField tf1,tf2;
    Button btn1,btn2,btn3,btn4,btn5;
    Login()
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
             
    if(e.getSource()==btn1)
    {
            String n1=tf1.getText();
            String n2 =tf2.getText();
            
             long x = Long.parseLong(n1);
             long  y =Integer.parseInt(n2);
             
             if(e.getSource()==btn1)
             {
               if( x == 1810512400 && y ==1234)
                 { 
                     new Home();
                     dispose();
//                     Component jProgressBar1 = null;
//                    JOptionPane.showMessageDialog(jProgressBar1,"Valid");
                     
                 }
                 else{
//                   Component jProgressBar1 = null;
                   JOptionPane.showMessageDialog(btn1," invalid");
                 }
                 
             }
             tf1.setText("");
             tf2.setText("");
             
    }
    if(e.getSource()==btn2)
             {
                new Register();
                 dispose();
             }
         }
}

class Register extends Frame implements WindowListener,ActionListener
{
    
    Label lb1,lb2,lb3,lb4,lb5,lb6;
    TextField tf1,tf2,tf3,tf4,tf5;
    Button btn1,btn2,btn3,btn4,btn5;
    
    
   Register()
   {
        Font f2 = new Font("serif",Font.BOLD,25);
        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"___________________Registration__Form______________________");
        setBackground(Color.blue);
        setLayout(null);
       
   
          
        
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
//        String n1 = tf1.getText();
//        String n2 = tf2.getText();
        String n3 = tf3.getText();
        String n4 = tf4.getText();
        String n5 = tf5.getText();


        
        long x = Long.parseLong(n3);
        long  y =Long.parseLong(n4);
        long z = Long.parseLong(n5);
         
             if(e.getSource()==btn3)
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
             if(e.getSource()==btn3)
                 {
                      tf3.setText("");
                      tf4.setText("");
                 }


    }

    
    
}



class Home extends Frame implements WindowListener,ActionListener
{
    Label lab1;
    Button btn4,btn5,btn6;
    Home()
    {
       Font f = new Font("serif",Font.BOLD,35);
        Font f2 = new Font("serif",Font.BOLD,22);
        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"_________________________________________________________H_O_M_E____P_A_G_E___________________________________________");
        setBackground(Color.green);
        setLayout(null);
        addWindowListener(this);
        
        
        
        btn4 = new Button("HOME");
        btn4.setBounds(10,30,120,70);
        btn4.setBackground(Color.white);
        btn4.setForeground(Color.green);
        btn4.setFont(f2);
        add(btn4);
        
        btn5 = new Button("PROFILE");
        btn5.setBounds(1250,30,120,70);
        btn5.setBackground(Color.white);
        btn5.setForeground(Color.green);
        btn5.setFont(f2);
        add(btn5);
        
        btn6 = new Button("LOG_OUT");
        btn6.setBounds(1380,30,170,70);
        btn6.setBackground(Color.white);
        btn6.setForeground(Color.green);
        btn6.setFont(f2);
        add(btn6);
        
       lab1 = new Label("__________________________________________________________________________________________________________________________________________________________________________________________");
       lab1.setBounds(40,73,1400,30);
       lab1.setForeground(Color.red);
       lab1.setFont(f2);
       add(lab1);
       btn6.addActionListener(this);
       btn5.addActionListener(this);
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn6)
    {
        new Login();
        dispose();
    }
    if(e.getSource()==btn5)
    {
        new Profile();
        dispose();
    }
       
    
    }
    
}

class Profile extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,la,lb,lc,ld,le,lf;
    Button btn6;
      Profile()
    {
        
          setVisible(true);
          setBounds(100,50,600,400);
          setTitle("Bio-Data");
          setBackground(Color.CYAN);
          setLayout(null);
          addWindowListener(this);
          Font f = new Font("serif",Font.BOLD,40);
          Font f2 = new Font("serif",Font.ITALIC,20);
          Font f3 = new Font("serif",Font.BOLD,25);
          
          
          l1 = new Label("Bio-Data");
          l1.setBounds(700,10,200,100);
          l1.setFont(f);
          l1.setForeground(Color.blue);
          add(l1);
          
        btn6 = new Button("LOG_OUT");
        btn6.setBounds(1380,30,170,70);
        btn6.setBackground(Color.white);
        btn6.setForeground(Color.green);
        btn6.setFont(f2);
        add(btn6);
          
          
          l2 = new Label("Name                : RAJU KUMAR");
          l2.setBounds(50,60,400,100);
          l2.setFont(f2);
          l2.setForeground(Color.blue);
          add(l2);
          
          
          l3 = new Label("Mobile No.          : 6205560461");
          l3.setBounds(50,120,300,100);
          l3.setFont(f2);
          l3.setForeground(Color.blue);
          add(l3);
          
          l4 = new Label("E-mail              :  rajukumar852124@gmail.com");
          l4.setBounds(50,180,400,100);
          l4.setFont(f2);
          l4.setForeground(Color.blue);
          add(l4);
          
          l5 = new Label("Gender              :  Male");
          l5.setBounds(50,240,300,100);
          l5.setFont(f2);
          l5.setForeground(Color.blue);
          add(l5);
          
          
          l6 = new Label("Date of Birth       :  10/01/2001");
          l6.setBounds(50,300,400,100);
          l6.setFont(f2);
          l6.setForeground(Color.blue);
          add(l6);
          
          l7 = new Label("Education           :  B.Tech");
          l7.setBounds(50,360,400,100);
          l7.setFont(f2);
          l7.setForeground(Color.blue);
          add(l7);
          
          
          l8= new Label("Religion            :  Hindu");
          l8.setBounds(50,420,400,100);
          l8.setFont(f2);
          l8.setForeground(Color.blue);
          add(l8);
          
          
          l9 = new Label("Language            :  Hindi , English");
          l9.setBounds(50,480,400,100);
          l9.setFont(f2);
          l9.setForeground(Color.blue);
          add(l9);
          
          la = new Label("Hbbies              :  Playing Cricket");
          la.setBounds(50,540,400,100);
          la.setFont(f2);
          la.setForeground(Color.blue);
          add(la);
          
          lb = new Label("Blood Group         :  A+");
          lb.setBounds(50,600,400,100);
          lb.setFont(f2);
          lb.setForeground(Color.blue);
          add(lb);
          
          lc = new Label("Address             :  SAHARSA");
          lc.setBounds(50,660,400,100);
          lc.setFont(f2);
          lc.setForeground(Color.blue);
          add(lc);
          
           
          ld = new Label("Signature :_raju_bhai");
          ld.setBounds(1100,740,400,100);
          ld.setFont(f3);
          ld.setForeground(Color.blue);
          add(ld);
          addWindowListener(this);
          btn6.addActionListener(this);
          
         } 
    @Override
    public void windowOpened(WindowEvent e) {    }

    @Override
    public void windowClosing(WindowEvent e) { dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn6)
    {
       
       new Login();
        dispose();
    }
    }
    
}








public class Form11 {
    public static void main(String[] args) {
        new Login();
    }
}

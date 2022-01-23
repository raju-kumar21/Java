
package matrix.com;

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



class FillLogin extends Frame implements WindowListener , ActionListener
{

    public FillLogin() {
        initComponents();
    }
    
    Label Label1,lb1,lb2,lbb1,lbb2,lb3,lbb3,lbb4,lbb5,lbb6,lab1,lab2,lab3,lab4,lab5,lab6,lb4,lb5,lb6,lb7,lb8,lb9,lba1,lba2,lbi,lbj,lbk,lbl,lbm,lbn;
    TextField tf1,tf2,tff1,tff2,tff3,tff4,tff5,ta1,ta2,ta3,t4,ta5;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    JProgressBar jProgressBar1;
    public void login()
    {
      
        
        Font f = new Font("serif",Font.BOLD,35);
        Font f2 = new Font("serif",Font.BOLD,22);
        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"___________________Login__Form_____________________");
        setBackground(Color.ORANGE);
        setLayout(null);
/*      javax.swing.JSlider jSlider1;
       javax.swing.JSlider jSlider2;
       javax.swing.JSlider jSlider3;*/
        
        
        
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
        
     public void register()
    {
        
        Font f2 = new Font("serif",Font.BOLD,25);
        setVisible(true);
        setBounds(100,50,600,400);
        setTitle("                    "+"___________________Registration__Form______________________");
        setBackground(Color.CYAN);
        setLayout(null);
       
   
          
        
        lbb1= new Label("Name");
        lbb1.setBounds(10,50,170,30);
        lbb1.setForeground(Color.red);
        lbb1.setFont(f2);
        add(lbb1);
        
        tff1 =new TextField();
        tff1.setBounds(190,50,150,30);
        tff1.setForeground(Color.red);
        tff1.setFont(f2);
        add(tff1);
        
        lbb2= new Label("Email");
        lbb2.setBounds(10,90,170,30);
        lbb2.setForeground(Color.red);
        lbb2.setFont(f2);
        add(lbb2);
        
        tff2 =new TextField();
        tff2.setBounds(190,90,150,30);
        tff2.setForeground(Color.red);
        tff2.setFont(f2);
        add(tff2);
        
        lbb3= new Label("Password");
        lbb3.setBounds(10,130,170,30);
        lbb3.setForeground(Color.red);
        lbb3.setFont(f2);
        add(lbb3);
        
        tff3 =new TextField();
        tff3.setBounds(190,130,150,30);
        tff3.setForeground(Color.red);
        tff3.setFont(f2);
        add(tff3);
        
        lbb4= new Label("Confrim Pass");
        lbb4.setBounds(10,170,170,30);
        lbb4.setForeground(Color.red);
        lbb4.setFont(f2);
        add(lbb4);
        
        tff4 =new TextField();
        tff4.setBounds(190,170,150,30);
        tff4.setForeground(Color.red);
        tff4.setFont(f2);
        add(tff4);
        
        lbb5= new Label("Mobile");
        lbb5.setBounds(10,210,170,30);
        lbb5.setForeground(Color.red);
        lbb5.setFont(f2);
        add(lbb5);
        
        tff5 =new TextField();
        tff5.setBounds(190,210,150,30);
        tff5.setForeground(Color.red);
        tff5.setFont(f2);
        add(tff5);
        
        btn3 = new Button("Register");
        btn3.setBounds(40,300,120,70);
        btn3.setBackground(Color.white);
        btn3.setForeground(Color.green);
        btn3.setFont(f2);
        add(btn3);
        
       lbb6 = new Label();
       lbb6.setBounds(250,310,550,30);
       lbb6.setForeground(Color.red);
       lbb6.setFont(f2);
       add(lbb6);
       
       JProgressBar jProgressBar1 = new JProgressBar();
       jProgressBar1.setBounds(50,420,400,90);
       jProgressBar1.setBackground(Color.red);
       add(jProgressBar1);
       
       addWindowListener(this);
       btn3.addActionListener(this);
    
        
    }
    
    
    public void home()
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
    
    public void profile()
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
          
          
          lba1 = new Label("Bio-Data");
          lba1.setBounds(700,10,200,100);
          lba1.setFont(f);
          lba1.setForeground(Color.blue);
          add(lba1);
          
        btn6 = new Button("LOG_OUT");
        btn6.setBounds(1380,30,170,70);
        btn6.setBackground(Color.white);
        btn6.setForeground(Color.green);
        btn6.setFont(f2);
        add(btn6);
          
          
          lba2 = new Label("Name                : RAJU KUMAR");
          lba2.setBounds(50,60,400,100);
          lba2.setFont(f2);
          lba2.setForeground(Color.blue);
          add(lba2);
          
          
          lb3 = new Label("Mobile No.          : 6205560461");
          lb3.setBounds(50,120,300,100);
          lb3.setFont(f2);
          lb3.setForeground(Color.blue);
          add(lb3);
          
          lb4 = new Label("E-mail              :  rajukumar852124@gmail.com");
          lb4.setBounds(50,180,400,100);
          lb4.setFont(f2);
          lb4.setForeground(Color.blue);
          add(lb4);
          
          lb5 = new Label("Gender              :  Male");
          lb5.setBounds(50,240,300,100);
          lb5.setFont(f2);
          lb5.setForeground(Color.blue);
          add(lb5);
          
          
          lb8 = new Label("Date of Birth       :  10/01/2001");
          lb8.setBounds(50,300,400,100);
          lb8.setFont(f2);
          lb8.setForeground(Color.blue);
          add(lb8);
          
          lb9 = new Label("Education           :  B.Tech");
          lb9.setBounds(50,360,400,100);
          lb9.setFont(f2);
          lb9.setForeground(Color.blue);
          add(lb9);
          
          
          lbi= new Label("Religion            :  Hindu");
          lbi.setBounds(50,420,400,100);
          lbi.setFont(f2);
          lbi.setForeground(Color.blue);
          add(lbi);
          
          
          lbj = new Label("Language            :  Hindi , English");
          lbj.setBounds(50,480,400,100);
          lbj.setFont(f2);
          lbj.setForeground(Color.blue);
          add(lbj);
          
          lbk = new Label("Hbbies              :  Playing Cricket");
          lbk.setBounds(50,540,400,100);
          lbk.setFont(f2);
          lbk.setForeground(Color.blue);
          add(lbk);
          
          lbl = new Label("Blood Group         :  A+");
          lbl.setBounds(50,600,400,100);
          lbl.setFont(f2);
          lbl.setForeground(Color.blue);
          add(lbl);
          
          lbm = new Label("Address             :  SAHARSA");
          lbm.setBounds(50,660,400,100);
          lbm.setFont(f2);
          lbm.setForeground(Color.blue);
          add(lbm);
          
           
          lbn = new Label("Signature :_raju_bhai");
          lbn.setBounds(1100,740,400,100);
          lbn.setFont(f3);
          lbn.setForeground(Color.blue);
          add(lbn);
          addWindowListener(this);
          btn6.addActionListener(this);
          
         } 
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    
    }


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
                 FillLogin F = new  FillLogin();
                 if( x == 1810512400 && y ==1234)
                 {
                     F.home();
                     dispose();
//                      Component jProgressBar1 = null;
             JOptionPane.showMessageDialog(jProgressBar1,"Valid");
                     
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
                FillLogin F = new  FillLogin();
                F.register();
                 dispose();
             }
    if(e.getSource()==btn3)
    {
       
     String n3 = tff3.getText();
     String n4 = tff4.getText();
//     String n5 = tff5.getText();


        
        long x = Long.parseLong(n3);
        long  y =Long.parseLong(n4);
//        long z = Long.parseLong(n5);
         
             if(e.getSource()==btn3)
             {
                 FillLogin F1 = new  FillLogin();
                 if( x == y)
                 {
//                    Component jProgressBar1 = null;
                    JOptionPane.showMessageDialog(btn3," Register Successfull");
                    F1.login();
                    dispose();
                 }
                 else
                 {
//                    Component jProgressBar1 = null;
                    JOptionPane.showMessageDialog(btn1," Password or Comfirm Password should be matched ");
                 }
                 
             }
        
        
        
        
        
        File F = new File("register.txt");
//        byte arr[]={65,66,67,68,69,70,71,97,98,99,100,101,72,73,75,49,52,76};
        try (FileOutputStream fos = new FileOutputStream(F,true)) {
            //        byte arr[]={65,66,67,68,69,70,71,97,98,99,100,101,72,73,75,49,52,76};
            String n1 =tff1.getText();
            String n2 =tff2.getText();
//            String n3 = tff3.getText();
//            String n4 = tff4.getText();
            String n5 = tff5.getText();
            byte arr[] = n1.getBytes();
            byte arr1[] = n2.getBytes();
            byte arr2[] = n3.getBytes();
            byte arr3[] = n4.getBytes();
            byte arr4[] = n5.getBytes();
            
            fos.write(arr);
            fos.write(arr1);
            fos.write(arr2);
            fos.write(arr3);
            fos.write(arr4);
            
            fos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FillLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FillLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
//        new MyThread().start();
//     
             tff1.setText("");
             tff2.setText("");
             tff3.setText("");
             tff4.setText("");
             tff5.setText("");
    }
    if(e.getSource()==btn6)
    {
        FillLogin F = new  FillLogin();
        F.login();
        dispose();
    }
    if(e.getSource()==btn5)
    {
       FillLogin F = new  FillLogin();
       F.profile();
        dispose();
    }
    
    
    }
    
    private void initComponents() { }
    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class FillTheForm {
    public static void main(String[] args) {
       FillLogin F = new  FillLogin();
       F.login();
    }
}

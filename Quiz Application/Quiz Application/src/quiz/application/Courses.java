
package quiz.application;
import java.awt.*;
import javax.swing.*;

public class Courses extends JFrame {
    
    Courses()
    {
        getContentPane().setBackground(new Color(240,230,140));
        setLayout(null);
        
        JLabel jbl= new JLabel("On the Basis of your score you can select the followimg Courses");
        jbl.setBounds(200,20,800,20);
        jbl.setFont(new Font("Times New Roman",Font.BOLD,20));
        jbl.setForeground(Color.black);
        add(jbl);
       
       
        JCheckBox checkBox1 = new JCheckBox("Database Management System Theory (DBT-2001");  
        checkBox1.setBounds(150,50, 500,50);
        checkBox1.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox1.setBackground(new Color(127,255,212));
        checkBox1.setForeground(Color.BLUE);
        add(checkBox1);
        
        
        JCheckBox checkBox2 = new JCheckBox("Database Management System Lab (DBL-2001)");  
        checkBox2.setBounds(150,90, 500,50);  
        checkBox2.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox2.setBackground(new Color(127,255,212));
        checkBox2.setForeground(Color.BLUE);
        add(checkBox2);
        
        JCheckBox checkBox3 = new JCheckBox("Object Oriented Programming Theory (OOPT-2002)");  
        checkBox3.setBounds(150,130, 500,50);  
        checkBox3.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox3.setBackground(new Color(127,255,212));
        checkBox3.setForeground(Color.BLUE);
        add(checkBox3);
        
        JCheckBox checkBox4 = new JCheckBox(" Object Oriented Programming Lab (OOPL-2002)");  
        checkBox4.setBounds(150,170, 500,50);  
        checkBox4.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox4.setBackground(new Color(127,255,212));
        checkBox4.setForeground(Color.BLUE);
        add(checkBox4);
        
        
        JCheckBox checkBox5 = new JCheckBox("Operating System Lab (OSL-2003)");  
        checkBox5.setBounds(150,210, 500,50);  
        checkBox5.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox5.setBackground(new Color(127,255,212));
        checkBox5.setForeground(Color.BLUE);
        add(checkBox5);
        
        JCheckBox checkBox6 = new JCheckBox("Operating System Theory(OSL-2003)");  
        checkBox6.setBounds(150,250, 500,50);  
        checkBox6.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox6.setBackground(new Color(127,255,212));
        checkBox6.setForeground(Color.BLUE);
        add(checkBox6);
        
        
        JCheckBox checkBox7 = new JCheckBox("Software Design and Architecture (SDA-2004");  
        checkBox7.setBounds(150,290, 500,50);  
        checkBox7.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox7.setBackground(new Color(127,255,212));
        checkBox7.setForeground(Color.BLUE);
        add(checkBox7);
        
        JButton jb1= new JButton("Submit");
        jb1.setBounds(350, 380, 280,80);
        jb1.setFont(new Font("Times New Roman",Font.BOLD,30));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        
        
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new Courses();
        //new CheckBoxExample();
    }
}

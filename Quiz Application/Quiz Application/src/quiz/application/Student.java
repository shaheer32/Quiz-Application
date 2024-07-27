package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame implements ActionListener{
    
    String name; 
    JButton jb;
    
    Student(String name)
    {
        this.name=name;
        getContentPane().setBackground(new Color(152,251,152));
        setLayout(null);
        
        JLabel rules= new JLabel("Rules for Student to Attempt the Following Quiz");
        rules.setBounds(400,30,700,30);
        rules.setFont(new Font("Times New Roman",Font.BOLD,20));
        rules.setForeground(Color.black);
        add(rules);
        
        JLabel r2= new JLabel();
        r2.setBounds(20,90,700,350);
        r2.setFont(new Font("Serif",Font.PLAIN,25));
        r2.setText(
                "<html>"+
                        "1.You have 10 minutes to attempt the 10 questions" +"<br><br>"+
                        "2.Once you open the quiz you cannot go back"+"<br><br>"+
                       "3.On the basis of your answered questions you can choose the courses offered"+"<br><br>"+
                        "4.You are not allowed to access any other site"+"<br><br>"+
                        "5.Best of Luck!"+"<br><br>"+
                
                "<html>"
        );
        add(r2);
    
        jb= new JButton("Start");
        jb.setBounds(500,500,90,30);
        jb.setFont(new Font("Times New Roman",Font.BOLD,20));
        jb.setBackground(new Color(255,79,91));
        jb.setForeground(new Color(0,128,128));
        jb.addActionListener(this);
        add(jb);
        
        
        setSize(1200,600);
        setLocation(200,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == jb)
        {
            setVisible(false);
            new Mcqs(name);
            
        }
    }
    public static void main (String[] args)
    {
        new Student("user");
        
    }
}

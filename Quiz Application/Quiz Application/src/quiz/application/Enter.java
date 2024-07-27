package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Enter extends JFrame implements ActionListener{
    JButton h3, h4;
   
    String name;
    Enter(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        JLabel h2= new JLabel("Choose Any One");
        h2.setBounds(50,20,800,300);
        h2.setFont(new Font("Calibri",Font.BOLD,35));
        add(h2);
        
        h3= new JButton("Student");
        h3.setBounds(100,250,100,80);
        h3.setFont(new Font("Calibri",Font.BOLD,15));
        h3.addActionListener(this);
        add(h3);
        
        h4= new JButton("Teacher");
        h4.setBounds(400,250,100,80);
        h4.setFont(new Font("Calibri",Font.BOLD,15));
        h4.addActionListener(this);
        add(h4);
        
        
        setVisible(true);
        setSize(800,650);
        setLocation(350,100);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == h3)
        {
            setVisible(false);
            new Student(name);
        }
        else if(ae.getSource() == h4)
        {
            setVisible(false);
            new Teacher(name);
        }
    }
   public static void main(String[] args)
   {
       new Enter("user");
   }
}



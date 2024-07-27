package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

  JButton b1, b2;
    String name;
    Login(String name) {
        
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icons/nice.jpg"));
        JLabel image= new JLabel(img1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading= new JLabel("Are you Ready To take the Quiz?");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        heading.setForeground(Color.ORANGE);
        add(heading);
        
        JLabel n1= new JLabel("Enter your Name");
        n1.setBounds(810,150,300,20);
        n1.setFont(new Font("Times New Roman",Font.BOLD,20));
        n1.setForeground(Color.PINK);
        add(n1);
        
        JTextField t1= new JTextField();
        t1.setBounds(735,200,300,35);
        t1.setFont(new Font("Times New Roman",Font.BOLD,45));
        add(t1);
        
        b1= new JButton("Enter");
        b1.setBounds(735,270,120,25);
        b1.setFont(new Font("Times New Roman",Font.ITALIC, 25));
        b1.setBackground(Color.CYAN);
        b1.addActionListener(this);
        add(b1);
        
        b2= new JButton("Exit");
        b2.setBounds(915,270,120,25);
        b2.setFont(new Font("Times New Roman",Font.ITALIC, 25));
        b2.setBackground(Color.CYAN);
        b2.addActionListener(this);
        add(b2);
        
        setSize(1200,600);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            setVisible(false);
            new Enter(name);
        }
        else if(ae.getSource() == b2)
        {
            setVisible(false);
        }
    }
public static void main(String[] args)
{
   new Login("user");
}
}

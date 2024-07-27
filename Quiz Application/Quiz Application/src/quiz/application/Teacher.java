package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
  public class Teacher extends JFrame
  {
    
    String name;
    
    Teacher(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        
        JLabel j2= new JLabel("The Number of Students who attended the Quiz are");
        j2.setBounds(280,30,700,30);
        j2.setForeground(Color.black);
        add(j2);
        
        JLabel j3= new JLabel("Total 12 Students attempted the Quiz");
        j3.setBounds(20,60,700,30);
        j3.setForeground(Color.WHITE);
        add(j3);
        
        JLabel j4 = new JLabel("Names of the students are");
        j4.setBounds(20,90,700,30);
        j4.setForeground(Color.WHITE);
        add(j4);
        
        JLabel r2= new JLabel();
        r2.setBounds(20,40,700,700);
        r2.setFont(new Font("Serif",Font.PLAIN,15));
        r2.setForeground(Color.blue);
        r2.setText(
                "<html>"+
                        "1.John" +"<br><br>"+
                        "2. Jack"+"<br><br>"+
                       "3.Kylie"+"<br><br>"+
                        "4.Kendal"+"<br><br>"+
                        "5.Sabrina"+"<br><br>"+
                        "6. Piku"+"<br><br>"+
                        "7.Sunita"+"<br><br>"+
                        "8.Nicole"+"<br><br>"+
                        "9.Gabreil"+"<br><br>"+
                        "10. Nicole"+"<br><br>"+
                        "11.Hessa"+"<br><br>"+
                        "12. Tom"+"<br><br>"+
                "<html>"
        );
        add(r2);
    
     
        
        setVisible(true);
        setSize(800,650);
        setLocation(350,100);
        
    }
    
    public static void main(String[] args)
    {
        new Teacher("user");
    }

}

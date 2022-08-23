// Classe: Exemplo12.java
// SWING métodos JOptionPane
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo12 extends JFrame implements ActionListener 
{
   JButton B1, B2, B3, B4, B5;
   public Exemplo12() 
   {
      setTitle("USO DO JOptionPane");
      setSize(520,400);
      setLocation(200,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      B1 = new JButton("i");
      B1.setSize(80,80);
      B1.setLocation(20,250);
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 24));

      B2 = new JButton("?");
      B2.setSize(80,80);
      B2.setLocation(115,250);
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 24));

      B3 = new JButton("!");
      B3.setSize(80,80);
      B3.setLocation(210,250);
      B3.addActionListener(this);
      B3.setFont(new Font("Serif", Font.BOLD, 24));

      B4 = new JButton("X");
      B4.setSize(80,80);
      B4.setLocation(305,250);
      B4.addActionListener(this);
      B4.setFont(new Font("Serif", Font.BOLD, 24));

      B5 = new JButton(" ");
      B5.setSize(80,80);
      B5.setLocation(400,250);
      B5.addActionListener(this);
      B5.setFont(new Font("Serif", Font.BOLD, 24));

      getContentPane().setLayout(null);
      getContentPane().add(B1);
      getContentPane().add(B2);
      getContentPane().add(B3);
      getContentPane().add(B4);
      getContentPane().add(B5);
   }
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == B1)
             JOptionPane.showMessageDialog(null,"INFORMATION_MESSAGE", "JOptionPane",
              JOptionPane.INFORMATION_MESSAGE);
      else if (e.getSource() == B2)
             JOptionPane.showMessageDialog(null,"QUESTION_MESSAGE", "JOptionPane",
              JOptionPane.QUESTION_MESSAGE);
      else if (e.getSource() == B3)
             JOptionPane.showMessageDialog(null,"WARNING_MESSAGE", "JOptionPane",
              JOptionPane.WARNING_MESSAGE);
      else if (e.getSource() == B4)
             JOptionPane.showMessageDialog(null,"ERROR_MESSAGE", "JOptionPane",
              JOptionPane.ERROR_MESSAGE);
       else if (e.getSource() == B5)
             JOptionPane.showMessageDialog(null,"PLAIN_MESSAGE", "JOptionPane",
              JOptionPane.PLAIN_MESSAGE);

 }
   public static void main(String [] args)
   {
      new Exemplo12().setVisible(true);
   }
}


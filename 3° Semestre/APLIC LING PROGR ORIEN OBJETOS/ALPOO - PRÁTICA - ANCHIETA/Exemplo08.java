// Classe: Exemplo08.java
// SWING com JRadioButton, JCheckBox, JList e vários frames
//Autor: Marcos Antonio / Marcos Junior
// Data: Agosto/2021

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo08 extends JFrame  implements ActionListener
{
   JButton B1, B2, B3, B4, B5;
   JLabel L1;
		
   public Exemplo08()
   {
      setTitle("Tela de Menu Principal");
      setSize(500,500);
      setLocation(50,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("SISTEMA DE CADASTRAMENTO DE ALUNOS");
      L1.setLocation(10,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      B1 = new JButton("Inclusão do Aluno");
      B1.setSize(250,50);
      B1.setLocation(130,60);
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 20));
      B1.setBackground(new Color(150,220,255));

      B2 = new JButton("Alteração do Aluno");
      B2.setSize(250,50);
      B2.setLocation(130,130);
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 20));
      B2.setBackground(new Color(150,220,255));

      B3 = new JButton("Exclusão do Aluno");
      B3.setSize(250,50);
      B3.setLocation(130,200);
      B3.addActionListener(this);
      B3.setFont(new Font("Serif", Font.BOLD, 20));
      B3.setBackground(new Color(150,220,255));

      B4 = new JButton("Visualização dos Dados");
      B4.setSize(250,50);
      B4.setLocation(130,270);
      B4.addActionListener(this);
      B4.setFont(new Font("Serif", Font.BOLD, 18));      
      B4.setBackground(new Color(150,220,255));

      B5 = new JButton("Sair");
      B5.setSize(250,50);
      B5.setLocation(130,360);
      B5.addActionListener(this);
      B5.setFont(new Font("Serif", Font.BOLD, 22));      
      B5.setBackground(new Color(130,155,255));
		
      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(B1);
      getContentPane().add(B2);
      getContentPane().add(B3);
      getContentPane().add(B4);
      getContentPane().add(B5);
      }

      public static void main (String arg[])
      {
         new Exemplo08().setVisible(true);
      }

      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == B5)
            System.exit(0); 
         else
            if (e.getSource() == B1)
            {
	       Exemplo081 obj = new Exemplo081();
	       obj.setVisible(true);
            }
            else
               if (e.getSource() == B2)
               {
	          Exemplo082 obj = new Exemplo082();
	          obj.setVisible(true);
               }
               else
                  if (e.getSource() == B3)
                  {
	             Exemplo083 obj = new Exemplo083();
	             obj.setVisible(true);
                  }
                  else
                     if (e.getSource() == B4)
                     {
	                Exemplo084 obj = new Exemplo084();
	                obj.setVisible(true);
                     }
   }


// Classe: Exemplo16.java
// Utilização de bordas
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo16 extends JFrame implements ActionListener
{
   JButton B1, B2;
   JTextField Nome, End, RG, CPF;
   JLabel L1;
	
   public Exemplo16()
   {
      setTitle("Tela de Inclusão dos Dados do Aluno");
      setSize(500,500);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("INCLUSÃO DOS DADOS DO ALUNO");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      Nome = new JTextField("");
      Nome.setSize(300,25);
      Nome.setLocation(110,70);
      Nome.setBorder( BorderFactory.createTitledBorder("Nome"));


      End = new JTextField("");
      End.setSize(300,25);
      End.setLocation(110,120);
      End.setBorder( BorderFactory.createTitledBorder("Endereço"));


      RG = new JTextField("");
      RG.setSize(170,25);
      RG.setLocation(110,170);
      RG.setBorder( BorderFactory.createTitledBorder("RG"));

      CPF = new JTextField("");
      CPF.setSize(170,25);
      CPF.setLocation(110,220);
      CPF.setBorder( BorderFactory.createTitledBorder("CPF"));

      
      B1 = new JButton("Incluir");
      B1.setSize(100,40);
      B1.setLocation(90,400);
      B1.setBackground(new Color(150,220,255));
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 18));      
      B1.setBackground(new Color(150,220,255));

      B2 = new JButton("Sair");
      B2.setSize(100,40);
      B2.setLocation(300,400);
      B2.setBackground(new Color(150,220,255));
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 18));      
      B2.setBackground(new Color(130,155,255));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(Nome);
      getContentPane().add(End);
      getContentPane().add(RG);
      getContentPane().add(CPF);
      getContentPane().add(B1);
      getContentPane().add(B2);
			
   }
   public static void main (String arg[])
   {
      new Exemplo15().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == B2)
         System.exit(0); 
   }

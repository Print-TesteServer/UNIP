// Classe: Exemplo15.java
// Utilização de bordas
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo15 extends JFrame implements ActionListener
{
   JButton B1, B2;
   JTextField Nome, End, RG, CPF;
   JCheckBox Idi1, Idi2, Idi3, Idi4, Idi5;
   ButtonGroup Bg;
   JRadioButton Nac1, Nac2;
   JPanel P1, P2, P3;
   JLabel l L1, L2, L3, L4, L5;
		
   public Exemplo15()
   {
      setTitle("Tela de Inclusão dos Dados do Aluno");
      setSize(500,500);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("INCLUSÃO DOS DADOS DO ALUNO");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L2 = new JLabel("Nome:");
      L2.setLocation(30,70);
      L2.setSize(70,20);

      Nome = new JTextField("");
      Nome.setSize(300,25);
      Nome.setLocation(110,70);

      L3 = new JLabel("Endereço:");
      L3.setLocation(30,120);
      L3.setSize(70,20);

      End = new JTextField("");
      End.setSize(300,25);
      End.setLocation(110,120);	
	
      L4 = new JLabel("RG:");
      L4.setLocation(30,170);
      L4.setSize(70,20);

      RG = new JTextField("");
      RG.setSize(170,25);
      RG.setLocation(110,170);

      L5 = new JLabel("CPF:");
      L5.setLocation(30,220);
      L5.setSize(70,20);

      CPF = new JTextField("");
      CPF.setSize(170,25);
      CPF.setLocation(110,220);
      
      P1 = new JPanel();
      P1.setSize(440,250);
      P1.setLocation(20,50);
      P1.setBackground(new Color(208,255,255));
      P1.setBorder( BorderFactory.createTitledBorder("Dados Pessoais"));
      P1.setLayout(null);
      P1.add(L2);
      P1.add(Nome);
      P1.add(L3);
      P1.add(End);
      P1.add(L4);
      P1.add(RG);
      P1.add(L5);
      P1.add(CPF);

      Idi1 = new JCheckBox("Inglês",false);
      Idi1.setLocation(0,10);
      Idi1.setSize(80,20);
      Idi1.addActionListener(this);
      Idi1.setBackground(new Color(208,255,255));
      Idi2 = new JCheckBox("Espanhol",false);
      Idi2.setLocation(75,10);
      Idi2.setSize(80,20);
      Idi2.addActionListener(this);
      Idi2.setBackground(new Color(208,255,255));
      Idi3 = new JCheckBox("Alemão",false);
      Idi3.setLocation(155,10);
      Idi3.setSize(120,20);
      Idi3.addActionListener(this);
      Idi3.setBackground(new Color(208,255,255));
      Idi4 = new JCheckBox("Francês",false);
      Idi4.setLocation(30,40);
      Idi4.setSize(80,20);
      Idi4.addActionListener(this);
      Idi4.setBackground(new Color(208,255,255));
      Idi5 = new JCheckBox("Outro",false);
      Idi5.setLocation(130,40);
      Idi5.setSize(80,20);
      Idi5.addActionListener(this);
      Idi5.setBackground(new Color(208,255,255));

      P2 = new JPanel();
      P2.setSize(250,60);
      P2.setLocation(20,330);
      P2.setBackground(new Color(208,255,255));
      P2.setBorder( BorderFactory.createTitledBorder("Idiomas"));
      P2.setLayout(null);
      P2.add(Idi1);
      P2.add(Idi2);
      P2.add(Idi3);
      P2.add(Idi4);
      P2.add(Idi5);

      Nac1 = new JRadioButton("Brasileira", true);
      Nac1.setLocation(0,30);
      Nac1.setSize(80,20);
      Nac1.addActionListener(this);
      Nac1.setBackground(new Color(208,255,255));
      Nac2 = new JRadioButton("Outra", false);
      Nac2.setLocation(90,30);
      Nac2.setSize(80,20);
      Nac2.addActionListener(this);
      Nac2.setBackground(new Color(208,255,255));
      Bg = new ButtonGroup();
      Bg.add(Nac1);
      Bg.add(Nac2);

      P3 = new JPanel();
      P3.setSize(180,60);
      P3.setLocation(280,330);
      P3.setBackground(new Color(208,255,255));
      P3.setBorder( BorderFactory.createTitledBorder("Nacionalidade"));
      P3.setLayout(null);
      P3.add(Nac1);
      P3.add(Nac2);

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
      getContentPane().add(P1);
      getContentPane().add(P2);
      getContentPane().add(P3);
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

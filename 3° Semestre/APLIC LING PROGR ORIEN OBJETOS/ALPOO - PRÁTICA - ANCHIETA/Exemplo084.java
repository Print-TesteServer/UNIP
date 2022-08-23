// Classe: Exemplo084.java
// Exclusão dos Dados do Aluno
//Autor: Marcos Antonio/ Marcos JUunior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo084 extends JFrame implements ActionListener 
{
   JButton B1, B2, B3;
   JTextField Nome, End, RG, CPF, Matr;
   JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9;
   DefaultListModel lista;
   JList Est;
   JCheckBox Idi1, Idi2, Idi3, Idi4, Idi5;
   ButtonGroup Bg;
   JRadioButton Nac1, Nac2;
   String Matricula = "123.456-7"; 

		
   public Exemplo084()
   {
      setTitle("Tela de Consulta dos Dados do Aluno");
      setSize(500,500);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("CONSULTA DOS DADOS DO ALUNO");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L9 = new JLabel("Matricula:");
      L9.setLocation(30,70);
      L9.setSize(70,20);

      Matr = new JTextField("");
      Matr.setSize(100,25);
      Matr.setLocation(110,70);

      L2 = new JLabel("Nome:");
      L2.setLocation(30,110);
      L2.setSize(70,20);

      Nome = new JTextField("");
      Nome.setSize(300,25);
      Nome.setLocation(110,110);

      L3 = new JLabel("Endereço:");
      L3.setLocation(30,145);
      L3.setSize(70,20);

      End = new JTextField("");
      End.setSize(300,25);
      End.setLocation(110,145);	
	
      L4 = new JLabel("RG:");
      L4.setLocation(30,180);
      L4.setSize(70,20);

      RG = new JTextField("");
      RG.setSize(170,25);
      RG.setLocation(110,180);

      L5 = new JLabel("CPF:");
      L5.setLocation(30,215);
      L5.setSize(70,20);

      CPF = new JTextField("");
      CPF.setSize(170,25);
      CPF.setLocation(110,215);	
	
      L6 = new JLabel("Estado");
      L6.setLocation(350,180);
      L6.setSize(70,20);

      lista = new DefaultListModel();
      lista.addElement("Acre");
      lista.addElement("Bahia");
      lista.addElement("Fortaleza");
      lista.addElement("Rio de Janeiro");
      lista.addElement("Santa Catarina");
      lista.addElement("São Paulo");
      lista.addElement("Tocantins");

      Est = new JList(lista);
      Est.setSize(110,150);
      Est.setLocation(330,200);
      Est.setBackground(new Color(208,255,255));
      //Est.addListSelectionListener(this);

      L7 = new JLabel("Idiomas");
      L7.setLocation(30,260);
      L7.setSize(70,20);

      Idi1 = new JCheckBox("Inglês",false);
      Idi1.setLocation(25,280);
      Idi1.setSize(120,20);
      //Idi1.addItemListener(this);
      Idi1.setBackground(new Color(208,255,255));
		
      Idi2 = new JCheckBox("Espanhol",false);
      Idi2.setLocation(25,300);
      Idi2.setSize(120,20);
      //Idi2.addItemListener(this);
      Idi2.setBackground(new Color(208,255,255));
		
      Idi3 = new JCheckBox("Alemão",false);
      Idi3.setLocation(25,320);
      Idi3.setSize(120,20);
      //Idi3.addItemListener(this);
      Idi3.setBackground(new Color(208,255,255));
		
      Idi4 = new JCheckBox("Francês",false);
      Idi4.setLocation(25,340);
      Idi4.setSize(120,20);
      //Idi4.addItemListener(this);
      Idi4.setBackground(new Color(208,255,255));
		
      Idi5 = new JCheckBox("Outro",false);
      Idi5.setLocation(25,360);
      Idi5.setSize(120,20);
      //Idi5.addItemListener(this);
      Idi5.setBackground(new Color(208,255,255));
		
      L8 = new JLabel("Nacionalidade");
      L8.setLocation(180,260);
      L8.setSize(100,20);

      Nac1 = new JRadioButton("Brasileira", true);
      Nac1.setLocation(180,280);
      Nac1.setSize(100,20);
      //Nac1.addItemListener(this);
      Nac1.setBackground(new Color(208,255,255));
		
      Nac2 = new JRadioButton("Outra", false);
      Nac2.setLocation(180,310);
      Nac2.setSize(100,20);
      //Nac2.addItemListener(this);
      Nac2.setBackground(new Color(208,255,255));
			
      Bg = new ButtonGroup();
      Bg.add(Nac1);
      Bg.add(Nac2);

      B1 = new JButton("Consultar");
      B1.setSize(100,40);
      B1.setLocation(50,400);
      B1.setBackground(new Color(150,220,255));
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 16));      
      B1.setBackground(new Color(150,220,255));

      B2 = new JButton("Limpar");
      B2.setSize(140,40);
      B2.setLocation(180,400);
      B2.setBackground(new Color(150,220,255));
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 18));      
      B2.setBackground(new Color(150,220,255));
      B2.setVisible(false);   

      B3 = new JButton("Sair");
      B3.setSize(100,40);
      B3.setLocation(350,400);
      B3.setBackground(new Color(150,220,255));
      B3.addActionListener(this);
      B3.setFont(new Font("Serif", Font.BOLD, 18));      
      B3.setBackground(new Color(130,155,255));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(L4);
      getContentPane().add(L5);
      getContentPane().add(L6);
      getContentPane().add(L7);
      getContentPane().add(L8);
      getContentPane().add(L9);
      getContentPane().add(Nome);
      getContentPane().add(End);
      getContentPane().add(RG);
      getContentPane().add(CPF);
      getContentPane().add(Matr);
      getContentPane().add(Est);
      getContentPane().add(Idi1);
      getContentPane().add(Idi2);
      getContentPane().add(Idi3);
      getContentPane().add(Idi4);
      getContentPane().add(Idi5);
      getContentPane().add(Nac1);
      getContentPane().add(Nac2);
      getContentPane().add(B1);
      getContentPane().add(B2);
      getContentPane().add(B3);			
   }

   public static void main (String arg[])
   {
      new Exemplo084().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == B3)
         dispose(); 
      else
         if (e.getSource() == B1)
         {
            Nome.setText("Epaminindas de Oliveira Souza"); 
            Nome.disable();
            End.setText("Rua Sobe e Desce, 1234, Vila Encantado"); 
            End.disable();
            RG.setText("123.456.789-10"); 
            RG.disable();
            CPF.setText("456.789.912");
            CPF.disable();
            Est.setSelectedIndex(5);
            Est.disable();
            Idi3.setSelected(true);
            Nac1.setSelected(true);
            B2.setVisible(true); 
         }
         else
            if (e.getSource() == B2)
            {
               Matr.setText(""); 
               Nome.setText(""); 
               Nome.enable();
               End.setText("");
               End.enable(); 
               RG.setText(""); 
               RG.enable();
               CPF.setText("");
               CPF.enable();
               Est.setSelectedIndex(9);
               Est.enable();
               Idi3.setSelected(false);
               Nac1.setSelected(true);
               B2.setVisible(false); 
            }
   }

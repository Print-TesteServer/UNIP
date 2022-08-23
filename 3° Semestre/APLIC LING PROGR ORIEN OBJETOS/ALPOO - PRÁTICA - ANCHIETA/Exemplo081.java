// Classe: Exemplo081.java
// Inclusão dos Dados do Aluno
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo081 extends JFrame implements ActionListener, ListSelectionListener, ItemListener
{
   JButton B1, B2;
   JTextField Nome, End, RG, CPF;
   JLabel L1, L2, L3, L4, L5, L6, L7, L8;
   DefaultListModel lista;
   JList Est;
   JCheckBox Idi1, Idi2, Idi3, Idi4, Idi5;
   ButtonGroup Bg;
   JRadioButton Nac1, Nac2;
   String Matricula = "123.456-7"; 

		
   public Exemplo081()
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
	
      L6 = new JLabel("Estado");
      L6.setLocation(350,160);
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
      Est.setLocation(330,180);
      Est.setBackground(new Color(208,255,255));
      Est.addListSelectionListener(this);

      L7 = new JLabel("Idiomas");
      L7.setLocation(30,260);
      L7.setSize(70,20);

      Idi1 = new JCheckBox("Inglês",false);
      Idi1.setLocation(25,280);
      Idi1.setSize(120,20);
      Idi1.addItemListener(this);
      Idi1.setBackground(new Color(208,255,255));
		
      Idi2 = new JCheckBox("Espanhol",false);
      Idi2.setLocation(25,300);
      Idi2.setSize(120,20);
      Idi2.addItemListener(this);
      Idi2.setBackground(new Color(208,255,255));
		
      Idi3 = new JCheckBox("Alemão",false);
      Idi3.setLocation(25,320);
      Idi3.setSize(120,20);
      Idi3.addItemListener(this);
      Idi3.setBackground(new Color(208,255,255));
		
      Idi4 = new JCheckBox("Francês",false);
      Idi4.setLocation(25,340);
      Idi4.setSize(120,20);
      Idi4.addItemListener(this);
      Idi4.setBackground(new Color(208,255,255));
		
      Idi5 = new JCheckBox("Outro",false);
      Idi5.setLocation(25,360);
      Idi5.setSize(120,20);
      Idi5.addItemListener(this);
      Idi5.setBackground(new Color(208,255,255));
		
      L8 = new JLabel("Nacionalidade");
      L8.setLocation(180,260);
      L8.setSize(100,20);

      Nac1 = new JRadioButton("Brasileira", true);
      Nac1.setLocation(180,280);
      Nac1.setSize(100,20);
      Nac1.addItemListener(this);
      Nac1.setBackground(new Color(208,255,255));
		
      Nac2 = new JRadioButton("Outra", false);
      Nac2.setLocation(180,310);
      Nac2.setSize(100,20);
      Nac2.addItemListener(this);
      Nac2.setBackground(new Color(208,255,255));
			
      Bg = new ButtonGroup();
      Bg.add(Nac1);
      Bg.add(Nac2);

      B1 = new JButton("Incluir");
      B1.setSize(100,40);
      B1.setLocation(110,400);
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
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(L4);
      getContentPane().add(L5);
      getContentPane().add(L6);
      getContentPane().add(L7);
      getContentPane().add(L8);
      getContentPane().add(Nome);
      getContentPane().add(End);
      getContentPane().add(RG);
      getContentPane().add(CPF);
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
			
   }
   public static void main (String arg[])
   {
      new Exemplo081().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == B2)
         dispose(); 
      else
         if (e.getSource() == B1)
         {
           JOptionPane.showMessageDialog(null,"ALUNO CADASTRADO COM SUCESSO" +
              "\n      MATRICULA: " + Matricula,
              "CADASTRAMENTO",JOptionPane.INFORMATION_MESSAGE);
           Nome.setText(""); 
           End.setText(""); 
           RG.setText(""); 
           CPF.setText("");
           Est.setSelectedIndex(9);
         }
   }

   public void valueChanged(ListSelectionEvent e) 
   {
      if(Est.getSelectedValue().equals("São Paulo"))
      {
           JOptionPane.showMessageDialog(null,"Foi Selecionado: São Paulo",
              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
      }
   }   

   public void itemStateChanged(ItemEvent e)
   {
      if(e.getSource()==Idi3)
      {
         if(e.getStateChange()==ItemEvent.SELECTED)
           JOptionPane.showMessageDialog(null,"Foi Selecionado: Alemão",
              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
      }
      if(e.getSource()==Nac1)
      {
	 if(e.getStateChange()==ItemEvent.SELECTED)
	 {
           JOptionPane.showMessageDialog(null,"Foi Selecionado: Brasileira",
              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
	 }
      }
   }

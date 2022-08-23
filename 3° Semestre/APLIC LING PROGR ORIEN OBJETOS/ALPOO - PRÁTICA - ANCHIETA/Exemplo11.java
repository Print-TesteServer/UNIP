// Classe: Exemplo11.java
// Utilização de imagens
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo11 extends JFrame implements ListSelectionListener 
{
	JLabel L1, La;
	DefaultListModel lista ;
	JList cardapio;
	JPanel P1, P2 ;
	ImageIcon Im1;
	
	public Exemplo11()
	{
 	   setLocation(50,100);
	   setTitle("Uso de Painel e Lista de Opções");
  	   setSize(600,450);
	   setUndecorated(true);
	   getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	   getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
	   setDefaultCloseOperation(EXIT_ON_CLOSE);

	   Im1 = new ImageIcon(" ");

	   La = new JLabel(Im1);
                    La.setLocation(10,10);
 	   La.setVisible(true);

	   // acrescenta um rotulo para a caixa de seleção
                    L1 = new JLabel("Escolha seu sanduiche :");
	   L1.setSize(300,20);
	   L1.setLocation(10,20);
	   L1.setForeground(Color.black);
				
	   // Acrescenta o objeto lista de seleção
           lista = new DefaultListModel();
	   lista.addElement("Hot Dog");
	   lista.addElement("Churrasco");
	   lista.addElement("Bauru");
	   lista.addElement("X-Egg");
	   lista.addElement("X-Salada");
	   lista.addElement("Calabresa");
	   lista.addElement(".");
	   lista.addElement(".");
	   lista.addElement("Sair");

	   cardapio = new JList(lista);
	   cardapio.setSize(140,190);
	   cardapio.setLocation(5,10);
	   cardapio.setBackground(new Color(208,255,255));
	   cardapio.addListSelectionListener(this);
				
	   P1 = new JPanel();
	   P1.setBounds(20,50,150,230);
	   P1.setBackground(new Color(208,255,255));
	   P1.setBorder(BorderFactory.createLineBorder(Color.black,2));
	   P1.setLayout(null);
	   P1.add(cardapio);
		
	   P2 = new JPanel();
	   P2.setBounds(220,50,300,230);
	   P2.setBackground(new Color(208,255,255));
	   P2.setBorder(BorderFactory.createLineBorder(Color.black,2));
 	   P2.add(La,BorderLayout.CENTER);
	    
	   getContentPane().setBackground(Color.yellow);
	   getContentPane().setLayout(null);
	   getContentPane().add(L1);
	   getContentPane().add(P1);
	   getContentPane().add(P2);
		
	}
        public static void main(String[] args) 
 	{
 	   Exemplo11 Ex = new Exemplo11();
   	   Ex.setVisible(true);
 	} 
 	public void valueChanged(ListSelectionEvent e) 
 	{
 	   if(cardapio.getSelectedValue().equals("Hot Dog"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Hot_Dog.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("Churrasco"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Churrasco.gif");
 	      P2.setBackground(new Color(102,204,204));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("Bauru"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Bauru.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("X-Egg"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/X_Egg.gif");
 	      P2.setBackground(new Color(149,154,218));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("X-Salada"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/X_Salada.gif");
 	      P2.setBackground(Color.red);
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("Calabresa"))
 	   {
 	      Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Calabresa.gif");
 	      P2.setBackground(new Color(102,204,204));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("."))
 	   {
 	      Im1 = new ImageIcon(".");
 	      P2.setBackground(new Color(102,204,204));
 	      La.setIcon(Im1);
 	   }
 	   if(cardapio.getSelectedValue().equals("Sair"))
 	   {
 	      System.exit(0);
 	   }
 	} 
}

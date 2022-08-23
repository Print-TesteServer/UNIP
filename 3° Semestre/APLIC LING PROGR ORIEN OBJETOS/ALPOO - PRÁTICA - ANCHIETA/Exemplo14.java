// Classe: Exemplo14.java
// Utilização de ComboBox, Painel e Imagens
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Exemplo14 extends JFrame implements ActionListener
{
	JLabel L1, L2, L3, La, Lb;
	JComboBox combo;
	JPanel P1, P2 ;
	ImageIcon Im1, Im2;
	
	public Exemplo14()
	{
 	   setLocation(50,100);
	   setTitle("Uso de ComboBox, Painel e imagem");
  	   setSize(600,400);
	   setUndecorated(true);
	   getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	   getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
	   setDefaultCloseOperation(EXIT_ON_CLOSE);

	   Im1 = new ImageIcon(" ");
	   Im2 = new ImageIcon(" ");

	   La = new JLabel(Im1);
       La.setLocation(10,10);
 	   La.setVisible(true);

	   Lb = new JLabel(Im2);
       Lb.setLocation(10,10);
 	   Lb.setVisible(true);

        L1 = new JLabel("Agremiações Esportivas:");
	   L1.setSize(150,20);
	   L1.setLocation(10,30);
	   L1.setForeground(Color.black);

       combo = new JComboBox();
       combo.setSize(120,20);
       combo.setLocation(170,30);
       combo.addActionListener(this);
       combo.addItem(" ");
       combo.addItem("Atletico");
       combo.addItem("Bahia");
       combo.addItem("Flamengo");
       combo.addItem("Corinthias");
       combo.addItem("Palmeiras");    
       combo.addItem("São Paulo");
       combo.addItem("Santos");
				
                    L2 = new JLabel("Distintivo");
	   L2.setSize(80,20);
	   L2.setLocation(25,80);
									
	   P1 = new JPanel();
	   P1.setSize(250,250);
	   P1.setLocation(25,100);
	   P1.setBackground(new Color(208,255,255));
	   P1.setBorder(BorderFactory.createLineBorder(Color.black,2));
 	   P1.add(La,BorderLayout.CENTER);

                    L3 = new JLabel("Camisa");
	   L3.setSize(80,20);
	   L3.setLocation(325,80);
					
	   P2 = new JPanel();
	   P2.setSize(250,250);
	   P2.setLocation(325,100);
	   P2.setBackground(new Color(208,255,255));
	   P2.setBorder(BorderFactory.createLineBorder(Color.black,2));
 	   P2.add(Lb,BorderLayout.CENTER);
	    
	   getContentPane().setBackground(Color.yellow);
	   getContentPane().setLayout(null);
	   getContentPane().add(L1);
	   getContentPane().add(L2);
	   getContentPane().add(L3);
	   getContentPane().add(combo);
	   getContentPane().add(P1);
	   getContentPane().add(P2);
		
	}
    public static void main(String[] args) 
 	{
 	   Exemplo14 Ex = new Exemplo14();
   	   Ex.setVisible(true);
 	} 
    public void actionPerformed(ActionEvent e) 
 	{
 	   if(combo.getSelectedItem().equals("Atletico"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Atletico.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Atletico2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
 	   else if(combo.getSelectedItem().equals("Bahia"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Bahia.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Bahia2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
       else if(combo.getSelectedItem().equals("Flamengo"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Flamengo.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Flamengo2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
 	   else if(combo.getSelectedItem().equals("Corinthias"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Corinthias.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Corinthias2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
 	   else if(combo.getSelectedItem().equals("Palmeiras"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Palmeiras.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Palmeiras2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
 	   else if(combo.getSelectedItem().equals("Santos"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Santos.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/Santos2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
 	   else if(combo.getSelectedItem().equals("São Paulo"))
 	   {
                       Im1 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/SaoPaulo.gif");
 	      P1.setBackground(new Color(102,204,255));
 	      La.setIcon(Im1);
                       Im2 = new ImageIcon("c:/Marcos/Aulas/2019/ALPOO - 2S/Exemplos/SaoPaulo2.gif");
 	      P2.setBackground(new Color(102,204,255));
 	      Lb.setIcon(Im2);
 	   }
                } 
}

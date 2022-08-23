// Classe: Exemplo13.java
// Double com casas decimais
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat; 

public class Exemplo13 extends JFrame implements ActionListener
{
   JButton B1, B2;
   JTextField Tx1, Tx2;
   JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9;
		
   public Exemplo13()
   {
      setTitle("Exemplo de uso das casas decimais");
      setSize(500,400);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("UTILIZAÇÃO DE DOUBLE COM CASAS DECIMAIS");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L2 = new JLabel("Calculo Sem Format");
      L2.setLocation(30,170);
      L2.setSize(200,20);

      L3 = new JLabel("");
      L3.setLocation(230,170);
      L3.setSize(130,20);
      L3.setFont(new Font("Serif", Font.BOLD, 16));

      L4 = new JLabel("Calculo Com Format");
      L4.setLocation(30,210);
      L4.setSize(200,20);

      L5 = new JLabel("");
      L5.setLocation(230,210);
      L5.setSize(130,20);
      L5.setFont(new Font("Serif", Font.BOLD, 16));

      L6 = new JLabel("Calculo Com Format");
      L6.setLocation(30,250);
      L6.setSize(200,20);

      L7 = new JLabel("");
      L7.setLocation(230,250);
      L7.setSize(130,20);
      L7.setFont(new Font("Serif", Font.BOLD, 16));

      L8 = new JLabel("Numero 1:");
      L8.setLocation(30,80);
      L8.setSize(60,20);

      Tx1 = new JTextField("");
      Tx1.setSize(70,25);
      Tx1.setLocation(100,80);
      Tx1.setFont(new Font("Serif", Font.BOLD, 16));
	
      L9 = new JLabel("Numero 2:");
      L9.setLocation(190,80);
      L9.setSize(60,20);

      Tx2 = new JTextField("");
      Tx2.setSize(70,25);
      Tx2.setLocation(260,80);	
      Tx2.setFont(new Font("Serif", Font.BOLD, 16));

      B1 = new JButton("Calcular");
      B1.setSize(100,40);
      B1.setLocation(110,300);
      B1.setBackground(new Color(150,220,255));
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 18));      
      B1.setBackground(new Color(150,220,255));

      B2 = new JButton("Sair");
      B2.setSize(100,40);
      B2.setLocation(300,300);
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
      getContentPane().add(L9);
      getContentPane().add(Tx1);
      getContentPane().add(Tx2);
      getContentPane().add(B1);
      getContentPane().add(B2);
			
   }
   public static void main (String arg[])
   {
      new Exemplo13().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      String Num1, Num2;
      double  Num3, Num5;
	double Num4;
      DecimalFormat d1 = new DecimalFormat("###,###.##");
      DecimalFormat d2 = new DecimalFormat("###,###.####");

      if (e.getSource() == B2)
         System.exit(0); 
      else
      {
          Num1 = Tx1.getText();
          Num2 = Tx2.getText();
          Num3 = Double.parseDouble(Num1) / Double.parseDouble(Num2);
          Num4 = Double.parseDouble(Num1) / Double.parseDouble(Num2);
          Num5 = Double.parseDouble(Num1) / Double.parseDouble(Num2);
          L3.setText(Double.toString(Num3));
          L5.setText(d1.format(Num4));
          L7.setText(d2.format(Num5));
         }
   }

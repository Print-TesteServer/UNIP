// Classe: Exemplo09.java
// SWING utilizando SENHA
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo09 extends JFrame  implements ActionListener
{
   JTextField Tx1;
   JLabel L1, L2, L3;
   JPasswordField Sx;
                
   int Vezes = 0;
		
   public Exemplo09()
   {
      setTitle("Exemplo utilizando Senha");
      //setSize(400,300);
      //setLocation(100,100);
      getContentPane().setBackground(Color.yellow);
      setExtendedState(JFrame.MAXIMIZED_BOTH);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
      L1 = new JLabel("Exemplo Utilizando SENHA");
      L1.setLocation(450,20);	
      L1.setSize(600,60);
      L1.setFont(new Font("Serif", Font.BOLD, 36));

      L2 = new JLabel("Nome: ");
      L2.setLocation(480,300);
      L2.setSize(100,30);
      L2.setFont(new Font("Serif", Font.BOLD, 24));

      Tx1 = new JTextField("");
      Tx1.setSize(280,30);
      Tx1.setLocation(580,300);
      Tx1.setFont(new Font("Serif", Font.BOLD, 24));

      L3 = new JLabel("Senha: ");
      L3.setLocation(480,380);
      L3.setSize(150,30);
      L3.setFont(new Font("Serif", Font.BOLD, 24));
		
      JPasswordField Sx = new JPasswordField();
      this.Sx = Sx ;
      Sx.setEchoChar('*');
      Sx.setSize(150,30);
      Sx.setLocation(580,380);
      Sx.addActionListener(this);
      Sx.setFont(new Font("Serif", Font.BOLD, 24));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(Tx1);
      getContentPane().add(Sx);

   }
   public static void main (String arg[])
   {
      new Exemplo09().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      Vezes = Vezes + 1;

      if((Tx1.getText().equals("Marcos")) && (Sx.getText().equals("Profes")))
         JOptionPane.showMessageDialog(null,Tx1.getText() + " VOCÊ ACERTOU A SENHA");
      else
      {
         if(Vezes == 3)
         {
            JOptionPane.showMessageDialog(null,"VOCÊ GASTOU SUAS 3 CHANCES ! TCHAAAAAUUUUU !");
  	        System.exit(0);
	     }
         else
	        JOptionPane.showMessageDialog(null,"SENHA ERRADA ! PRESTE ATENÇÃO E TENTE NOVAMENTE !");
      }
   }

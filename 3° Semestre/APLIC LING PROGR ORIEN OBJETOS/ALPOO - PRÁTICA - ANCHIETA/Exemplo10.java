// Classe: Exemplo10.java
// SWING com uso de cores
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo10 extends JFrame implements ActionListener {
   JButton B1;
   public Exemplo10() 
   {
      setTitle("USO DE CORES");
      setSize(500,400);
      setLocation(200,100);
      getContentPane().setBackground(Color.YELLOW);
      setBackground(Color.lightGray);
        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      B1 = new JButton("krikaki");
      B1.setSize(180,80);
      B1.setLocation(130,250);
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 24));

      getContentPane().setLayout(null);
      getContentPane().add(B1);
   }
   public void actionPerformed(ActionEvent e)
   {
      Color corAtual = B1.getBackground();
      Color NovaCor = JColorChooser.showDialog(Exemplo10.this, "Escolha a cor", corAtual);
      getContentPane().setBackground(NovaCor);
   }
   public static void main(String [] args)
   {
      new Exemplo10().setVisible(true);
   }
}


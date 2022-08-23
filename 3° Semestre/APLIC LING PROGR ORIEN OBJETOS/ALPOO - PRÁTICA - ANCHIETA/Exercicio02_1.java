import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

import javax.swing.*;

public class Exercicio02_1 extends Frame
{
	Button B1, B2;
	TextField Tx1;
          List Li;
	Label L1, L2, L3;

        static String ArrayNome[]  = new String[5];            
        static int    ArrayIdade[] = new int[5];
        static int    i = 0, j = 0;
		
	public Exercicio02_1()
	{
		setTitle("EXERCICIO 02");
		setResizable(false);
		setSize(400,300);
		setLocation(100,100);
		setBackground(Color.lightGray);
		setLayout(null);
		
		L1 = new Label("Exercício com Frame, Texto, Botões, List  e Array");
		L1.setLocation(50,50);
		L1.setSize(200,20);

		L2 = new Label("Nome: ");
		L2.setLocation(30,100);
		L2.setSize(50,20);

		L3 = new Label("Idade: ");
		L3.setLocation(30,150);
		L3.setSize(50,20);

		Tx1 = new TextField("");
		Tx1.setSize(150,20);
		Tx1.setLocation(100,100);

                    Li = new List(5, false);        
                    Li.setLocation(100,150);
	          Li.setSize(100,50);              
                    Li.addItem("21");       
                    Li.addItem("22");
                    Li.addItem("23");
                    Li.addItem("24");   
                    Li.addItem("25");

		B1 = new Button("OK");
		B1.setSize(60,40);
		B1.setLocation(30,200);
		B1.setBackground(new Color(150,120,255));

		B2 = new Button("Sair");
		B2.setSize(60,40);
		B2.setLocation(210,200);
		B2.setBackground(new Color(150,120,255));
		
		add(L1);  		
                    add(L2);  
                    add(L3);  
                    add(B1);  
		add(B2); 
		add(Tx1);
		add(Li);

                   ButtonHandler handler = new ButtonHandler();
                   B1.addActionListener(handler);
                   B2.addActionListener(handler);			
	}
	public static void main (String arg[])
	{
		new Exercicio02_1().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
                    String Nome;
                    int    Idade;

                    if (e.getActionCommand() == "Sair")
                    {
                        for(int k = 0;k < 5;k++)
                        {
                           Nome = ArrayNome[k];
                           JOptionPane.showMessageDialog(null,"Nome: " + Nome + "\nIdade: " + ArrayIdade[k],
                              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
                        }
                        JOptionPane.showMessageDialog(null,"JA MOSTREI TODOS, ESTOI ENCERRANDO !",
                           "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    else
                    {
                        if (i < 5)
                        {
                           ArrayNome[i] = Tx1.getText();
                           ArrayIdade[i] = Integer.parseInt(Li.getSelectedItem());
                           i = i + 1;
 	                   Tx1.setText("");
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null,"O ARRAY ESTÁ CHEIO",
                              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
                       }     
                    }
                }
        }
}
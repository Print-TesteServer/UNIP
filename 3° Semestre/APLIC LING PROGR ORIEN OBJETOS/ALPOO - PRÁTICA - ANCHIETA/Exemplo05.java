// Classe: Exemplo05.java
// Utiluização de TextArea
// Autore: Marcos Antonio / Marcos Junior
// Data: Agosto/2021 

import java.awt.*;
import java.awt.event.*;

public class Exemplo05 extends Frame
{
	Button B1;
	Button B2;
	TextArea Ta1;
                TextArea Ta2;
                TextArea Ta3;		
                Label L1;
                Scrollbar sb;
	public Exemplo05()
	{
		setTitle("Uso de TextArea");
		setResizable(false);
		setSize(400,300);
		setLocation(100,100);
		setBackground(Color.yellow);
		setLayout(null);
		
		L1 = new Label("EXEMPLO USANDO DUAS TEXTAREA");
		L1.setLocation(50,50);
		L1.setSize(250,20);
	
		Ta1 = new TextArea("Digite um Texto", 5, 40,1);
		Ta1.setBounds(50,80,150,50);
		Ta2 = new TextArea("Digite um Texto", 5, 40,1);
		Ta2.setBounds(210,80,150,50);
		Ta3 = new TextArea("Digite um Texto", 5, 80,1);
		Ta3.setBounds(80,150,250,50);

		B1 = new Button("OK");
		B1.setSize(80,30);
		B1.setLocation(50,230);
		B1.setBackground(new Color(150,220,255));

		B2 = new Button("sair");
		B2.setSize(80,30);
		B2.setLocation(140,230);
		B2.setBackground(new Color(150,220,255));
		
		add(L1); 		
                add(B1);  
		add(B2); 
		add(Ta1);
		add(Ta2);
		add(Ta3);

                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
			
	}
	public static void main (String arg[])
	{
		new Exemplo05().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {

                        if (e.getActionCommand() == "sair")
                                System.exit(0); 
                        else
                        {
                            Ta2.setText("Linha 1 de texto");
			    for(int i=2;i <= 5;i++)
                              Ta2.append("\nLinha " + i +" de texto");	
                            Ta3.setText(Ta1.getText() + "\n" + Ta2.getText());                           
                        }

                }
        }   

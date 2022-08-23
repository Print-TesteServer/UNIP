// Classe: Exemplo06.java
// Exemplos de listas de seleção
//Autor: Marcos Antonio / Marcos Junior
// Data: Agosto/2021

import java.awt.*;
import java.awt.event.*;

public class Exemplo06 extends Frame 
{
	Button B1;
	Button B2;
	List Li;
                Choice Ch;
                CheckboxGroup Cbg;
                Checkbox Cb1, Cb2, Cb3;
                Label L1, L2, L3, L4, L5;

	public Exemplo06()
	{
		setTitle("Uso de Listas de Seleção");
		setResizable(false);
		setSize(400,300);
		setLocation(100,100);
		setBackground(Color.yellow);
		setLayout(null);
		
		L1 = new Label("EXEMPLOS DE LISTAS DE SELEÇÃO");
		L1.setLocation(20,50);
		L1.setSize(250,20);

		L2 = new Label("RESULTADO:");
		L2.setLocation(20,80);
		L2.setSize(80,20);

		L3 = new Label("");
		L3.setLocation(105,80);
		L3.setSize(200,20);

		L4 = new Label("");
		L4.setLocation(105,100);
		L4.setSize(200,20);

		L5 = new Label("");
		L5.setLocation(105,120);
		L5.setSize(300,20);

                Li = new List(5, false);
		Li.setLocation(20,140);
		Li.setSize(100,50);
                Li.addItem("Atletico");
                Li.addItem("Palmeiras");
                Li.addItem("Internacional");
                Li.addItem("Flamengo");
                Li.addItem("Corinthians");

                Ch = new Choice();
		Ch.setLocation(140,140);
		Ch.setSize(100,25);
                Ch.addItem("Atletico");
                Ch.addItem("Palmeiras");
                Ch.addItem("Internacional");
                Ch.addItem("Flamengo");
                Ch.addItem("Corinthians");

                Cbg = new CheckboxGroup();

	        Cb1 = new Checkbox("2015",Cbg,false);
		Cb1.setLocation(270,140);
		Cb1.setSize(60,25);
	        Cb2 = new Checkbox("2016",Cbg,false);
		Cb2.setLocation(270,170);
		Cb2.setSize(60,25);
	        Cb3 = new Checkbox("2017",Cbg,true);
		Cb3.setLocation(270,195);
		Cb3.setSize(60,25);

		B1 = new Button("OK");
		B1.setSize(80,30);
		B1.setLocation(50,230);
		B1.setBackground(new Color(150,220,255));

		B2 = new Button("sair");
		B2.setSize(80,30);
		B2.setLocation(140,230);
		B2.setBackground(new Color(150,220,255));
		
		add(L1); 		
		add(L2); 		
		add(L3); 		
		add(L4); 		
		add(L5); 		
                add(B1);  
		add(B2); 
		add(Li);
		add(Ch);
		add(Cb1);
		add(Cb2);
		add(Cb3);

                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
	}
	public static void main (String arg[])
	{
		new Exemplo06().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {

                        if (e.getActionCommand() == "sair")
                            System.exit(0); 
                        else
                        {
                            L3.setText("Campeão: " + Li.getSelectedItem());   
                            L4.setText("Vice-Campeão: " + Ch.getSelectedItem());   
                            if(Cbg.getSelectedCheckbox() == Cb1)
                               L5.setText("ANO: 2007");
                            else
                               if(Cbg.getSelectedCheckbox() == Cb2)
                                  L5.setText("ANO: 2008");
                               else
                                  L5.setText("ANO: 2009");
                        }

                }
        }   

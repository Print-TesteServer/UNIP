// Classe Exemplo04.java
// Exemplo do uso de Painel com Botões dentro do frame
//Autor: Marcos Antonio / Marcos Junior
// Data: Agosto/2021

import java.awt.*;
import java.awt.event.*;

public class Exemplo04 extends Frame 
{
	
        Button B1,B2,B3,B4,B5,B6,B7,B8;
        Button B9,B0,B11,B12,B13,B14,B15,B16;
        Label L1,L2;
        Panel P1 ;     

        String Nr1="", Nr2="";
        double Nr;
        double   Result;
        int Oper = 0;        

	public Exemplo04()
	{
		
		setSize(200,280);
		setLocation(150,150);
		setTitle("Calculadora");
		setBackground(Color.white);
		setLayout(null);
	
		P1 =new Panel();
		P1.setSize(195,180);
		P1.setLocation(5,50);
		P1.setLayout(new GridLayout(4,4,2,2));

		B1 = new Button("1");
		B1.setBackground(Color.lightGray);

		B2 = new Button("2");
		B2.setBackground(Color.lightGray);

		B3 = new Button("3");
		B3.setBackground(Color.lightGray);

		B4 = new Button("4");
		B4.setBackground(Color.lightGray);

		B5 = new Button("5");
		B5.setBackground(Color.lightGray);

		B6 = new Button("6");
		B6.setBackground(Color.lightGray);

		B7 = new Button("7");
		B7.setBackground(Color.lightGray);

		B8 = new Button("8");
		B8.setBackground(Color.lightGray);

		B9 = new Button("9");
		B9.setBackground(Color.lightGray);

		B0 = new Button("0");
		B0.setBackground(Color.lightGray);

		B11 = new Button("Soma");
		B11.setBackground(Color.white);

		B12 = new Button("Subt.");
		B12.setBackground(Color.white);

		B13 = new Button("Mult");
		B13.setBackground(Color.white);

		B14 = new Button("Div");
		B14.setBackground(Color.white);

		B15 = new Button("Raiz 2");
		B15.setBackground(Color.white);

		B16 = new Button("=");
		B16.setBackground(Color.orange);

		L1 = new Label("RESULTADO:");
		L1.setLocation(10,230);
		L1.setSize(80,50);

		L2 = new Label("");
		L2.setLocation(90,230);
		L2.setSize(80,50);


		
		P1.add(B1);
		P1.add(B2);
		P1.add(B3);
		P1.add(B4);
		P1.add(B5);
		P1.add(B6);
		P1.add(B7);
		P1.add(B8);
		P1.add(B9);
		P1.add(B0);
		P1.add(B11);
		P1.add(B12);
		P1.add(B13);
		P1.add(B14);
		P1.add(B15);
		P1.add(B16);

		add(P1);

		add(L1);
		add(L2);

	
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
                B3.addActionListener(handler);
                B4.addActionListener(handler);
                B5.addActionListener(handler);
                B6.addActionListener(handler);
                B7.addActionListener(handler);
                B8.addActionListener(handler);
                B9.addActionListener(handler);
                B0.addActionListener(handler);
                B11.addActionListener(handler);
                B12.addActionListener(handler);
                B13.addActionListener(handler);
                B14.addActionListener(handler);
                B15.addActionListener(handler);
                B16.addActionListener(handler);
	}

	public static void main(String arg[])
	{
		new Exemplo04().setVisible(true);
	}

        public boolean handleEvent(Event e)
        {
           if (e.id == Event.WINDOW_DESTROY) 
              System.exit(0);                
           return (super.handleEvent(e));    
                                             
        }

        // Classe interna para tratamento de evento de botões
        
        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
                   if ((e.getActionCommand() == "1") && (Oper == 0))
                      Nr1 = Nr1 + "1";
                   else if ((e.getActionCommand() == "2") && (Oper == 0))
                      Nr1 = Nr1 + "2";
                   else if ((e.getActionCommand() == "3") && (Oper == 0))
                      Nr1 = Nr1 + "3";
                   else if ((e.getActionCommand() == "4") && (Oper == 0))
                      Nr1 = Nr1 + "4";
                   else if ((e.getActionCommand() == "5") && (Oper == 0))
                      Nr1 = Nr1 + "5";
                   else if ((e.getActionCommand() == "6") && (Oper == 0))
                      Nr1 = Nr1 + "6";
                   else if ((e.getActionCommand() == "7") && (Oper == 0))
                      Nr1 = Nr1 + "7";
                   else if ((e.getActionCommand() == "8") && (Oper == 0))
                      Nr1 = Nr1 + "8";
                   else if ((e.getActionCommand() == "9") && (Oper == 0))
                      Nr1 = Nr1 + "9";
                   else if ((e.getActionCommand() == "0") && (Oper == 0))
                      Nr1 = Nr1 + "0";

                   else if ((e.getActionCommand() == "1") && (Oper != 0))
                      Nr2 = Nr2 + "1";
                   else if ((e.getActionCommand() == "2") && (Oper != 0))
                      Nr2 = Nr2 + "2";
                   else if ((e.getActionCommand() == "3") && (Oper != 0))
                      Nr2 = Nr2 + "3";
                   else if ((e.getActionCommand() == "4") && (Oper != 0))
                      Nr2 = Nr2 + "4";
                   else if ((e.getActionCommand() == "5") && (Oper != 0))
                      Nr2 = Nr2 + "5";
                   else if ((e.getActionCommand() == "6") && (Oper != 0))
                      Nr2 = Nr2 + "6";
                   else if ((e.getActionCommand() == "7") && (Oper != 0))
                      Nr2 = Nr2 + "7";
                   else if ((e.getActionCommand() == "8") && (Oper != 0))
                      Nr2 = Nr2 + "8";
                   else if ((e.getActionCommand() == "9") && (Oper != 0))
                      Nr2 = Nr2 + "9";
                   else if ((e.getActionCommand() == "0") && (Oper != 0))
                      Nr2 = Nr2 + "0";

                   else if (e.getActionCommand() == "Soma")
                         Oper = 1;
                   else if (e.getActionCommand() == "Subt.")
                         Oper = 2;
                   else if (e.getActionCommand() == "Mult")
                         Oper = 3;
                   else if (e.getActionCommand() == "Div")
                         Oper = 4;
                   else if (e.getActionCommand() == "Raiz 2")
                         Oper = 5;

                   else if (e.getActionCommand() == "=")
                      {
                         if(Oper == 1)
                            Result = Double.parseDouble(Nr1) + Double.parseDouble(Nr2);
                         else if(Oper == 2)
                            Result = Double.parseDouble(Nr1) - Double.parseDouble(Nr2);
                         if(Oper == 3)
                            Result = Double.parseDouble(Nr1) * Double.parseDouble(Nr2);
                         if(Oper == 4)
                            Result = (Double.parseDouble(Nr1) / Double.parseDouble(Nr2));
                         if(Oper == 5)
                            {
                            Nr = Double.parseDouble(Nr1);
                            Result = Math.sqrt(Nr);
                            }
 	                 L2.setText(Double.toString(Result));
                         Nr1 = "";
                         Nr2 = "";
                         Oper = 0;
                      }
                }

        }
	

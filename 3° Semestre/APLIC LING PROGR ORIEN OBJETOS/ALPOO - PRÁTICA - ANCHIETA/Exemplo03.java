// Classe: Exemplo03.java
/* Exemplo de criação de frame usando Dimension
   Labels, Textos e botões */
// Autor: Marcos Antonio / Marcos Junior
// Data: Agosto/2021 

import java.awt.*;
import java.awt.event.*;

public class Exemplo03 extends Frame
{
		Dimension dim1, dim2, dim3 ;
		Button B1;
		Button B2;
		TextField Tx1 ;
		TextField Tx2 ;
		Label L1, L2, L3;
		
	public Exemplo03()
	{
		Dimension dim1 = new Dimension(500,400);
		Dimension dim2 = new Dimension(140,20);
		Dimension dim3 = new Dimension(80,40);
		setTitle("Uso da classe Dimension");
		setResizable(false);
		setSize(dim1);
		setLocation(100,100);
		setBackground(Color.lightGray);

		/* Este próximo comando vai obrigar a definir 
		   o tamanho e a posição de cada objeto dentro do frame */
		setLayout(null);
		
		L1 = new Label("Esta é uma classe visual");
		L1.setLocation(50,50);
		L1.setSize(dim2);

		L2 = new Label("RESULTADO");
		L2.setLocation(240,110);
		L2.setSize(dim2);

		L3 = new Label("");
		L3.setLocation(260,140);
		L3.setSize(dim2);
		
		Tx1 = new TextField("Digite um Numero aqui:");
		Tx1.setSize(dim2);
		Tx1.setLocation(50,100);

                Tx2 = new TextField("Digite outro Numero aqui:");
		Tx2.setSize(dim2);
		Tx2.setLocation(50,150);		
		
		B1 = new Button("somar");
		B1.setSize(dim3);
		B1.setLocation(50,200);
		B1.setBackground(new Color(150,220,255));

		B2 = new Button("sair");
		B2.setSize(dim3);
		B2.setLocation(140,200);
		B2.setBackground(new Color(150,220,255));
		
		add(L1);  // Os objetos têm que ser adicionados ao Frame		
                add(L2);  
                add(L3);  
                add(B1);  
		add(B2); 
		add(Tx1);
		add(Tx2);

                // Mostra para o ouvidor quem vai ser ouvido
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
			
	}
	public static void main (String arg[])
	{
		new Exemplo03().setVisible(true);
	}

        // Classe interna para ouvir e tratar o evento (botões)        
        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
                        String Num1, Num2;
                        double  Num3;

                        if (e.getActionCommand() == "sair")
                                System.exit(0); 
                        else
                        {
                                Num1 = Tx1.getText();
                                Num2 = Tx2.getText();
                                Num3 = Double.parseDouble(Num1) + Double.parseDouble(Num2);
 	                        L3.setText(Double.toString(Num3));
                        }

                }
        }
}
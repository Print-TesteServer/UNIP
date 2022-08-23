// Classe: Exemplo07.java
// Exemplo de utilização de Menu
// Autor: Marcos Antonio Marcos Junior
// Data: Agosto/2021 

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Exemplo07 extends Frame implements ActionListener
{
                MenuBar bMenu;
                Menu menu1, menu2;
                MenuItem m1, m2, m3, m4, m5, m6, m7;

	public Exemplo07()
	{
	      setTitle("Utilização de Menu");
	      setResizable(false);
	      setSize(400,300);
	      setLocation(100,100);
	      setBackground(Color.yellow);
	      setLayout(null);

                menu1 = new Menu("Arquivo");
                m1 = new MenuItem("Abrir");
                m1.addActionListener(this);
                m2 = new MenuItem("Fechar");
                m2.addActionListener(this);
                m3 = new MenuItem("Salvar");
                m3.addActionListener(this);
                m4 = new MenuItem("Salvar Como...");
                m4.addActionListener(this);
                menu1.add(m1);
                menu1.add(m2);
                menu1.add(m3);
                menu1.addSeparator();
                menu1.add(m4);

                menu2 = new Menu("Editar");
                m5 = new MenuItem("Copiar");
                m5.addActionListener(this);
                m6 = new MenuItem("Colar");
                m6.addActionListener(this);
                m7 = new MenuItem("Colar Especial");
                m7.addActionListener(this);
                menu2.add(m5);
                menu2.add(m6);
                menu2.addSeparator();
                menu2.add(m7);

	        bMenu = new MenuBar();
	        bMenu.add(menu1);
	        bMenu.add(menu2);

	        setMenuBar(bMenu);

	}
          public boolean handleEvent(Event e)
          {
             if (e.id == Event.WINDOW_DESTROY) 
                System.exit(0);           
                return (super.handleEvent(e));
          }

	public void actionPerformed(ActionEvent e)
	{
                String evento;
		
                if( e.getSource() == m1 )
                    evento = "Abrir";
                else if( e.getSource() == m2 )
                     evento = "Fechar";
                else if( e.getSource() == m3 )
                    evento = "Salvar";
                else if( e.getSource() == m4 )
                    evento = "Salvar Como...";
                else if( e.getSource() == m5 )
                    evento = "Copiar";
                else if( e.getSource() == m6 )
                    evento = "Colar";
                else
                    evento = "Colar Especial";
                JOptionPane.showMessageDialog(null, evento, "ATENÇÃO",
                   JOptionPane.INFORMATION_MESSAGE);
	}
          public static void main(String arg[])
	{
		new Exemplo07().setVisible(true);
	}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio04_1 extends JFrame implements ActionListener {
	JMenuBar bMenu;
	JMenu menu1, menu2, menu3;  
	JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9;

	public Exercicio04_1()
	{
		setTitle("Sistema Atendimento aos Hospedes");
        setResizable(false);
        setSize(500,500);
        setLocation(200,150);
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menu1 = new JMenu("CADASTRAR");
        m1 = new JMenuItem("Incluir");
        m1.addActionListener(this);
        m2 = new JMenuItem("Alterar");
        m2.addActionListener(this);
        m3 = new JMenuItem("Excluir");
        m3.addActionListener(this);
        menu1.add(m1);
        menu1.add(m2);
        menu1.add(m3);
        
        menu2 = new JMenu("PESQUISAR");
        m4 = new JMenuItem("A Praia mais Próxima");
        m4.addActionListener(this);
        m5 = new JMenuItem("A Praia mais Distante");
        m5.addActionListener(this);
        m6 = new JMenuItem("A Praia melhor Avaliada");
        m6.addActionListener(this);
        m7 = new JMenuItem("As Praias por Distancia");  
        m7.addActionListener(this);
        m8 = new JMenuItem("As Praias por Avaliação");  
        m8.addActionListener(this);
        menu2.add(m4);
        menu2.add(m5);
        menu2.add(m6);
        menu2.addSeparator();
        menu2.add(m7);
        menu2.add(m8);
                
        menu3 = new JMenu("SAIR");
        m9 = new JMenuItem("Sair");
        m9.addActionListener(this);
        menu3.add(m9);
                
        bMenu = new JMenuBar();
        bMenu.add(menu1);
        bMenu.add(menu2);
        bMenu.add(menu3);
        setJMenuBar(bMenu);
	}
	
	public static void main (String arg[])
    {
        new Exercicio04_1().setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e)
    {
		String evento="";
        if(e.getSource() == m9)
        	System.exit(0);
        else
        {
        	if(e.getSource() == m1)
            {
        		Exercicio04_1inc obj = new Exercicio04_1inc();
        		obj.setVisible(true);
            }
        	// Criar as demais telas
        }
    }
}
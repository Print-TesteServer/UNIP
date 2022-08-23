import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Exercicio05_1 extends JFrame implements ActionListener {
	JMenuBar bMenu;
	JMenu menu1, menu2, menu3;
	JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9;
	static String[][] mat = new String[10][5];
	static int i = 1, j = 0;

	public Exercicio05_1() {
		setTitle("Aplicativo Para Cadastramento de Funcionários");
		setResizable(false);
		setSize(500,400);
		setLocation(200,100);
		getContentPane().setBackground(Color.green);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menu1 = new JMenu("CADASTRAR");
		m1 = new JMenuItem("Incluir Funcionário");
		m1.addActionListener(this);
		m2 = new JMenuItem("Alterar Funcionário");
		m2.addActionListener(this);
		m3 = new JMenuItem("Excluir Funcionário");
		m3.addActionListener(this);
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(m3);
		
		menu2 = new JMenu("CONSULTAR");
		m4 = new JMenuItem("Funcionário");
		m4.addActionListener(this);
		m5 = new JMenuItem("Gerentes");
		m5.addActionListener(this);
		m6 = new JMenuItem("CLTs");
		m6.addActionListener(this);
		m7 = new JMenuItem("PJs");
		m7.addActionListener(this);
		m8 = new JMenuItem("Estagiários");
		m8.addActionListener(this);
		menu2.add(m4);  
		menu2.add(m5);  
		menu2.add(m6);
        menu2.add(m7);  
        menu2.addSeparator();
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

	public static void main (String arg[]) {
		new Exercicio05_1().setVisible(true);
    }

	public void actionPerformed(ActionEvent e)
    {
		String evento="";
		if( e.getSource() == m9)
			System.exit(0);
		else if( e.getSource() == m1 ) {
			// incluir funcionario
			Exercicio05_1inc obj = new Exercicio05_1inc();
			obj.setVisible(true); 
    	}
		else if( e.getSource() == m2 ) {
			// Alterar funcionario
		}
		else if( e.getSource() == m3 ) {
			// Excluir funcionario
		}
    }     
}
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Exercicio03_1 extends Frame implements ActionListener
{
	MenuBar bMenu;
	Menu menu1, menu2, menu3;
	MenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
	
	public Exercicio03_1()
	{
		setTitle("Exercicio com utilizacao de Menu");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		setBackground(Color.yellow);
		setLayout(null);
		
		menu1 = new Menu("Cadastrar");
		m1 = new MenuItem("Curso");
		m1.addActionListener(this);
		m2 = new MenuItem("Disciplina");
		m2.addActionListener(this);
		m3 = new MenuItem("Aluno");
		m3.addActionListener(this);
		m4 = new MenuItem("Professor");
		m4.addActionListener(this);
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(m3);
		menu1.add(m4);
		
		menu2 = new Menu("Mostrar");
		m5 = new MenuItem("Cursos");
		m5.addActionListener(this);
		m6 = new MenuItem("Disciplinas");
		m6.addActionListener(this);
		m7 = new MenuItem("Alunos");
		m7.addActionListener(this);
		m8 = new MenuItem("Professores");
		m8.addActionListener(this);
		m9 = new MenuItem("Cursos/Professores");
		m9.addActionListener(this);
		m10 = new MenuItem("Cursos/Disciplinas");
		m10.addActionListener(this);
		m11 = new MenuItem("Professores/Disciplinas");
		m11.addActionListener(this);
		menu2.add(m5);
		menu2.add(m6);
		menu2.add(m7);
		menu2.add(m8);
		menu2.addSeparator();
		menu2.add(m9);
		menu2.add(m10);
		menu2.add(m11);
		
		menu3 = new Menu("Sair");
		m12 = new MenuItem("Sair");
		m12.addActionListener(this);
		menu3.add(m12);
		
		bMenu = new MenuBar();
		bMenu.add(menu1);
		bMenu.add(menu2);
		bMenu.add(menu3);
		setMenuBar(bMenu);
	}
	
	public static void main(String arg[])
	{
		new Exercicio03_1().setVisible(true);
	}
	
	public boolean handleEvent(Event e)
	{
		if(e.id == Event.WINDOW_DESTROY)
			System.exit(0);
		
		return (super.handleEvent(e));
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String evento = "";
		if(e.getSource() == m12)
			System.exit(0);
		else 
		{
			if(e.getSource() == m1)
			{
				evento = "Cadastrar curso";
				JOptionPane.showMessageDialog(null,
						evento + "?",
						"Click menu",
						JOptionPane.QUESTION_MESSAGE);
			}
			else if(e.getSource() == m2) 
			{
				evento = "Cadastrar Disciplina";
				JOptionPane.showMessageDialog(null,
						evento,
						"Click menu",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}
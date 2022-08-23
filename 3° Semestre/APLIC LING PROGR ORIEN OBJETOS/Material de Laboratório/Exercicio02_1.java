import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Exercicio02_1 extends Frame {
	private static final long serialVersionUID = 1L;
	Button btnOk, btnSair;
	TextField txtNome;
	List lstIdade;
	Label l1, l2, l3;
	
	static String arrayNome[] = new String[5];
	static int arrayIdade[] = new int[5];
	
	static int i = 0;
	
	public Exercicio02_1() {
		setTitle("Exercicio 2");
		setResizable(false);
		setSize(400,300);
		setLocation(200, 200);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		l1 = new Label("Exercicio com Frame, Texto, Botoes, Lista e Array");
		l1.setLocation(50, 50);
		l1.setSize(300,20);
		
		l2 = new Label("Nome: ");
		l2.setLocation(30, 100);
		l2.setSize(50,20);
		
		l3 = new Label("Idade: ");
		l3.setLocation(30, 150);
		l3.setSize(50,20);
		
		txtNome = new TextField("");
		txtNome.setLocation(100, 100);
		txtNome.setSize(150,20);
		
		lstIdade = new List(5, false);
		lstIdade.setLocation(100, 150);
		lstIdade.setSize(100, 50);
		lstIdade.add("21");
		lstIdade.add("22");
		lstIdade.add("23");
		lstIdade.add("24");
		lstIdade.add("25");
		
		btnOk = new Button("Ok");
		btnOk.setLocation(30, 200);
		btnOk.setSize(60,40);
		btnOk.setBackground(new Color(150, 120, 255));
		
		btnSair = new Button("Sair");
		btnSair.setLocation(210, 200);
		btnSair.setSize(60,40);
		btnSair.setBackground(new Color(150, 120, 255));
				
		add(l1);
		add(l2);
		add(l3);
		add(txtNome);
		add(lstIdade);
		add(btnSair);
		add(btnOk);
		
		ButtonHandler handler = new ButtonHandler();
		btnOk.addActionListener(handler);
		btnSair.addActionListener(handler);
		
	}
	
	private class ButtonHandler implements ActionListener {
		String nome;
		int idade;
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "Sair") {
				for(int j=0; j<5; j++) {
					nome = arrayNome[j];
					idade = arrayIdade[j];
					JOptionPane.showMessageDialog(null, 
							"Nome: " + nome + "\nIdade: " + idade,
							"ATENCAO",
							JOptionPane.INFORMATION_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, 
						"Ja mostrei todos, estou encerrando!",
						"Bye",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			else {
				if(i < 5) {
					arrayNome[i] = txtNome.getText();
					arrayIdade[i] = Integer.parseInt(lstIdade.getSelectedItem());
					i++;
					txtNome.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"O array esta cheio!",
							"ATENCAO",
							JOptionPane.INFORMATION_MESSAGE);	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Exercicio02_1().setVisible(true);
	}
	
}

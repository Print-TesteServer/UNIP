import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class Exercicio06_1 extends JFrame implements ActionListener, ItemListener
{
   JButton B1, B2;
   JTextField Nome, End, Tel;
   ButtonGroup Bg;
   JRadioButton cat1, cat2, cat3;
   JPanel P1, P2;
   JLabel L1, L2, L3, L4;
   JComboBox moda;

    String nom, ende, tele, categ="";
		
   public Exercicio06_1()
   {
      setTitle("Tela de Inclusão dos Dados do Aluno");
      setSize(500,540);
      setLocation(80,50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      L1 = new JLabel("CADASTRAMENTO DE SÓCIOS");
      L1.setLocation(30,20);
      L1.setSize(490,20);
      L1.setFont(new Font("Serif", Font.BOLD, 22));

      L2 = new JLabel("Nome:");
      L2.setLocation(30,70);
      L2.setSize(70,20);

      Nome = new JTextField("");
      Nome.setSize(300,25);
      Nome.setLocation(110,70);

      L3 = new JLabel("Endereço:");
      L3.setLocation(30,120);
      L3.setSize(70,20);

      End = new JTextField("");
      End.setSize(300,25);
      End.setLocation(110,120);	
	
      L4 = new JLabel("Telefone:");
      L4.setLocation(30,170);
      L4.setSize(70,20);

      Tel = new JTextField("");
      Tel.setSize(170,25);
      Tel.setLocation(110,170);

      P1 = new JPanel();
      P1.setSize(440,250);
      P1.setLocation(20,50);
      P1.setBackground(new Color(238, 213, 183));
      P1.setBorder( BorderFactory.createTitledBorder("Dados Pessoais"));
      P1.setLayout(null);
      P1.add(L2);
      P1.add(Nome);
      P1.add(L3);
      P1.add(End);
      P1.add(L4);
      P1.add(Tel);

      moda = new JComboBox();
      moda.setSize(120,60);
      moda.setLocation(20,310);
      moda.setBorder( BorderFactory.createTitledBorder("Modalidade"));
      moda.addActionListener(this);
      moda.addItem(" ");
      moda.addItem("Atletismo");
      moda.addItem("Natação");
      moda.addItem("Futeból");
      moda.addItem("Voley");
      moda.addItem("Basquete");

      cat1 = new JRadioButton("Infantil", true);
      cat1.setLocation(0,30);
      cat1.setSize(80,20);
      cat1.addItemListener(this);
      cat1.setBackground(new Color(208,255,255));

      cat2 = new JRadioButton("Juvenil", false);
      cat2.setLocation(0,60);
      cat2.setSize(80,20);
      cat2.addItemListener(this);
      cat2.setBackground(new Color(208,255,255));

      cat3 = new JRadioButton("Adulto", false);
      cat3.setLocation(0,90);
      cat3.setSize(80,20);
      cat3.addItemListener(this);
      cat3.setBackground(new Color(208,255,255));

      Bg = new ButtonGroup();
      Bg.add(cat1);
      Bg.add(cat2);
      Bg.add(cat3);

      P2 = new JPanel();
      P2.setSize(200,110);
      P2.setLocation(260,320);
      P2.setBackground(new Color(176, 235, 235));
      P2.setBorder( BorderFactory.createTitledBorder("Categoria"));
      P2.setLayout(null);
      P2.add(cat1);
      P2.add(cat2);
      P2.add(cat3);

      B1 = new JButton("Cadastrar");
      B1.setSize(100,40);
      B1.setLocation(90,450);
      B1.setBackground(new Color(150,220,255));
      B1.addActionListener(this);
      B1.setFont(new Font("Serif", Font.BOLD, 18));      
      B1.setBackground(new Color(150,220,255));

      B2 = new JButton("Sair");
      B2.setSize(100,40);
      B2.setLocation(300,450);
      B2.setBackground(new Color(150,220,255));
      B2.addActionListener(this);
      B2.setFont(new Font("Serif", Font.BOLD, 18));      
      B2.setBackground(new Color(130,155,255));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(P1);
      getContentPane().add(P2);
      getContentPane().add(moda);
      getContentPane().add(B1);
      getContentPane().add(B2);
			
   }
   public static void main (String arg[])
   {
      new Exercicio06_1().setVisible(true);
   }

   public void itemStateChanged(ItemEvent e)
   {
      if(e.getSource()==cat1)
         categ = "Infantil";
      if(e.getSource()==cat2)
         categ = "Juvenil";
      if(e.getSource()==cat3)
         categ = "Adulto";
   }


   public void actionPerformed(ActionEvent e)
   {
       Object modal;

      if (e.getSource() == B2)
         System.exit(0); 
     else if (e.getSource() == B1)
     {
          nom = Nome.getText();
          ende = End.getText();
          tele = Tel.getText();
          modal = moda.getSelectedItem();

          JOptionPane.showMessageDialog(null,"Sócio Cadastrado"+
              "\nNome: " + nom+ "\nEndereço: " + ende +
              "\nTelefone: " + tele+"\nModalidade: " + modal +
              "\nCategoria: " + categ,
              "ATENCAO",JOptionPane.INFORMATION_MESSAGE);

     }
   }
}
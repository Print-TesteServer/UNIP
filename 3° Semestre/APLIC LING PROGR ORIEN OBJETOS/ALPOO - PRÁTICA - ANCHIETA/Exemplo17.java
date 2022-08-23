// Classe: Exemplo17.java
// Utilização de Banco de Dados MySQL
//Autor: Marcos Antonio / Marcos Junior
// Data: Setembro/2021

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.uti2.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;


public class Exemplo17 extends JFrame implements ActionListener

{
	private static Connection connection;
        JButton B1, B2, B3, B4, B22, B33;
	JTextField Tx1, Tx2, Tx3, Tx4;
	JLabel L1, L2, L3, L4, L5,L6, L7;
		
	public Exemplo17()
	{
		setTitle("MANUTENÇÃO DE PRODUTOS");
		setResizable(false);
		setSize(450,400);
		setLocation(100,100);
    	        setBackground(Color.lightGray);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		L1 = new JLabel("VINÍCULA PIRIRI - MANUTENÇÃO DE PRODUTOS");
		L1.setLocation(50,50);
		L1.setSize(350,20);
                L1.setFont(new Font("Serif", Font.BOLD, 14));

		L2 = new JLabel("Identificação:");
		L2.setLocation(50,80);
		L2.setSize(100,20);

		Tx1 = new JTextField("");
		Tx1.setSize(70,20);
		Tx1.setLocation(150,80);

		L3 = new JLabel("Nome do Vinho:");
		L3.setLocation(50,120);
		L3.setSize(100,20);
		
                Tx2 = new JTextField("");
		Tx2.setSize(200,20);
		Tx2.setLocation(150,120);		
		
		L4 = new JLabel("Cor do Vinho:");
		L4.setLocation(50,160);
		L4.setSize(100,20);
		
                Tx3 = new JTextField("");
		Tx3.setSize(100,20);
		Tx3.setLocation(150,160);		
		
		L5 = new JLabel("Preço do Vinho:");
		L5.setLocation(50,200);
		L5.setSize(100,20);
		
                Tx4 = new JTextField("");
		Tx4.setSize(120,20);
		Tx4.setLocation(150,200);		
		
		L6 = new JLabel("MENSAGEM:");
		L6.setLocation(50,260);
		L6.setSize(100,20);
		
		L7 = new JLabel("");
		L7.setLocation(140,260);
		L7.setSize(100,20);
		
		B1 = new JButton("Incluir");
		B1.setSize(80,40);
		B1.setLocation(50,300);
		B1.addActionListener(this);
		B1.setBackground(new Color(150,220,255));

		B2 = new JButton("Excluir");
		B2.setSize(80,40);
		B2.setLocation(140,300);
		B2.addActionListener(this);
		B2.setBackground(new Color(150,220,255));
		
		B22 = new JButton("Confirma");
		B22.setSize(80,40);
		B22.setLocation(140,300);
		B22.addActionListener(this);
		B22.setBackground(new Color(150,220,255));
		B22.setVisible(false);
		
		B3 = new JButton("Alterar");
		B3.setSize(80,40);
		B3.setLocation(230,300);
		B3.addActionListener(this);
		B3.setBackground(new Color(150,220,255));
		
                B33 = new JButton("Confirma");
		B33.setSize(80,40);
		B33.setLocation(230,300);
		B33.addActionListener(this);
		B33.setBackground(new Color(150,220,255));
                B33.setVisible(false);

		B4 = new JButton("Sair");
		B4.setSize(80,40);
		B4.setLocation(320,300);
		B4.addActionListener(this);
		B4.setBackground(new Color(150,220,255));

                getContentPane().setLayout(null);
	        getContentPane().add(L1);
	        getContentPane().add(L2);
	      	getContentPane().add(L3);
	        getContentPane().add(L4);
       		getContentPane().add(L5);
	        getContentPane().add(L6);
	        getContentPane().add(L7);
	        getContentPane().add(B1);
	        getContentPane().add(B2);
	        getContentPane().add(B22);
	        getContentPane().add(B3);
	        getContentPane().add(B33);
	        getContentPane().add(B4);
	        getContentPane().add(Tx1);
	        getContentPane().add(Tx2);
	        getContentPane().add(Tx3);
	        getContentPane().add(Tx4);
       
	}
	public static void FazConexao()
	{

	   System.out.println("Vai fazer a conexão");

		
		// O URL que especifica o banco de dados Produto ao qual 
		// esse programa se conecta, utilizando JDBC para conectar a um 
		// banco de dados Microsoft ODBC.
		// Carrega o driver para permitir conexão ao banco de dados
		try 
		{ 
		   Class.forName( "com.mysql.jdbc.Driver" ); 
   		   System.out.println("driver carregado com sucesso");

   		   connection = DriverManager.getConnection ( "jdbc:mysql://localhost/produto?user=root");
   		   System.out.println("conexão com sucesso");
		}
		catch ( ClassNotFoundException cnfex ) 
		{
		   System.err.println("FALHA NA CONEXÃO DO BANCO DE DADOS" ); 
  		   cnfex.printStackTrace(); 
		   System.exit( 1 ); 
		}
		catch ( SQLException sqlex ) 
		{
		   System.err.println( "BANCO DE DADOS NÃO DISPONIVEL" ); 
		   sqlex.printStackTrace( ); 
		} 
	}
	
	public void actionPerformed(ActionEvent e)
	{
    	Connection con = connection;
	if(e.getSource() == B4)
                System.exit(0);
        else if(e.getSource() == B1)
    	     {
               try 
               {            	  
                  Statement st = con.createStatement();
            	  st.executeUpdate("INSERT INTO PRODUTO VALUES ('"+ Tx1.getText()+"', '"+ Tx2.getText()+"', '"+ Tx3.getText() +"', '"+ Tx4.getText()+"')");
                  JOptionPane.showMessageDialog(null,"Vinho: " + Tx1.getText() + " Inserido com Sucesso",
                          "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                  Tx1.setText("");
                  Tx2.setText("");
                  Tx3.setText("");
                  Tx4.setText("");
               } 
               catch (SQLException sqlex)
               {
                  System.out.println("erro sql "+ sqlex);
                  sqlex.printStackTrace();
               }
            }
    	    else if(e.getSource() == B2)
    		 {
                    try 
                    {
                       String id = Tx1.getText();
                       int   idi = Integer.parseInt(id);
                       //String prec;
                       Statement st = con.createStatement();
                       ResultSet res = st.executeQuery("SELECT * FROM PRODUTO WHERE IDVINHO = " + idi);
                       if(res.next()) 
                       { 
            	          Tx2.setText(res.getString("NomeVinho"));
            	          Tx3.setText(res.getString("CorVinho"));
            	          Tx4.setText(res.getString("PrecoVinho"));
                          Tx2.disable();
                          Tx3.disable();
                          Tx4.disable();
            	          B22.setVisible(true);
            	          B2.setVisible(false);
                       }
                   }    
                   catch (SQLException sqlex)
                   {
                      System.out.println("erro sql "+ sqlex);
                      sqlex.printStackTrace();
                   }
               }
    	    else if(e.getSource() == B3)
            {
               try 
               {
                  String id = Tx1.getText();
                  int   idi = Integer.parseInt(id);
                  String prec;
                  Statement st = con.createStatement();
                  ResultSet res = st.executeQuery("SELECT * FROM PRODUTO WHERE IDVINHO = " + idi);
                  if(res.next()) 
                  { 
            	     Tx2.setText(res.getString("NomeVinho"));
                     Tx2.setFont(new Font("Arial Black", Font.BOLD, 13));
            	     Tx3.setText(res.getString("CorVinho"));
                     Tx3.setFont(new Font("Arial Black", Font.BOLD, 13));
            	     Tx4.setText(res.getString("PrecoVinho"));
                     Tx4.setFont(new Font("Arial Black", Font.BOLD, 13));
	             Tx2.enable();	      
	             Tx3.enable();	      
	             Tx4.enable();	      
            	     B3.setVisible(false);
            	     B33.setVisible(true);                       }
                  } 
               catch (SQLException sqlex)
               {
                  System.out.println("erro sql "+ sqlex);
                  sqlex.printStackTrace();
               }
            }   
     	       else if(e.getSource() == B22)
                    {
                       try 
                       {
                     	  String iddel = Tx1.getText();
                    	  int   iddeli = Integer.parseInt(iddel);
                          Statement st = con.createStatement();
                          st.executeUpdate("DELETE FROM PRODUTO WHERE IDVINHO = " + iddeli);
                          JOptionPane.showMessageDialog(null,"Vinho: " + Tx1.getText() + " Excluido com Sucesso",
                             "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                	  Tx1.setText("");
                	  Tx2.setText("");
                	  Tx3.setText("");
                	  Tx4.setText("");
                	  B22.setVisible(false);
                	  B2.setVisible(true);
                      }    
                      catch (SQLException sqlex)
                      {
                         System.out.println("erro sql "+ sqlex);
                         sqlex.printStackTrace();
                      }
                   }

              else if(e.getSource() == B33)
                   {
                      try 
                      {
                         String idalt = Tx1.getText();
                         double preco = Double.parseDouble(Tx4.getText()); 
                         int   idalti = Integer.parseInt(idalt);
                         Statement st = con.createStatement();
                         st.executeUpdate("UPDATE PRODUTO SET NomeVinho = '"+ Tx2.getText() +"',CorVinho = '"+ Tx3.getText() +"', PrecoVinho = "+ preco +" WHERE IDVINHO = " + idalt);                           
                         JOptionPane.showMessageDialog(null,"Vinho: " + Tx1.getText() + " Alterado com SUCESSO",
                            "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                         Tx1.setText("");
                         Tx2.setText("");
                         Tx3.setText("");
                         Tx4.setText("");
       	                 Tx2.enable();	      
	                 Tx3.enable();	      
	                 Tx4.enable();	      
                         B33.setVisible(false);
                         B3.setVisible(true);
                      } 
                      catch (SQLException sqlex)
                      {
                         JOptionPane.showMessageDialog(null,"Vinho: " + Tx1.getText() + " ERRO",
                            "SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                         System.out.println("erro sql "+ sqlex);
                         sqlex.printStackTrace();
                      }
                   }             	
 	}
                	
        public static void main (String arg[])
	{   	
		FazConexao();
		new Exemplo17().setVisible(true);
	}
}
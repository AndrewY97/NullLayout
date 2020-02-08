
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

class Formulario extends JFrame{
	ImageIcon iconobtn = new ImageIcon("C:\\Users\\yero9\\Pictures\\right.png");
	public Formulario(){
		getContentPane().setLayout(null); //layout nulo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario de Registro");
		setSize(600,450);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblTexto0 = new JLabel();
		lblTexto0.setText("The Classic Form includes all visible fields for this list");
		lblTexto0.setBounds(5,5,240,30);
		add(lblTexto0);
		
		JLabel lblTexto1 = new JLabel();
		lblTexto1.setText("Form Options");
		lblTexto1.setBounds(5,20,80,30);
		add(lblTexto1);
		
		JLabel lblTexto2 = new JLabel();
		lblTexto2.setText("Include the following");
		lblTexto2.setBounds(5,45,170,30);
		add(lblTexto2);
		
		JCheckBox checkbox1 = new JCheckBox("a title for your form");
		checkbox1.setBounds(5,70,170,30);
		add(checkbox1);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radio1 = new JRadioButton("Only required fields");
		bg.add(radio1);
		radio1.setBounds(5,100,170,30);
		add(radio1);
		JRadioButton radio2 = new JRadioButton("all fields");
		bg.add(radio2);
		radio2.setBounds(5,125,80,30);
		add(radio2);
		
		JLabel lblTexto3 = new JLabel();
		lblTexto3.setText("(edit required fields in the form builder)");
		lblTexto3.setBounds(20,145,240,30);
		add(lblTexto3);
		
		JCheckBox checkbox2 = new JCheckBox("interest group fields");
		checkbox2.setBounds(5,190,170,30);
		add(checkbox2);
		JCheckBox checkbox3 = new JCheckBox("required field indicators");
		checkbox3.setBounds(5,220,170,30);
		add(checkbox3);
		
		JLabel lblTexto4 = new JLabel();
		lblTexto4.setText("Set form width");
		lblTexto4.setBounds(5,250,130,30);
		add(lblTexto4);
		
		JTextField caja1 = new JTextField(10);
		caja1.setBounds(5, 280, 110, 20);
		add(caja1);
		
		JLabel lblTexto5 = new JLabel();
		lblTexto5.setText("Enhance your form");
		lblTexto5.setBounds(5,300,130,30);
		add(lblTexto5);
		
		JCheckBox checkbox4 = new JCheckBox("enable evil popup mode");
		checkbox4.setBounds(5,320,170,30);
		add(checkbox4);
		JCheckBox checkbox5 = new JCheckBox("disable all JavaScript");
		checkbox5.setBounds(5,340,170,30);
		add(checkbox5);
		JCheckBox checkbox6 = new JCheckBox("incluide archive link");
		checkbox6.setBounds(5,360,170,30);
		add(checkbox6);
		JCheckBox checkbox7 = new JCheckBox("include MonkeyRewards lind");
		checkbox7.setBounds(5,380,170,30);
		add(checkbox7);
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Preview"));
		panel1.setBounds(286,5,260,260);
		setPreferredSize(new Dimension(200,200));
		
			JLabel lblTexto7 = new JLabel();
			lblTexto7.setText("Email Address");
			lblTexto7.setBounds(210,35,120,30);
			panel1.add(lblTexto7);
			
			JFormattedTextField ftf = new JFormattedTextField ();
			ftf.setBounds(290, 65, 250, 20);
			add(ftf);
			
			JLabel lblTexto8 = new JLabel();
			lblTexto8.setText("First Name");
			lblTexto8.setBounds(290,85,120,30);
			add(lblTexto8);
			
			JTextField caja2 = new JTextField(10);
			caja2.setBounds(290, 115, 250, 20);
			add(caja2);
			
			JLabel lblTexto9 = new JLabel();
			lblTexto9.setText("Last Name");
			lblTexto9.setBounds(290,140,120,30);
			add(lblTexto9);
			
			JTextField caja3 = new JTextField(10);
			caja3.setBounds(290, 170, 250, 20);
			add(caja3);
			
			JButton btnSuscribe = new JButton("Suscribe");
			btnSuscribe.setIcon(iconobtn);
			btnSuscribe.setBounds(290,200,150,30);
			add(btnSuscribe);
			
		add(panel1); 
        	
		JLabel lblTexto10 = new JLabel();
		lblTexto10.setText("Copy/paste onto your site");
		lblTexto10.setBounds(290,260,170,30);
		add(lblTexto10);
		
		JTextArea areaTexto = new JTextArea("Escribe aqui...",10,10);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		areaTexto.setBounds(290,300,250,100);
		add(areaTexto);
		
		
	}
}
public class PruebaFormulario {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Formulario();
			}
		});
	}

}

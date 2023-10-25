package pract1;
import javax.swing.*;
import java.awt.event.*;

public class Graf1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public Graf1() {
		setTitle("Saludador");
		
		setBounds(400,300,400,250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		//creacion de la etiqueta
		
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		
		etiqueta.setBounds(100,30,200,20);
		
		contentPane.add(etiqueta);
		
		JTextField textField = new JTextField();
		
		textField.setBounds(50,80,300,30);

		contentPane.add(textField);
		
		JButton btn = new JButton("Saludar");
		
		btn.setBounds(150,130,100,30);
		
		
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola "+textField.getText()+"!");
			}
		});
		
		setVisible(true);
	}
}

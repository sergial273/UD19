package pract2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Peliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox<String> peliculasComboBox;
    private JTextField nuevaPeliculaTextField;
    private JButton agregarPeliculaButton;
    private JLabel texto1;
    private JLabel texto2;
    
    public Peliculas() {
        setTitle("Lista de Películas");
        setBounds(400,300,450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        peliculasComboBox = new JComboBox<>();
        nuevaPeliculaTextField = new JTextField(20);
        agregarPeliculaButton = new JButton("Añadir");
        texto1 = new JLabel("Escribe el titulo de una pelicula");
        texto2 = new JLabel("Peliculas");
        
        peliculasComboBox.addItem("Harry Potter");
        
        agregarPeliculaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevaPelicula = nuevaPeliculaTextField.getText();
                if (!nuevaPelicula.isEmpty()) {
                    peliculasComboBox.addItem(nuevaPelicula);
                    nuevaPeliculaTextField.setText("");
                }
            }
        });
        
        texto1.setBounds(40,30,180,30);
        add(texto1);
        
        nuevaPeliculaTextField.setBounds(30,70,200,30);
        add(nuevaPeliculaTextField);
        
        agregarPeliculaButton.setBounds(80,120,100,30);
        add(agregarPeliculaButton);
        
        
        texto2.setBounds(290,30,200,30);
        add(texto2);
        
        peliculasComboBox.setBounds(250,70,150,30);
        add(peliculasComboBox);
        
        
    }
    
}
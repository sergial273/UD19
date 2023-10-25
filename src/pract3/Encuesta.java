package pract3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JRadioButton windowsRadio, linuxRadio, macRadio;
    private JCheckBox programacionCheckBox, disenoGraficoCheckBox, administracionCheckBox;
    private JSlider horasSlider;
    private JButton submitButton;

    public Encuesta() {
        
        setTitle("Encuesta de Sistema Operativo");
        setBounds(400,300,500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        windowsRadio = new JRadioButton("Windows",true);
        linuxRadio = new JRadioButton("Linux");
        macRadio = new JRadioButton("Mac");
        ButtonGroup sistemaOperativoGroup = new ButtonGroup();
        sistemaOperativoGroup.add(windowsRadio);
        sistemaOperativoGroup.add(linuxRadio);
        sistemaOperativoGroup.add(macRadio);

        programacionCheckBox = new JCheckBox("Programación");
        disenoGraficoCheckBox = new JCheckBox("Diseño Gráfico");
        administracionCheckBox = new JCheckBox("Administración");

        horasSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        horasSlider.setMajorTickSpacing(2);
        horasSlider.setPaintTicks(true);
        horasSlider.setPaintLabels(true);

        submitButton = new JButton("Enviar");
        
        JLabel op = new JLabel("Sistema operativo:");
        op.setBounds(10,10,150,30);
        add(op);
        windowsRadio.setBounds(130,10,100,30);
        add(windowsRadio);
        linuxRadio.setBounds(230,10,100,30);
        add(linuxRadio);
        macRadio.setBounds(330,10,100,30);
        add(macRadio);
        
        JLabel esp = new JLabel("Especialidad:");
        esp.setBounds(10,40,150,30);
        add(esp);
        programacionCheckBox.setBounds(100,40,120,30);
        add(programacionCheckBox);
        disenoGraficoCheckBox.setBounds(230,40,120,30);
        add(disenoGraficoCheckBox);
        administracionCheckBox.setBounds(360,40,130,30);
        add(administracionCheckBox);
        
        JLabel hor = new JLabel("Horas dedicadas en el ordenador:");
        hor.setBounds(10,70,200,30);
        add(hor);
        horasSlider.setBounds(220,70,200,60);
        add(horasSlider);
        
        submitButton.setBounds(165,140,150,30);
        add(submitButton);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sistemaOperativo = "";
                if (windowsRadio.isSelected()) {
                    sistemaOperativo = "Windows";
                } else if (linuxRadio.isSelected()) {
                    sistemaOperativo = "Linux";
                } else if (macRadio.isSelected()) {
                    sistemaOperativo = "Mac";
                }

                StringBuilder especialidades = new StringBuilder();
                if (programacionCheckBox.isSelected()) {
                    especialidades.append("Programación, ");
                }
                if (disenoGraficoCheckBox.isSelected()) {
                    especialidades.append("Diseño Gráfico, ");
                }
                if (administracionCheckBox.isSelected()) {
                    especialidades.append("Administración, ");
                }

                int horasDedicadas = horasSlider.getValue();

                JOptionPane.showMessageDialog(null,
                        "Sistema Operativo: " + sistemaOperativo + "\n" +
                        "Especialidades: " + (especialidades.length() > 0 ? especialidades.toString().substring(0, especialidades.length() - 2) : "Ninguna") + "\n" +
                        "Horas Dedicadas: " + horasDedicadas,
                        "Resultados de la Encuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
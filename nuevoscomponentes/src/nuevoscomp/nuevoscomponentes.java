/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoscomp;

import javax.swing.*;

public class nuevoscomponentes extends JFrame {
    private String[] lista = {"Bueno", "Malo", "Regular"}; // arreglo para el JComboBox

    private JTextArea textArea = new JTextArea();
    private ButtonGroup botonGrupo1 = new ButtonGroup();
    private JRadioButton radio1 = new JRadioButton();
    private JRadioButton radio2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2 = new JCheckBox();
    private JComboBox combolista = new JComboBox(lista); // ComboBox con lista predeterminada

    public nuevoscomponentes() {
        setTitle("Copiar Pegar");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void AddComponentes(JPanel panel1) {
        // Área de texto
        textArea.setBounds(10, 20, 300, 100); // Coordenadas y tamaño del JTextArea
        panel1.add(textArea);

        // Radio buttons
        botonGrupo1.add(radio1);
        botonGrupo1.add(radio2);

        radio1.setBounds(10, 130, 80, 30);
        radio1.setText("Radio 1");
        panel1.add(radio1);

        radio2.setBounds(100, 130, 80, 30);
        radio2.setText("Radio 2");
        panel1.add(radio2);

        // Checkboxes
        check1.setBounds(10, 170, 100, 30);
        check1.setText("Check 1");
        panel1.add(check1);

        check2.setBounds(120, 170, 100, 30);
        check2.setText("Check 2");
        panel1.add(check2);

        // ComboBox
        combolista.setBounds(10, 210, 200, 30); // Coordenadas para el JComboBox
        combolista.addItem("Excelente"); // Añadimos un nuevo item al JComboBox
        panel1.add(combolista);
    }

    public static void main(String[] args) {
        nuevoscomponentes ventana = new nuevoscomponentes();

        JPanel panel1 = new JPanel(); // Panel para contener los componentes
        panel1.setLayout(null); // Layout nulo para posiciones personalizadas
        ventana.getContentPane().add(panel1); // Añadimos el panel al JFrame

        ventana.AddComponentes(panel1); // Llamamos al método para agregar los componentes al panel

        ventana.setVisible(true); // Mostramos la ventana
    }
}
